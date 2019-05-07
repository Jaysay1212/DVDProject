import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver_ {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		//menu
		menu();
	}

	public static void menu() throws FileNotFoundException, InterruptedException {
		//Declarations:
		//...
	
		//Menu: 
		System.out.println(
				"Please Select one of the following:\n"+
				"1:  To check whether the store carries a particular DVD.\n"+
				"2:  To check out a DVD.\n"+
				"3:  To check in a DVD.\n"+
				"4:  To check whether a particular DVD is in stock.\n"+
				"5:  To print only the titles of all the DVDs.\n"+
				"6:  To print a list of all the DVDs.\n"+
				"7:  Print a list of customers.\n"+
				"8:  Print a list of DVDs rented by a customer.\n"+
				"9:  Print a list of all rented DVDs.\n"+
				"10: To Exit\n");
		System.out.print("Choice: ");
		//Should we have a return to menu after each command?
		
		//Scanner	
		///Would it be better to initialize before the print or after and close?
		
		Scanner Input = new Scanner(System.in);
		int Choice = Input.nextInt();
		
		System.out.println();
		
		//Make sure that the Input MUST be an int. 
		//That or maybe cast it. More error when asking for a line or a string.
		//Maybe 
		

			switch(Choice) {
			case 1:
				//To check whether the store carries a particular DVD.
				DvdType.DVDLookup();
				break;
			case 2:
				//To check out a DVD.
				System.out.println("\\\\\\\\UNDER CONSTRUCTION///////");
				break;
			case 3:
				//To check in a DVD.
				System.out.println("\\\\\\\\UNDER CONSTRUCTION///////");
				break;
			case 4:
				//To check whether a particular DVD is in stock.
				DvdType.CheckStock();
				break;
			case 5:
				//To print only the titles of all the DVDs.
				DvdType.printTitles();
				break;
			case 6:
				//To print a list of all the DVDs.
				DvdType.printDvDs();
				break;
			case 7:
				//Print a list of customers.
				System.out.println("\\\\\\\\UNDER CONSTRUCTION///////");
				break;
			case 8:
				//Print a list of DVDs rented by a customer.
				System.out.println("\\\\\\\\UNDER CONSTRUCTION///////");
				break;
			case 9:
				//Print a list of all rented DVDs.
				System.out.println("\\\\\\\\UNDER CONSTRUCTION///////");
				break;
			case 10:
				//Exit
				System.exit(0);
				break;
			default:
				//Anything else.
				System.out.println("This is an invalid entry. Returning to menu.");
				Thread.sleep(2000);
				menu();
				break;
			}
		

		switch(Choice) {
		case 1:
			//To check whether the store carries a particular DVD.
			DvdType.DVDLookup();
			break;
		case 2:
			//To check out a DVD.
			System.out.println("\\\\\\\\UNDER CONSTRUCTION///////");
			break;
		case 3:
			//To check in a DVD.
			System.out.println("\\\\\\\\UNDER CONSTRUCTION///////");
			break;
		case 4:
			//To check whether a particular DVD is in stock.
			DvdType.CheckStock();
			break;
		case 5:
			//To print only the titles of all the DVDs.
			DvdType.printTitles();
			break;
		case 6:
			//To print a list of all the DVDs.
			DvdType.printDvDs();
			break;
		case 7:
			//Print a list of customers.
			CustomerType.printCustomers();
			break;
		case 8:
			//Print a list of DVDs rented by a customer.
			System.out.println("\\\\\\\\UNDER CONSTRUCTION///////");
			break;
		case 9:
			//Print a list of all rented DVDs.
			System.out.println("\\\\\\\\UNDER CONSTRUCTION///////");
			break;
		case 10:
			//Exit
			System.exit(0);
			break;
		default:
			//Anything else.
			System.out.println("This is an invalid entry. Returning to menu.");
			Thread.sleep(2000);
			menu();
			break;
		}

		
		
		
		
	}
}
