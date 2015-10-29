package bt;

public class BoxUI {
	public void box(int n , String s,int boxlength){//In theo kieu box 
		if(n < 0 || n >= 10) System.out.println("DE NGHI NHAP LAI, SAI YEU CAU");
		else if ( n >=0 && n < 10){
			System.out.print(" ");
			for(int i = 0 ; i < boxlength+8 ; i++){
				System.out.print("_");
			}
			
			System.out.print("\n|\t|");
			for(int i = 0 ; i < boxlength; i++){
				System.out.print(" ");
			}
			System.out.println("|");
			
			System.out.print("|   " + n + "   |");
			for(int i = 0 ; i < (boxlength - s.length()) ; i = i+2){
				System.out.print(" ");
			}
			System.out.print(s);
			for(int i = 0 ; i < (boxlength - s.length())-1; i = i+2){
				System.out.print(" ");
			}
			System.out.println("|");
			
			
			System.out.print("|_______|");
			for(int i = 0 ; i < boxlength; i++){
				System.out.print("_");
			}
			System.out.println("|");	
			}
	}
}
