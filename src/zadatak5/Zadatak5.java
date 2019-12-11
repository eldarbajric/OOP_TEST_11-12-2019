package zadatak5;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner unos = new Scanner (System.in);
		ArrayList<String> rijeci = new ArrayList<String>();
		String rijec = " ";
		
		do {
			
			System.out.println("Unesite rijec: ");
			 rijec = unos.next();
			 rijeci.add(rijec);
		}while (rijec != "kraj");
	
			
		unos.close();
		
		for(int i = 0; i < rijeci.size(); i++) {
			System.out.print(rijeci.toString());
		}
	}

}
