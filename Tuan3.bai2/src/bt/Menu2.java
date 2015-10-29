package bt;

import java.util.Scanner;

public class Menu2 {
	BoxUI b = new BoxUI();
	Scanner input = new Scanner(System.in);
	boolean check = true;
	
	public void InNhapKhoMenu(){
		b.box(1,"Nhap kho so luong 1 don vi",35);
		b.box(2,"Nhap kho so luong 20 don vi",35);
		b.box(3, "Nhap theo ta 10 don vi",35);
		b.box(4, "Chinh sua so luon",35);
		b.box(5, "Quay lai menu 1",25);
		for (int i = 0 ; i < 3 ; i ++) System.out.println("");
	}
	
	public void InXuatKhoMenu(){
		b.box(1, "Xuat theo 1 don vi",25);
		b.box(2, "Xuat theo thung",25);
		b.box(3, "Xuat theo ta",25);
		b.box(4, "Chinh sua so luong",25);
		b.box(5, "Kiem tra so luon",25);
		b.box(6, "Quay lai menu 1",25);
		for (int i = 0 ; i < 3 ; i ++) System.out.println("");
	}
	
	public void QuanLyGiaMenu(){
		b.box(1, "Hien thi gia",20);
		b.box(2, "Sua gia",20);
		b.box(3, "Tong tien hang",20);
		b.box(4, "Quay lai menu 1",20);
		for (int i = 0 ; i < 3 ; i ++) System.out.println("");
	}
	
	public void InHoaDon(){
		b.box(1, "In theo luon hang",28);
		b.box(2, "In theo gia",28);
		b.box(3, "In theo ca hang va gia",28);
		b.box(4, "Quay lai menu 1",28);
		for (int i = 0 ; i < 3 ; i ++) System.out.println("");
	}
	
	public void ReturnMenu1(){
		Menu1 a = new Menu1();
		a.InMenu1();
		
		int n = input.nextInt();
		if( n == 5) System.out.println(" QUIT");
		if (n != 5) a.choice(n);
	}
	
	public void choiceInMenu2(int n){
		int m = input.nextInt();
		if(n == 1) {
			switch(m){
				case 5:this.ReturnMenu1();break;
			}
		}
		
		if(n == 2) {
			switch(m){
				case 6 :this.ReturnMenu1();break;
			}
		}
		
		if(n == 3 || n == 4){
			switch(m){
				case 4 : this.ReturnMenu1();break; 
			}
		}
	}
}
