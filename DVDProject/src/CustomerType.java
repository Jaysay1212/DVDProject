import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
public class CustomerType extends Person{

	private int rentedDvds;

	
	public CustomerType(int rentedDvds) {
		super();
		this.rentedDvds = rentedDvds;
	}

	public CustomerType(String name, int accountNum, int rentedDvds) {
		super(name, accountNum);
		
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
	
	public static void CustomerSomething() throws FileNotFoundException{
		
	}
	
	//Need method for Rent a DVD; that is, add the rented DVD to the list
	//Need method for Return a DVD; that is, delete the rented DVD from the list
	
	@Override
	public String toString() {
		return "CustomerType ["+"Name= "+getName()+ " Account Number= "+getAccountNum()+" RentedDvds=" + rentedDvds + "]";
	} 
	
	
}
