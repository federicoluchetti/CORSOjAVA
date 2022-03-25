package srl.neotech.academy.java07;

import java.util.Scanner;

public class Java07_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("Digitare il numero:");
	    int Numero=scanner.nextInt();
	    
	    for(int i=1;i<=10;i++) {
        	int tabellina = Numero*i;
        	System.out.println(tabellina);
	}
	    scanner.close(); 
	    
}
}