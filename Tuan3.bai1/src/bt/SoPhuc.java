package bt;

public class SoPhuc {
	private double phanthuc;
	private double phanao;
	
	//Khoi tao
	SoPhuc(){};
	SoPhuc(double thuc, double ao){
		this.phanthuc = thuc;
		this.phanao = ao;
	}
	
	public double getPhanthuc(){
		return phanthuc;
	}
	
	public double getPhanao(){
		return phanao;
	}
	public void inSoPhuc(){
		System.out.println("(" + phanthuc + " + " + phanao  + "i)" );
	}
	//Cong 2 So Phuc
	public SoPhuc CongTruSoPhuc(SoPhuc sp){
		SoPhuc result = new SoPhuc();
		result.phanthuc = this.phanthuc + sp.phanthuc;
		result.phanao = this.phanao + sp.phanao;
		
		return result;
	}
	//Nhan 2 so phuc
	public SoPhuc nhanSoPhuc(SoPhuc sp){
		SoPhuc result = new SoPhuc();
		result.phanthuc = this.phanthuc*sp.phanthuc - this.phanao*sp.phanao;
		result.phanao = this.phanao*sp.phanthuc + this.phanthuc*sp.phanao;
		return result;
	}
	//Chia 2 so phuc
	public SoPhuc chiaSoPhuc(SoPhuc sp){
		SoPhuc result = new SoPhuc();
		double temp = sp.phanao*sp.phanao + sp.phanthuc*sp.phanthuc;
		result.phanthuc =(this.phanthuc*sp.phanthuc + this.phanao*sp.phanao)/temp;
		result.phanao = (this.phanao*sp.phanthuc - this.phanthuc*sp.phanao)/temp;
		return result;
	}
	//Tinh modun
	public double modun(){
		double result = Math.sqrt(phanthuc*phanthuc + phanao*phanao);
		return result;
	}
	//Tinh argument theo do radian
	public double argument(){
		double result = Math.atan(phanao/phanthuc);
		return result;
	}
}
