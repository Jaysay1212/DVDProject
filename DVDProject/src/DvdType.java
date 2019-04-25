import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DvdType {

	// Declarations:
	private String movie_name;
	private String movie_actor;
	private String movie_producer;
	private String movie_prodCompany;
	private int movie_copies;

	// Default Constructor
	public DvdType() {

	}
	// ---------------

	// Full Constructor
	public DvdType(String movie_name, String movie_actor, String movie_producer, String movie_prodCompany,
			int movie_copies) {
		super();
		this.movie_name = movie_name;
		this.movie_actor = movie_actor;
		this.movie_producer = movie_producer;
		this.movie_prodCompany = movie_prodCompany;
		this.movie_copies = movie_copies;
	}
	// ---------------

	// Setters
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	public void setMovie_actor(String movie_actor) {
		this.movie_actor = movie_actor;
	}

	public void setMovie_producer(String movie_producer) {
		this.movie_producer = movie_producer;
	}

	public void setMovie_prodCompany(String movie_prodCompany) {
		this.movie_prodCompany = movie_prodCompany;
	}

	public void setMovie_copies(int movie_copies) {
		this.movie_copies = movie_copies;
	}
	// ---------------

	// Getters
	public String getMovie_name() {
		return movie_name;
	}

	public String getMovie_actor() {
		return movie_actor;
	}

	public String getMovie_producer() {
		return movie_producer;
	}

	public String getMovie_prodCompany() {
		return movie_prodCompany;
	}

	public int getMovie_copies() {
		return movie_copies;
	}
	// ---------------

	public static ArrayList<DvdType> readDvDs() throws FileNotFoundException {
		// Read the file, create an an ArrayList of DVD objects.

		File fd = new File("DvDs.txt");
		Scanner Input = new Scanner(fd);
		ArrayList<DvdType> dvdList = new ArrayList<DvdType>();

		/// MAKE SURE THAT THIS ABSOLUT B.S is hasnext and not nextline, mhmk
		while (Input.hasNext()) {

			DvdType temp = new DvdType();
			temp.movie_name = Input.nextLine();
			temp.movie_actor = Input.nextLine();
			temp.movie_producer = Input.nextLine();
			temp.movie_prodCompany = Input.nextLine();
			temp.movie_copies = Input.nextInt();
			if (Input.hasNext()) {
				Input.nextLine();
			}
			dvdList.add(temp);
		}
		Input.close();

		System.out.println("DVDs have been read.\n");
		return dvdList;

	}

	public static void DVDLookup() throws FileNotFoundException {
		// Read the file, Prompt for the title, iterate through the list.
		ArrayList<DvdType> arr = DvdType.readDvDs();
		System.out.println("enter the title");
		Scanner userIn = new Scanner(System.in);
		String Choice = userIn.nextLine();
		userIn.close();

		boolean foundFlag = false;

		for (int i = 0; i < arr.size(); i++) {

			String Title = ((arr.get(i).getMovie_name()));
			if ((Choice.equals(Title))) {
				foundFlag = true;
			} else {
				foundFlag = false;
			}

		}
		if (foundFlag) {
			System.out.println("Found!");
		} else {
			System.out.println("Not Found!");
		}
		
		System.out.println("DVDs have been looked through");

	}

	public static void printDvDs() throws FileNotFoundException {
		// DvdType t = new DvdType();
		ArrayList<DvdType> arr = DvdType.readDvDs();

		System.out.println("Number of DVDs: " + arr.size());
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		System.out.println("DVDs have been printed.\n");
	}

	@Override
	public String toString() {
		return "\nTitle: " + movie_name + "\nActor: " + movie_actor + "\nProducer: " + movie_producer
				+ "\nProduction Company: " + movie_prodCompany + "\nCopies: " + movie_copies + "\n";
	}

}
