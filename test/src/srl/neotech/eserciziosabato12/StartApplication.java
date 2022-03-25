package srl.neotech.eserciziosabato12;

import java.util.Scanner;

public class StartApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("inserire il nuemro di elementi:");
Scanner s=new Scanner(System.in);
int numeroElementi=s.nextInt();
for(int i=0;i<numeroElementi;i++) {
	MattoncinoLego m=new MattoncinoLego();
	m.setColore("nero");
	m.setLarghezza((int)(Math.random()*100));
	m.setLunghezza((int)(Math.random()*100));
	System.out.println("il mattoncino è di colore:"+m.getColore());
	System.out.println("il mattoncino è largo:"+m.getLarghezza());
	System.out.println("il mattoncino è lungo:"+m.getLunghezza());
   
}

	}

}
