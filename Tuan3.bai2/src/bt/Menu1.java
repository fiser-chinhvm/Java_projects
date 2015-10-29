package bt;

import java.util.Scanner;

public class Menu1 {
	
	Menu2 menu = new Menu2();
	BoxUI a = new BoxUI();
	
	public Menu2 getMenu2(){
		return menu;
	}
	
	public void InMenu1(){
		a.box(1,"Nhap kho",20);
		a.box(2,"Xuat kho",20);
		a.box(3, "Quan ly gia",20);
		a.box(4,"In hoa don",20);
		a.box(5,"Thoat",20);
		for (int i = 0 ; i < 3 ; i ++) System.out.println("");
	}
	
	public void choice(int n){
		if(n >0 && n <= 5){
			switch(n){
				case 1 : menu.InNhapKhoMenu();menu.choiceInMenu2(1);  break;
				case 2 : menu.InXuatKhoMenu();menu.choiceInMenu2(2);break;
				case 3 : menu.QuanLyGiaMenu();menu.choiceInMenu2(3);break;
				case 4 : menu.InHoaDon();menu.choiceInMenu2(4);break;
				case 5 : return;
			}
		}
		
		if(n <= 0 || n > 5) {
			a.box(n,"Nhap Sai Yeu Cau De Nghi Nhap Lai",40);
			Scanner input = new Scanner(System.in);
			int a = input.nextInt();
			this.choice(a);
		}
	}
}
