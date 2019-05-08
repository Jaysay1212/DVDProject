
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;



public class CustomerType extends Person {

	private int rentedDvds;
	private ArrayList<DvdType> rented;


	
	public CustomerType(int rentedDvds, ArrayList<DvdType> rented ) {
		super();
		
	}
	
	public CustomerType(int rentedDvds) {
		super();
		this.rentedDvds = rentedDvds;
		this.rented = rented;
	}

	public CustomerType(String name, int accountNum, int rentedDvds) {
		super(name, accountNum);

	}
		//default constructor
	public CustomerType() {
		// TODO Auto-generated constructor stub
	}

	public int getRentedDvds() {
		return rentedDvds;
	}

	public void setRentedDvds(int rentedDvds) {
		this.rentedDvds = rentedDvds;
	}

	public int displayAccountnum() {
		return getAccountNum();
	}
	
	
/*
	//Need method for Return a DVD; that is, delete the rented DVD from the list
	public void returnDVD(DvdType item) {
		for(int i = 0; i < rented.size(); ++i) {
			if(rented.get(i).getMovie_name() == item.getMovie_name()) {
				rented.remove(i);
			}
		}
	}	
	
		*/



	// Need method for Return a DVD; that is, delete the rented DVD from the list
	public static void returnDVD() throws FileNotFoundException, InterruptedException {

		ArrayList<CustomerType> Cust = CustomerType.readCustomers();
		ArrayList<DvdType> arr = DvdType.readDvDs();

		Scanner console = new Scanner(System.in);
		String returnDvd = "";

		System.out.println("What movie did you want to return?");
		returnDvd = console.next();

		for (int i = 0; i < arr.size(); ++i) {
			if (arr.get(i).getMovie_name() == returnDvd) {
				Cust.remove(i);

				//arr.add(getCopies_available(i));
			}
		}
		
	}
	
	/*
	//Need method for Rent a DVD; that is, add the rented DVD to the list
	public void rentDVD(DvdType item) {
		rented.add(item);
	}
	*/


	/*	
	// Need method for Print a list of DVDs rented by a customer.
	public static void menu() throws FileNotFoundException, InterruptedException {

				// arr.add((i));
			
		}

	*/

	// Need method for Rent a DVD; that is, add the rented DVD to the list
	public void rentDVD(DvdType item) {
		rented.add(item);
	}

	// reading customer file into array list
	public static ArrayList<CustomerType> readCustomers() throws FileNotFoundException {
		File fd = new File("Customer.txt");
		Scanner Input = new Scanner(fd);
		ArrayList<CustomerType> CustList = new ArrayList<CustomerType>();

		while (Input.hasNext()) {
			CustomerType temp = new CustomerType();
			temp.setName(Input.nextLine());
			temp.setAccountNum(Input.nextInt());
			temp.rentedDvds = Input.nextInt();
			if (Input.hasNextLine()) {
				Input.nextLine();
			}
			CustList.add(temp);
		}
		Input.close();
		Log.updateLog("Customer info has been read.");
		return CustList;

	}

	// prints all customers names
	public static void printCustomers() throws FileNotFoundException, InterruptedException {

		ArrayList<CustomerType> Cust = CustomerType.readCustomers();
		System.out.println("Customer Names and Account numbers:");

		for (int i = 0; i < Cust.size(); ++i)
			System.out.println(Cust.get(i).getName() + " " + Cust.get(i).getAccountNum());

		// System.out.println();

		Log.updateLog("Customer names and Account numbers have been printed");
	}

	// Need method for Rent a DVD; that is, add the rented DVD to the list
	public static void rentDvd() throws FileNotFoundException, InterruptedException {

		
		ArrayList<CustomerType> Customer = CustomerType.readCustomers();
		ArrayList<DvdType> DvDs = DvdType.readDvDs();
		ArrayList<Rented> Rents = CustomerType.readrented();
		
		//Get Account Number
		System.out.println("Please enter your Account Number: ");
		Scanner sIN = new Scanner(System.in);
		int AccountNo = sIN.nextInt();
		
		//If they're in the system ask for the DVD
		
		
		
		
		

	}

	// Need method for printing list of rented dvds
	public static void printRentedDvds() throws FileNotFoundException, InterruptedException {

		ArrayList<CustomerType> Cust = CustomerType.readCustomers();
		ArrayList<DvdType> arr = DvdType.readDvDs();

		for (int i = 0; i < Cust.size(); ++i) {
			

			if (Cust.get(i).rentedDvds == 0) {
				System.out.println(
						Cust.get(i).getName() + " " + Cust.get(i).getAccountNum() + " \n ");
				System.out.println("This Customer has no rented DVDs \n");
				
			} else {
				System.out.println(
						Cust.get(i).getName() + " " + Cust.get(i).getAccountNum() + " \n " + Cust.get(i).rentedDvds + "Movies Rented\n");
				System.out.println(arr.get(i).getMovie_name());
			}
		}
		Log.updateLog("Printed Rented DVDs");

	}
	// Need method for Print a list of DVDs rented by a customer.
	//////=-=============================-=
	//////=-=============================-=
	//////=-=============================-=
	
	
	public static ArrayList<Rented> readrented() throws FileNotFoundException {
		File fd = new File("Rented.txt");
		Scanner Input = new Scanner(fd);
		ArrayList<Rented> RentList = new ArrayList<Rented>();

		while (Input.hasNext()) {
			Rented temp = new Rented();
			temp.AccountNumber = (Input.nextInt());
			temp.Movie_Title = Input.nextLine();
			if (Input.hasNextLine()) {
				Input.nextLine();
			}
			RentList.add(temp);
		}
		Input.close();
		Log.updateLog("Rented DVDs have been read.\n");
		return RentList;

	}
	
	//Method to update rented dvds and customer list
	public static void updateRented() throws FileNotFoundException {
		
	
	//Read through customer list
		ArrayList<CustomerType> Cust = CustomerType.readCustomers();
	//read through rented list
		ArrayList<Rented> Rents = CustomerType.readrented();
	//- For each Customer, go through rented list and see how many match with their account number.
		for(int i = 0; i<Cust.size(); i++) {
			int counter = 0;
			for(int j = 0;j<Rents.size(); j++) {
				if((Cust.get(i).getAccountNum())==(Rents.get(j).getAccountNumber())) {
					counter++;
				}
			}
			System.out.println("Account Number; "+Cust.get(i).getAccountNum());
			System.out.println("Rented DVD Total; "+counter);
			//- If the customers file is incorrect, update it
			if(Cust.get(i).getRentedDvds()!=counter) {
				System.out.println("Discrepency in Customer File!\n");
				Cust.get(i).setRentedDvds(counter);
			}else {
				System.out.println("Matches Customer File.\n");
			}
		}
		//- - continue for each account number until EOF
		
		//Then read the cust arraylist to file
		PrintStream fout = new PrintStream(new File("Customer.txt"));
		for(int k = 0; k<Cust.size(); k++) {
			//fout.println(Cust.get(k));
			fout.println(Cust.get(k).getName());
			fout.println(Cust.get(k).getAccountNum());
			fout.println(Cust.get(k).getRentedDvds());
		}
		Log.updateLog("Customer File Updated: Rented DVD Number");
	
	}
	
	@Override
	public String toString() {
		return "CustomerType [" + "Name= " + getName() + " Account Number= " + getAccountNum() + " RentedDvds="
				+ rentedDvds + "]";
	}

}
