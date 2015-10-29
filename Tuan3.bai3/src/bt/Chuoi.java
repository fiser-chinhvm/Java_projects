package bt;

import java.util.Scanner;

public class Chuoi {
	private String chuoi;
	//Lay chuoi
	public String getChuoi(){
		return chuoi;
	}
	//Nhap chuoi vao
	public void nhapChuoi(){
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap chuoi: ");
		chuoi = input.nextLine();
		chuoi = chuoi.trim();
	}
	//in chuoi ra
	public void inChuoi(){
		System.out.println(chuoi.trim());
	}
	//Dao nguoc chuoi
	public String ChuoiDao(){
		StringBuilder sb = new StringBuilder(chuoi);
		sb.reverse();
		return sb.toString();
	}
	// in hoa chu dau
	public String inHoa(){
		String temp = chuoi.substring(0, 1);
		temp = temp.toUpperCase();
		temp = temp.concat(chuoi.substring(1,chuoi.length()));
		return temp;
	}
	//In hoa chu dau cua moi tu 
	public String inHoaMoiChuDau(){
		String[] temp = chuoi.split(" ");
		String str = "";
		for(int i = 0 ; i < temp.length ; i++){
			str += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1,temp[i].length());
			str += " ";
		}
		return str;
	}
	
	public String TimChuInHoa(){
		String str="";
		String temp = chuoi;
		temp = temp.toLowerCase();
		for(int i = 0 ; i < temp.length() ; i++){
			if(temp.charAt(i) != chuoi.charAt(i)) str += String.valueOf(chuoi.charAt(i));
		}
		return str;
	}
	
	public String InChuoiLech(){
		String str="";
		char[] temp = chuoi.toCharArray();
		int[] n = new int[temp.length];
		for(int i = 0 ; i < temp.length ; i++){
			n[i] = (int) temp[i];
			n[i]++;
			temp[i] = (char) n[i];
			str += temp[i];
		}
		return str;
	}
	
	public void GiaoDien(){
		System.out.println("Day ban nhap la: " + chuoi);
		System.out.println("1. chuỗi nghịch đảo của chuỗi nhập.");
		System.out.println("2. chuỗi có chữ đầu thành chữ hoa");
		System.out.println("3. chuỗi có chữ đầu từng từ thành chữ hoa");
		System.out.println("4. Chuỗi chữ hoa trong chuỗi");
		System.out.println("5. chuỗi mã hóa lệch một ký tự");
	}
	
	public void YeuCau(){
		Chuoi a = new Chuoi();
		a.chuoi = this.chuoi;
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		switch(n){
			case 1: System.out.println(a.ChuoiDao());break;
			case 2: System.out.println(a.inHoa());break;
			case 3: System.out.println(a.inHoaMoiChuDau());break;
			case 4: System.out.println(a.TimChuInHoa());break;
			case 5: System.out.println(a.InChuoiLech());break;
			default: System.out.println("Nhap sai Yeu Cau");break;
		}
	}
	
}
