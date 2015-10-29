package Tuan2;
import java.util.*;

public class Bai2 {
	public static void main(String args[]){
		int n,m;
		Scanner get = new Scanner(System.in);
		int countCong = 0, countNhan = 0;
		int temp = 0;
		
		System.out.print("NHAP n: ");
		n = get.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		
		System.out.println("Nhap DAY:");
		for(int i = 0 ; i< n ; i++){
			a[i] = get.nextInt();
			b[i] = 0;
		}

		System.out.println("Nhap m");
		m = get.nextInt();
		
		
		while(!check(b)){
			change(b);
			temp = 0;
			for(int i = 0 ; i < n ; i++){
				temp += a[i] * b[i];
			}
				
			if(temp == m) {
				countCong++;
			}
				
			temp = 1;
			for(int i = 0 ; i < n ; i++){
				if (b[i] == 1) {
					temp *= a[i] * b[i];
					
				}
			}
			
			if(temp == m){
				countNhan++;
				for(int i = 0 ; i < n ; i++){
			//		System.out.print(b[i]);
				}
				//System.out.println("");
			}
			//tru(n,a,m);
		}
		
		System.out.println(countCong);
		tru(n,a,m);
		System.out.println(countNhan);
		
		for(int i = 0 ; i < n ; i++){
			System.out.print(b[i]+ " ");		
		}
		System.out.println("Nhap m");
		m = get.nextInt();
		
	
			
		}
	
	public static void change(int[] s){
		for(int i =0 ; i < s.length ; i++){
			if (s[i] == 0){
				s[i] = 1;
				for(int j = 0 ; j< i ; j++){
					s[j] = 0;
				}
				break;
			}
		}
	}
	
	public static boolean check(int[] s ){
		for(int i = 0 ; i < s.length ; i++){
			if(s[i] != 1) return false;
		}
		return true;
	}
	
	public static void tru(int n, int a[], int m){
		int[] f = new int[100];
//		for (int i=0;i<n;i++) System.out.print(a[i]+" ");
//		System.out.println();
		int res=0;
		for (int i=0;i<n;i++){
			//khoi tao
			for (int j=0;j<100;j++) f[j]=0;
			f[0] = 1;
			// quy hoach dong
			for (int j=0;j<n;j++){
				if (i!=j){
					for (int k=100;k>a[j];k--){
						if (f[k-a[j]]>0){
							f[k]=f[k]+f[k-a[j]];
						}
					}
					f[a[j]]+=1;
				}
			}
			//System.out.println(a[i]+" "+f[a[i]-m]);
			if (a[i]-m>=0 && a[i]-m<=99) res+=f[a[i]-m];
		}
		System.out.println(res);
	}
}
