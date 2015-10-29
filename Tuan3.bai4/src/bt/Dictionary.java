package bt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Dictionary {
	private ArrayList<String> key = new ArrayList<String>();
	private ArrayList<String> word = new ArrayList<String>();
	//Tao Tu Dien
	public void CreateUpdateDictionary() throws IOException{
		String temp;
		BufferedReader br = new BufferedReader(new FileReader("dictionary"));
		String[] a = new String[10];
		while((temp=br.readLine()) != null){
			a = temp.split(" : ");
			System.out.println(a[0]+ " : " + a[1]);
				key.add(a[0]);
				word.add(a[1]);
			}
	}
	// Tao tu moi cho vao tu dien
	public void addWord(String key , String value) throws IOException{
		boolean check = true;
		for(String k : this.key){
			if( key.equals(k)) check = false; // kiem tra xem tu da ton tai chua
		}
		if(check == true){
			File file = new File("dictionary");
			if(!file.exists()) file.createNewFile();
			FileWriter fw = new FileWriter(file.getName(), true);
			BufferedWriter wr = new BufferedWriter(fw);
			wr.write("\n" + key + " : " + value);
			wr.close();
		}
	}
	//Xoa tu trong tu dien
	public void delete(String k){
		for(int i = 0 ; i < key.size() ; i++){
			if(k.equals(key.get(i))){
				key.remove(i);
				word.remove(i);
			}
		}
	}
	
	//Tra tu da co trong tu dien
	public void tratu(){
		String findWord;
		Scanner input = new Scanner(System.in);
		findWord = input.nextLine();
		for(int i = 0 ; i < key.size() ; i++){
			if(key.get(i).startsWith(findWord)) System.out.println(key.get(i) + " : " + word.get(i));
		}
	}
	//Sua tu da co trong tu dien
	public void SuaTu() throws IOException {
		String temp;
		BufferedReader br = new BufferedReader(new FileReader("dictionary"));
		String[] a = new String[10];
		while((temp=br.readLine()) != null){
			a = temp.split(" : ");
			System.out.println(a[0]+ " : " + a[1]);
				key.add(a[0]);
				word.add(a[1]);
			}
		
		Scanner input = new Scanner(System.in);
		temp = input.nextLine();
		
		
	}
	
	
	
		
//		Collections.sort(key, Comporator<Dictionary>{
//			public int compare(Dictionary d1, Dictionary d2){
//				if (d1.)
//			}
//		});
//		
	public static void main(String args[]) throws IOException{
		Dictionary d = new Dictionary();
		d.CreateUpdateDictionary();
		//d.SuaTu("dictionary","Hien : king");
		//d.addWord("nhinh", "dep trai");
		//d.CreateUpdateDictionary();
//		d.CreateUpdateDictionary();
//		
//		BufferedReader br = new BufferedReader(new FileReader("dictionary"));
//		Scanner input = new Scanner(br); 
	}
}
