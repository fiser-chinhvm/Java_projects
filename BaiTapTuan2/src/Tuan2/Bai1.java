package Tuan2;
import java.util.*;

public class Bai1 {
	public static void main(String args[]){
		int n;
		int max,min, temp;
		Scanner get = new Scanner(System.in);
		
		System.out.print("NHAP n: ");
		n = get.nextInt();
		int a[] = new int[n];
		
		System.out.println("Nhap DAY:");
		for(int i = 0 ; i< n ; i++){
			a[i] = get.nextInt();
		}
		min = max = a[0];
		
		for (int i = 0 ; i<n ; i++){
			if(max < a[i]) max = a[i];
			if(min > a[i]) min = a[i];
		}
		
		for(int i = 0 ; i<n ; i++){
			for(int j = i ; j<n ; j++){
				if(a[i] > a[j]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.println(max + " " + min);
		
		for(int i = 0 ; i<n ; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println("");
		
		for(int i = 0 ; i<n ; i++){
			System.out.print(a[n-i-1]+ " ");
		}
	}
}
