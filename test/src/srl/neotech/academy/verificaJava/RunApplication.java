package srl.neotech.academy.verificaJava;

import java.util.Scanner;

public class RunApplication {

	public static void main(String[] args) {
		Astronave a=new Astronave();
		Scanner scanner=new Scanner(System.in);
		System.out.print("Impostare la velocità di decollo: ");
		int velocitaIni=scanner.nextInt();
		a.getVelocità();
		a.setVelocità(velocitaIni);
		 while(velocitaIni<=0){
	         System.out.println("imposta un valore di velocità positivo:");
	         velocitaIni=scanner.nextInt();
		 }
		 System.out.println(a.decolla(velocitaIni));
		 
		 System.out.print("Quante manovre vuoi eseguire? ");
	         int manovra=scanner.nextInt();
	         for (int i=0;i<=manovra;i++) {
	        	 System.out.println("Scegliere se Accellerare 'A' o Decellerare 'D': ");
	         String AccOrDec=scanner.nextLine();
	         Boolean A=Boolean.valueOf(AccOrDec);
	         System.out.print("Impostare la velocità: ");
	 			int velocitaDiViaggio=scanner.nextInt();
	 			a.setVelocità(velocitaDiViaggio);
	 			while(velocitaDiViaggio<=0){
	 		         System.out.println("imposta un valore di velocità positivo:");
	 		        velocitaDiViaggio=scanner.nextInt();
	 		       
	 			}
	 			
	 		        
	         }
		
	

}
}