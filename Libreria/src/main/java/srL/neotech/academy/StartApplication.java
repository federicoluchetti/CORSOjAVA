package srL.neotech.academy;

import java.util.concurrent.ThreadLocalRandom;

public class StartApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Biblioteca biblioteca= new Biblioteca();
for (int i=0;i<100;i++) {
	Libro libridaContare= new Libro();
	libridaContare.setIdLibro(i);
	libridaContare.setGenere(Genere.FANTASY);
	libridaContare.setTitolo("Il Signore degli Anelli");
	biblioteca.getLibri().add(libridaContare);
	
	

}
System.out.println(biblioteca);
}
}
//int randomTitolo=ThreadLocalRandom.current().nextInt(1, 100 + 1);

/*random titoli*/

//int randomAutore=ThreadLocalRandom.current().nextInt(1, 100 + 1);
/*random Autori*/

//int randomGenere=ThreadLocalRandom.current().nextInt(1, 100 + 1);
/*random Generi*/

//int randomScaffale=ThreadLocalRandom.current().nextInt(1, 100 + 1);
//libridaContare.setScaffale(randomScaffale);