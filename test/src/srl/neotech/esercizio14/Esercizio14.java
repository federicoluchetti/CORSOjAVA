package srl.neotech.esercizio14;

public class Esercizio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {23,45,70,98,71,23,45,-20,-60,23,-90};
int somma=0;
for(int i=0;i<a.length;i++) {
	if (a[i]>0) {
		somma=somma+a[i];
		System.out.println(somma);
	}
}
	}

}
