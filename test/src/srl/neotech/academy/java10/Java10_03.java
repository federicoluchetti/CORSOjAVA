package srl.neotech.academy.java10;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Java10_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> listaNumeri=new ArrayList<Integer>();

		Scanner scanner=new Scanner(System.in);
		System.out.print("Digitare il primo numero:");
	    int primoNumero=scanner.nextInt();
	    System.out.print("Digitare il secondo numero:");
	    int secondoNumero=scanner.nextInt();
	    Random random = new Random();
	    
	    
        for(int i=0;i<10;i++) {
        	int randomNumber = random.nextInt(secondoNumero + 1 - primoNumero) + primoNumero;
        	listaNumeri.add(randomNumber);
        }
        

        System.out.println("LArrayList contiene:"+listaNumeri);
        scanner.close();
	}

}
