
public class CustomerType extends Person{

	private int rentedDvds;

	
	public CustomerType(int rentedDvds) {
		super();
		this.rentedDvds = rentedDvds;
	}

	public CustomerType(String name, int accountNum, int rentedDvds) {
		super(name, accountNum);
		// TODO Auto-generated constructor stub
	}

	public int getRentedDvds() {
		return rentedDvds;
	}

	public void setRentedDvds(int rentedDvds) {
		this.rentedDvds = rentedDvds;
	}

	@Override
	public String toString() {
		return "CustomerType ["+"Name= "+getName()+ " Account Number= "+getAccountNum()+" RentedDvds=" + rentedDvds + "]";
	} 
	
	
}
