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
	         for (int i=0;i<manovra;i++) {
	        	 System.out.println("Scegliere se Accellerare 'A' o Decellerare 'D': ");
	        	 String AccOrDec=scanner.next();
	        	 while(!(AccOrDec.equals("A")||(AccOrDec.equals("D")))){
	        		 System.out.println("puoi inserire solamente A o D");
	        		 System.out.println("Scegliere se Accellerare 'A' o Decellerare 'D': ");
	        		AccOrDec=scanner.next();
	        	 }
	     System.out.print("Impostare la velocità: ");
	 			int velocitaDiViaggio=scanner.nextInt();
	 			a.setVelocità(velocitaDiViaggio);
	 			while(velocitaDiViaggio<=0){
	 		         System.out.println("imposta un valore di velocità positivo:");
	 		        velocitaDiViaggio=scanner.nextInt();
	 			}
	 		        String RisulAccOrDec=null;
	 		        if(AccOrDec.equals("A")) RisulAccOrDec=a.accellera(velocitaDiViaggio);
	 		        if(AccOrDec.equals("B")) RisulAccOrDec=a.decellera(velocitaDiViaggio);
	 		        System.out.println(RisulAccOrDec);
	 			
	 			
	 			System.out.println("la velocità finale dell'astronave è: "+a.getVelocità());
	         }
	
	scanner.close();

}
}