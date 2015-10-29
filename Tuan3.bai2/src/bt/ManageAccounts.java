package bt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ManageAccounts {
	Scanner input = new Scanner(System.in);
	private ArrayList<String> username = new ArrayList<String>();
	private ArrayList<String> password = new ArrayList<String>();
	
	public void FileAccount() throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("accounts"));
		String[] temp = new String[2];
		String read = "";
		while((read = br.readLine()) != null){
			temp = read.split(" : ");
			username.add(temp[0]);
			password.add(temp[1]);
		}
	}
	
	public void LogIn(String user , String pass){
		for(int i = 0 ; i < username.size() ; i++){
			if(username.get(i).equals(user) && password.get(i).equals(pass)) continue;
			else System.out.println("Sai tai khoan hoac mat khau. De nghi nhap lai");
		}
	}
	
	public void Giaodien(){
		
	}
	
}
