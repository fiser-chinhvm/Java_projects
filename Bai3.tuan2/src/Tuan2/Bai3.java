package Tuan2;

import java.util.Scanner;

public class Bai3 {
	public static void main(String args[]){
		String s;
		String[] a;
		
		
		Scanner get= new Scanner(System.in);
		s = get.nextLine();
		
		for(int i = 0 ; i<s.length();i++){
			s =s.toLowerCase();
			s = s.replace(",", "");
			s = s.replace(".", "");
		}
		a = s.split(" ");
		int[] count = new int[a.length];
		for(int i = 0 ; i<a.length ; i++){
			count[i] = 1;
	//		System.out.println(a[i] + " ");
		}
		
		for(int i = 0 ; i<a.length ; i++){
			for(int j = i+1 ; j<a.length ; j++){
				if(a[i].equals(a[j])){
					a[j] = " ";
					count[i]++;
				}
			}
		}
		
		
		for(int i= 0 ; i<a.length ; i++){
		 if(a[i].charAt(0) !=' ') System.out.println(a[i] + "  " + count[i]);
		}
	}
}
