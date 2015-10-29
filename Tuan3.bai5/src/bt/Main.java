package bt;

import java.io.FileNotFoundException;

public class Main {
	public static void main(String args[]) throws FileNotFoundException{
		Thongke a = new Thongke();
		a.NhaptuFile();
		System.out.println("Tong so ki tu la: "+ a.demKitu());
	}
}
