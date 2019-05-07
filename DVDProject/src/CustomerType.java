import java.util.ArrayList;

public class CustomerType extends Person{

	private int rentedDvds;
	private ArrayList<DvdType> rented;

	
	public CustomerType(int rentedDvds, ArrayList<DvdType> rented ) {
		super();
		this.rentedDvds = rentedDvds;
		this.rented = rented;
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
	
	public ArrayList<DvdType> getRented() {
		
		return rented;
	}
	
	public void setRented(ArrayList<DvdType> rented) {
		this.rented = rented;
	}
	
	
	//Need method for Return a DVD; that is, delete the rented DVD from the list
	public void removeDVD(DvdType item) {
		/*for(int i = 0; i < rented.size(); ++i) {
			if(rented.get(i).getDvd().getMovie_name() == item.getMovie_name()) {
				rented.remove(i);
			}
		}
		*/
	}
	
	//Need method for Rent a DVD; that is, add the rented DVD to the list
	public void addDVD(DvdType item) {
		rented.add(item);
	}
	
	@Override
	public String toString() {
		return "CustomerType ["+"Name= "+getName()+ " Account Number= "+getAccountNum()+" RentedDvds=" + rentedDvds + "]";
	} 
	
	
}
