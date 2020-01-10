import java.io.*;
import java.util.*;

public class MidtermAct03
{
	public static void main(String[] args) {
		try {
			File lacson = new File("phonebook.txt");
			Scanner scan = new Scanner(lacson);
			String s = "";
			
			while (scan.hasNext()) {
				s = scan.next();
				
				if(s.equals("1001-11")) {
					System.out.println("Code Found!");
					System.out.println("Code: " +s);
					System.out.print("First Name: "+scan.next());
					System.out.print(" Last Name: " +scan.next());
					System.out.print(" CP No.: "+scan.next());
					continue;
				}
			}
			scan.close();

		} catch (IOException e) {
            System.out.println("Error");
        }
	}
}
