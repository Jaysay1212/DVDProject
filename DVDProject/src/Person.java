
public class Person {

	private String userName;
	private  int accountNum;
	// Cole Was here
	// attempt 2
	public Person() {
		userName = "";
		accountNum = 0;
	}
	public Person(String name, int accountNum) {
		this.userName = name;
		this.accountNum = accountNum;
	}
	public String getName() {
		return userName;
	}
	public void setName(String name) {
		this.userName = name;
	}
	public int getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}
	@Override
	public String toString() {
		return "Person [name=" + userName + ", accountNum=" + accountNum + "]";
	}
	
	
	
}
