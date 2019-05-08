import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Log {

	public String Action;
	public String Date;
	
	public Log() {
		Action = "null";
		Date = "null";
	}
	
	//---------Log File Actions--------
	public String getAction() {
		return Action;
	}

	public void setAction(String action) {
		Action = action;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}
	
	public static ArrayList<Log> readLog() throws FileNotFoundException {
		File fd = new File("Log.txt");
		Scanner Input = new Scanner(fd);
		ArrayList<Log> LogList = new ArrayList<Log>();

		while (Input.hasNext()) {
			Log temp = new Log();
			temp.setDate(Input.nextLine());
			temp.setAction(Input.nextLine());
			LogList.add(temp);
		}
		Input.close();
		//System.out.println("Log File has been read.");
		return LogList;
	}
	
	public static void printLog() throws FileNotFoundException {
		ArrayList<Log> LogList = Log.readLog();
		for(int i = 0; i<LogList.size(); i++) {
			System.out.println(LogList.get(i));
		}
	}
	
	public static void updateLog(String action_) throws FileNotFoundException {
		ArrayList<Log> LogList = Log.readLog();
		Log entry = new Log();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		String date_ = now.toString();
		
		entry.setDate(date_);
		entry.setAction(action_);
		
		LogList.add(entry);
		PrintStream logOut = new PrintStream(new File("Log.txt"));
		//logOut.println("Entry Added.");
		for(int i = 0; i< LogList.size(); i++) {
			logOut.println(LogList.get(i).getDate());
			logOut.println(LogList.get(i).getAction());
		}
		//logOut.println("Log Updated");
	}

	@Override
	public String toString() {
		return "Log [Date=" + Date + ", Action=" + Action + "]";
	}

}
