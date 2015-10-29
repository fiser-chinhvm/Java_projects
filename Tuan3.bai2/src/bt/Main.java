package bt;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	static String user;
	static String pass;
	
	public static void main(String args[]) throws IOException {
//		Menu1 a = new Menu1();
//		a.InMenu1();
//		Scanner x = new Scanner(System.in);
//																		
//		System.console().flush();
//		boolean check = true;
//		Runtime.getRuntime().exec("clear");
//		while(check = true){
//			int n = x.nextInt();
//			a.choice(n);
//			if(n == 5) break;
//		}
	Menu2 a = new Menu2();
	Scanner input = new Scanner(System.in);
	user = input.nextLine();
	pass = input.nextLine();
	ManageAccounts account = new ManageAccounts();
	account.FileAccount();
	account.LogIn(user, pass);
	a.ReturnMenu1();
		
		
	//	menu.getMenu2().InNhapKhoMenu();
	}
}
