package bt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Thongke {
	private String s;
	//Nhap du lieu tu file
	public void NhaptuFile() throws FileNotFoundException{
		BufferedReader br = new BufferedReader(new FileReader("file"));
		Scanner input = new Scanner(br);
		s = input.nextLine();
		System.out.println("Du lieu nhap tu file: "+s);
	}
	
	//Tinh toan xem co bao nhieu ki tu, tra ve so ki tu 
	public int demKitu(){
		char[] temp;
		ArrayList<String> t = new ArrayList<String>();
		temp = s.toCharArray();
		
		
		for(int i = 0 ; i < temp.length ; i++){
			t.add(String.valueOf(temp[i]));
		}
		//Loai bo ki tu trung dung canh nhau
		for(int i = 0 ; i < t.size()-1 ; i++){
			if(t.get(i).equals(t.get(i+1))) t.remove(i);
		}
		
		//loai bo cac ki tu trung
		for(int i = 0 ; i <t.size()-1 ;i++){
			for(int j = i+1; j < t.size();j++){
				if(t.get(i).equals(t.get(j))) {// cac ki tu giong nhau thi bo di
					t.remove(j);
				}
			}
		}
		System.out.print("cac ki tu la: ");
		for(int i = 0 ; i < t.size(); i++){
			System.out.print(t.get(i)+ "");
		}
		System.out.println("");
		return t.size();
	}
	
}
