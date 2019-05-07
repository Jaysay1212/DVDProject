
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class CustomerType extends Person {

	private int rentedDvds;
	private ArrayList<DvdType> rented;
	
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

	
	public ArrayList<DvdType> getRented() {
		
		return rented;
	}
	
	public void setRented(ArrayList<DvdType> rented) {
		this.rented = rented;
	}
	
	
	//Need method for Return a DVD; that is, delete the rented DVD from the list
	public void retrunDVD(DvdType item) {
		for(int i = 0; i < rented.size(); ++i) {
			if(rented.get(i).getMovie_name() == item.getMovie_name()) {
				rented.remove(i);
			}
		}
		
	}
	
	//Need method for Rent a DVD; that is, add the rented DVD to the list
	public void rentDVD(DvdType item) {
		rented.add(item);
	}
	

	// reading customer file into array list
	public static ArrayList<CustomerType> readCustomers() throws FileNotFoundException {
		File fd = new File("Customer.txt");
		Scanner Input = new Scanner(fd);
		ArrayList<CustomerType> CustList = new ArrayList<CustomerType>();

		while(Input.hasNext()) {
			CustomerType temp = new CustomerType();
			temp.setName(Input.nextLine());
			temp.setAccountNum(Input.nextInt());
			temp.rentedDvds= Input.nextInt();
			if (Input.hasNextLine()) {
				Input.nextLine();
			}
			CustList.add(temp);
		}
		Input.close();
		System.out.println("Customer info has been read.\n");
		return CustList;
			
		}
	// prints all customers names
	public static void printCustomers() throws FileNotFoundException, InterruptedException {
		
		ArrayList<CustomerType> Cust =  CustomerType.readCustomers();
		System.out.println("Customer Names:");
		
		for (int i = 0; i < Cust.size(); ++i) 
			System.out.println(Cust.get(i).getName()+ " "+Cust.get(i).getAccountNum());
			
		//	System.out.println();
		
		System.out.println("Customer names and Account numbers have been printed");
		menu();
	}

	// Need method for Rent a DVD; that is, add the rented DVD to the list
	public static void rentDvd() throws FileNotFoundException, InterruptedException {
		
		ArrayList<CustomerType> Cust =  CustomerType.readCustomers();
		ArrayList<DvdType> arr = DvdType.readDvDs();
		
		
		
	}
	// Need method for Return a DVD; that is, delete the rented DVD from the list
	public static void returnDvd() throws FileNotFoundException, InterruptedException {
		
		ArrayList<CustomerType> Cust =  CustomerType.readCustomers();
		ArrayList<DvdType> arr = DvdType.readDvDs();
		
		
		
	}
	// Need method for printing list of rented dvds
	public static void printRentedDvds() throws FileNotFoundException, InterruptedException {
		
		ArrayList<CustomerType> Cust =  CustomerType.readCustomers();
		ArrayList<DvdType> arr = DvdType.readDvDs();
		
	}
	// Need method for Print a list of DVDs rented by a customer.

	public static void menu() throws FileNotFoundException, InterruptedException {
		System.exit(0);
	}
	
	@Override
	public String toString() {
		return "CustomerType [" + "Name= " + getName() + " Account Number= " + getAccountNum() + " RentedDvds="
				+ rentedDvds + "]";
	}

}
