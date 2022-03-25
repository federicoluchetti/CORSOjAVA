package srl.neotech.academy.java_calcoloesame;

import java.util.ArrayList;
import java.util.Scanner;

public class StartApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> RisultatoEsame=new ArrayList<Integer>();
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Digitare voto prova scritta:");
		int votoScritta=scanner.nextInt();
		while(votoScritta<-8||votoScritta>8 ){
	         System.out.println("immetti un voto compreso fra -8 e 8:");
	          votoScritta=scanner.nextInt();
	}
		
	   
	    
	    System.out.print("Digitare voto prova orale:");
	    int votoOrale=scanner.nextInt();


	    while(votoOrale<0||votoOrale>24 ){
	         System.out.println("immetti un voto compreso fra 0 e 24:");
	          votoOrale=scanner.nextInt();
	}
	    
	    
	    if(votoScritta<=0&&votoScritta+votoOrale>18) {
	    	System.out.println("lo studente è bocciato");
	    }
	    else if(votoScritta<=0&&votoScritta+votoOrale<18) {
	    	System.out.println("lo studente è bocciato");
	    }
	    else if(votoScritta>0&&votoScritta+votoOrale<18) {
	    	System.out.println("lo studente è bocciato");
	    }
	    else if(votoScritta+votoOrale==31||votoScritta+votoOrale==32) {
	    	System.out.println("congratulazioni: 30 e lode");
	    }
	    else {
	    	System.out.println(votoScritta+votoOrale+" lo studente è promosso");
	    }
	    
	    scanner.close();
	
	
	}

}
System.out.print("Quante manovre vuoi eseguire? ");
int manovra=scanner.nextInt();
for (int i=0;i<=manovra;i++) {
	 System.out.println("Scegliere se Accellerare 'A' o Decellerare 'B': ");
String AccOrDec=scanner.nextLine();
Boolean A=Boolean.valueOf(AccOrDec);
System.out.print("Impostare la velocità: ");
	int velocitaDiViaggio=scanner.nextInt();
	a.setVelocità(velocitaDiViaggio);
	while(velocitaDiViaggio<=0){
         System.out.println("imposta un valore di velocità positivo:");
        velocitaDiViaggio=scanner.nextInt();
