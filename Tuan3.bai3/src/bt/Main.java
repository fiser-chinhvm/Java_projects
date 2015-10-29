package bt;

import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		char[] x;
		Chuoi s = new Chuoi();
		s.nhapChuoi();
		
		do{
		s.GiaoDien();
		s.YeuCau();
		System.out.println("Tiep thi an nut "+"y");
		Scanner input = new Scanner(System.in);
		x = input.nextLine().toCharArray();
		} while(x[0] == 'y');
	}
}
