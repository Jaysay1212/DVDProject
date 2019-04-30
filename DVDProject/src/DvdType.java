import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DvdType {

	
	
	/**
	 * movie_name is the title of the movie
	 * movie_actor is the name of an actor in the movie
	 * movie_producer is the name of a producer for the movie
	 * movie_director is the name of a director for the movie
	 * movie_prodCompany is the name of a production company for the movie
	 * movie_copies is the total number of copies the store has (Whether checked out or in)
	 * copies_available is the number of copies the store has to check out
	 */
	private String movie_name;
	private String movie_actor;
	private String movie_producer;
	private String movie_director;
	private String movie_prodCompany;
	private int movie_copies;
	private int copies_available;

	
	/**
	 * Default Constructor with no fields.
	 */
	public DvdType() {

	}
	// ---------------

	/**
	 * Full constructor with all fields
	 * @param movie_name the title parameter
	 * @param movie_actor the actor parameter
	 * @param movie_producer the producer parameter
	 * @param movie_director the director parameter
	 * @param movie_prodCompany the production company parameter
	 * @param movie_copies the total copies parameter
	 * @param copies_available the rentable copies parameter
	 */
	public DvdType(String movie_name, String movie_actor, String movie_producer, String movie_director,
			String movie_prodCompany, int movie_copies, int copies_available) {
		super();
		this.movie_name = movie_name;
		this.movie_actor = movie_actor;
		this.movie_producer = movie_producer;
		this.movie_director = movie_director;
		this.movie_prodCompany = movie_prodCompany;
		this.movie_copies = movie_copies;
		this.copies_available = copies_available;
	}
	// ---------------

	//Setters
	/**
	 * 
	 * @param movie_name Setting the movie title
	 */
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	/**
	 * 
	 * @param movie_actor Setting the actor parameter
	 */
	public void setMovie_actor(String movie_actor) {
		this.movie_actor = movie_actor;
	}

	/**
	 * 
	 * @param movie_producer Setting the movie producer
	 */
	public void setMovie_producer(String movie_producer) {
		this.movie_producer = movie_producer;
	}

	/**
	 * 
	 * @param movie_director Setting the movie director
	 */
	public void setMovie_director(String movie_director) {
		this.movie_director = movie_director;
	}

	/**
	 * 
	 * @param movie_prodCompany Setting the production company
	 */
	public void setMovie_prodCompany(String movie_prodCompany) {
		this.movie_prodCompany = movie_prodCompany;
	}

	/**
	 * 
	 * @param movie_copies setting the total number of copies
	 */
	public void setMovie_copies(int movie_copies) {
		this.movie_copies = movie_copies;
	}
	
	/**
	 * 
	 * @param copies_available Setting the number of rentable copies
	 */
	public void setCopies_available(int copies_available) {
		this.copies_available = copies_available;
	}
	// ---------------

	// Getters
	/**
	 * 
	 * @return the movie name
	 */
	public String getMovie_name() {
		return movie_name;
	}

	/**
	 * 
	 * @return the actor name
	 */
	public String getMovie_actor() {
		return movie_actor;
	}

	/**
	 * 
	 * @return the producer name
	 */
	public String getMovie_producer() {
		return movie_producer;
	}

	/**
	 * 
	 * @return the director name
	 */
	public String getMovie_director() {
		return movie_director;
	}

	/**
	 * 
	 * @return the production company
	 */
	public String getMovie_prodCompany() {
		return movie_prodCompany;
	}

	/**
	 * 
	 * @return the total number of copies
	 */
	public int getMovie_copies() {
		return movie_copies;
	}
	
	/**
	 * 
	 * @return the number of rentable copies
	 */
	public int getCopies_available() {
		return copies_available;
	}
	// ---------------

	/**
	 * @return Each of the dvds, all of the information included into an ArrayList
	 * @throws FileNotFoundException if DvDs.txt is not found
	 * 
	 */
	public static ArrayList<DvdType> readDvDs() throws FileNotFoundException {
		// Read the file, create an an ArrayList of DVD objects.

		File fd = new File("DvDs.txt");
		Scanner Input = new Scanner(fd);
		ArrayList<DvdType> dvdList = new ArrayList<DvdType>();

		/// MAKE SURE THAT THIS is hasnext and not nextline, mhmk
		while (Input.hasNext()) {

			DvdType temp = new DvdType();
			temp.movie_name = Input.nextLine();
			temp.movie_actor = Input.nextLine();
			temp.movie_producer = Input.nextLine();
			temp.movie_director = Input.nextLine();
			temp.movie_prodCompany = Input.nextLine();
			temp.movie_copies = Input.nextInt();
			temp.copies_available = Input.nextInt();
			if (Input.hasNextLine()) {
				Input.nextLine();
			}
			dvdList.add(temp);
		}
		Input.close();

		System.out.println("DVDs have been read.\n");
		return dvdList;

	}

	/**
	 * Looks through the arraylist created by readDvDs and searches for a DvD title entered by the user.
	 * @throws FileNotFoundException
	 */
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

	/**
	 * Checks all dvds for a title, then returns number of copies the store can rent.
	 * Uses the same algorithm as the DVDLookup function.
	 * @throws FileNotFoundException if DvDs.txt is not found
	 */
	public static void CheckStock() throws FileNotFoundException {
		//could maybe call dvdlookup here but it doesnt seem right to do so.
		//copying code.
		
		ArrayList<DvdType> arr = DvdType.readDvDs();
		System.out.println("enter the title");
		Scanner userIn = new Scanner(System.in);
		String Choice = userIn.nextLine();
		userIn.close();

		boolean foundFlag = false;
		int copies = 0;

		for (int i = 0; i < arr.size(); i++) {

			String Title = ((arr.get(i).getMovie_name()));
			if ((Choice.equals(Title))) {
				if ((arr.get(i).getCopies_available())>0) {
					copies = arr.get(i).getCopies_available();
					foundFlag = true;
				}
			} else {
				foundFlag = false;
			}
		}
		if (foundFlag = true) {
			System.out.println("In Stock!");
			System.out.println("We have: "+copies+" copies Available for Rent.");
		} else {
			System.out.println("Not In Stock!!");
		}

		System.out.println("[STOCK]: DVDs have been looked through.");
		
	}
	
	
	// Printing all the DVDS
	/**
	 * Returns all of the DVDs and all of their information to the screen.
	 * @throws FileNotFoundException if DVDs.txt is not found.
	 */
	public static void printDvDs() throws FileNotFoundException {
		// DvdType t = new DvdType();
		ArrayList<DvdType> arr = DvdType.readDvDs();

		System.out.println("Number of DVDs: " + arr.size());
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		System.out.println("DVDs have been printed.\n");
	}

	//attempting on printing just the dvd title names - Cole
	//public static  void printTitles() throws FileNotFoundException{
	//	File fd = new File("DvDs.txt");
	//	Scanner Input = new Scanner(fd);


	// Printing only DVD titles
	/**
	 * Returns only the titles of all DVDs stored in DvDs.txt
	 * @throws FileNotFoundException if DvDs.txt is not found.
	 */
	public static void printTitles() throws FileNotFoundException {

		ArrayList<DvdType> arr = DvdType.readDvDs();
		System.out.println("DVD Titles:");

		
		//for(int i =0; i < arr.size();++i) {
			//System.out.println(movie_name);
			//System.out.println(arr.get(0))
		for (int i = 0; i < arr.size(); ++i) {
			System.out.println(arr.get(i).getMovie_name());

		}
		System.out.println("DVD Titles have been printed");
	}

	@Override
	public String toString() {
		return "\nTitle: " + movie_name + "\nActor: " + movie_actor + "\nProducer: " + movie_producer + "\nDirector: "
				+ movie_director + "\nProduction Company: " + movie_prodCompany + "\nCopies: " + movie_copies + "\nCopies Available: "+copies_available+"\n";
	}

}
