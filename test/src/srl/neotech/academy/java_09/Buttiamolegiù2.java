package srl.neotech.academy.java_09;


import java.util.Scanner;

public class Buttiamolegiù2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.println("Scegli prima mossa:");

		String mossa1=scanner.nextLine();
		
		System.out.println("Scegli seconda mossa:");

		String mossa2=scanner.nextLine();
		if (mossa1.equals(mossa2))
		      System.out.println("Pareggio!");
		    else if (mossa1.equals("sasso") && mossa2.equals("forbice")
		             || mossa1.equals("carta") && mossa2.equals("sasso")
		             || mossa1.equals("forbice") && mossa2.equals("carta"))
		      System.out.println("Ha vinto il primo giocatore!");
		    else
		      System.out.println("Ha vinto il secondo giocatore!");

		scanner.close();
	    }
	}
