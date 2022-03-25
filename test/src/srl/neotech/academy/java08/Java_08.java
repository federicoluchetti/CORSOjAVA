package srl.neotech.academy.java08;

import java.util.Scanner;

public class Java_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("scrivi qualcosa!:");
	    String Frase=scanner.nextLine();
	    
	    
	   for(int i=Frase.length()-1;i>=0;i--) {
		   char reverso=Frase.charAt(i);
		   System.out.println(reverso);
	   }
	  
		 scanner.close();
	   }
	   
	   
}