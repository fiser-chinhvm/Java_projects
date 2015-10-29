package bt;

public class Main {
	public static void main(String args[]){
		SoPhuc sp1 = new SoPhuc(5, 6);
		SoPhuc sp2 = new SoPhuc(2, 4);
		
		sp1.inSoPhuc();
		sp2.inSoPhuc();
		
		SoPhuc tong = sp1.CongTruSoPhuc(sp2);
		SoPhuc chia = sp1.chiaSoPhuc(sp2);
		SoPhuc nhan = sp1.nhanSoPhuc(sp2);
		
		System.out.print("tong: "); tong.inSoPhuc();
		System.out.print("chia: "); chia.inSoPhuc();
		System.out.print("nhan: "); nhan.inSoPhuc();
		System.out.println(sp1.modun());
		System.out.println(sp1.argument()+ " rad");
	}
}
