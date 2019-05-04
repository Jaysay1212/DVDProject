import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerType extends Person {

	private int rentedDvds;

	public CustomerType(int rentedDvds) {
		super();
		this.rentedDvds = rentedDvds;
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

	// reading customer file into arraylist
	public static ArrayList<CustomerType> readCustomers() throws FileNotFoundException {
		File fd = new File("Customers.txt");
		Scanner Input = new Scanner(fd);
		ArrayList<CustomerType> CustList = new ArrayList<CustomerType>();

		while(Input.hasNext()) {
			CustomerType temp = new CustomerType();
			temp.getName() = Input.nextLine();
			temp.getAccountNum()= Input.nextInt();
			temp.rentedDvds= Input.nextInt();
			if (Input.hasNextLine()) {
				Input.nextLine();
			}
			CustomerType.add(temp);
		}
		Input.close();
		System.out.println("Customers have been read.\n");
		return CustList;
			
		}
	

	// Need method for Rent a DVD; that is, add the rented DVD to the list
	// Need method for Return a DVD; that is, delete the rented DVD from the list

	@Override
	public String toString() {
		return "CustomerType [" + "Name= " + getName() + " Account Number= " + getAccountNum() + " RentedDvds="
				+ rentedDvds + "]";
	}

}
