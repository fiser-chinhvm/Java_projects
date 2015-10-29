package Tuan2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Scanner;

public class Bai4 {
	private int n;
	private int m;
	private static char[][] board;
	private String Input = "";
	private int countDown,countCheo,countAcross;
	public Bai4(){}
	
	public void ghiFile() throws FileNotFoundException{
		FileReader fr = new FileReader("board.txt");
		BufferedReader br = new BufferedReader(fr);
		Scanner get = new Scanner(br);
		m = get.nextInt();
		n = get.nextInt();
		
		String temp;
		board = new char[m][n];
		
		for(int i = 0 ; i < m ; i++){
			for(int j = 0 ; j < n ; j++){
				temp = get.next().toString();
				board[i][j] = temp.charAt(0);
			}
		}
		Input = get.next().toString();
		
	}

	public boolean test(int p){
		if(p == 5) return true;
		if(p>5) return test(p-1);
		else return false;
	}
	
	public boolean check(int i , int j , int x , int y , int p){
		if(p == Input.length()) return true;
		if(x<0||x > board.length || y > board[0].length || y<0) return false;
		if(board[x][y] == Input.charAt(p)) {
			return check(i,j,x+i,y+j,p+1);
		}
		return false; 
	}
	
	public void CountEverything(){
		countDown = countCheo = countAcross = 0;
		for(int i = 0 ; i < board.length ; i++){
			for(int j = 0 ; j <board[0].length ; j++){
				if(check(0,1,i,j,0)) countAcross++;
				if(check(0,-1,i,j,0)) countAcross++;
				
				if(check(1,0,i,j,0)) countDown++;
				if(check(-1,0,i,j,0)) countDown++;
				
				if(check(1,1,i,j,0)) countCheo++;
				if(check(1,-1,i,j,0)) countCheo++;
				if(check(-1,1,i,j,0)) countCheo++;
				if(check(-1,-1,i,j,0)) countCheo++;
			}			
		}
	}
	
	public void PrintBoard(){
		for(int i = 0 ; i < board.length ; i++){
			for(int j = 0 ; j <board[0].length ; j++){
				System.out.print(board[i][j]+ " ");
			}
			System.out.println("");
		}
		System.out.println(Input);
	}
	
	public void PrintAnswer(){
		CountEverything();
		System.out.println(countCheo);
		System.out.println(countAcross);
		System.out.println(countDown);
	}
	
	public static void main(String args[]) throws FileNotFoundException{
		Bai4 a = new Bai4();
		a.ghiFile();
		a.PrintBoard();
		a.PrintAnswer();
	}
}
