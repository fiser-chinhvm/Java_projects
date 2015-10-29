package Tuan2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Bai5 {
	private int m,n;
	private int[][] board;
	private int[] x,y;
	static String[] way;
	private int count = 0;
	
	public void ghifile() throws FileNotFoundException{
		FileReader fr = new FileReader("board");
		BufferedReader br = new BufferedReader(fr);
		Scanner get = new Scanner(br);
		
		
		m = get.nextInt();
		n = get.nextInt();
		board = new int[m][n];
		for(int i = 0 ; i < board.length ; i++){
			for(int j = 0 ; j < board[0].length ; j++){
				board[i][j] = get.nextInt();
			}
		}
		x = new int[]{0 , 0 , -1 , 1}; 
		y = new int[]{-1 , 1 , 0 , 0};
		
		way = new String[m*n];
	}
	
	public void PrintBoard(){
		for (int i = 0 ; i < board.length ; i++){
			for(int j = 0 ; j < board[0].length ; j++){
				System.out.print(board[i][j]+" ");
			}
			System.out.println("");
		}
		
		for(int i = 0 ; i < count ; i++){
			System.out.println(way[i]);
		}
	}
	
	public void findWaytoEnd(int i , int j){
		while(i!= m && j!=n){
			for(int k = 0 ; k < 4 ; k++){
				int tempX = i + x[k];
				int tempY = j + y[k];
				System.out.println(tempX +" "+ tempY);
				if(tempX >= 0 && tempY >= 0 && tempX < m && tempY < n){
					if(board[tempX][tempY] == 0){
						
						i = tempX;
						j = tempY;
						way[count] = "hehheehe ";
						
						count++;
						System.out.println("check" + i + " " + j + way[0] + count);
					}
				}
			}
		}
		count -- ;
	}
	
	public static void main(String args[]) throws FileNotFoundException{
		Bai5 bt = new Bai5();
		bt.ghifile();
		bt.findWaytoEnd(0, 0);
		bt.PrintBoard();
	}
}
