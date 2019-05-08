
public class Rented {

	public int AccountNumber;
	public String Movie_Title;
	
	public Rented() {
		AccountNumber = -1;
		Movie_Title = "N/a";
		
	}
	
	public Rented(int accountNumber, String movie_Title) {
		super();
		AccountNumber = accountNumber;
		Movie_Title = movie_Title;
	}
	
	
	public int getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}
	public String getMovie_Title() {
		return Movie_Title;
	}
	public void setMovie_Title(String movie_Title) {
		Movie_Title = movie_Title;
	}
	

	
	@Override
	public String toString() {
		return "Rented [AccountNumber=" + AccountNumber + ", Movie_Title=" + Movie_Title + "]";
	}
	
	
	
}
