package sr.neotech.verifica26;

import org.kohsuke.randname.RandomNameGenerator;

public class StartApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomNameGenerator rnd = new RandomNameGenerator(0);
		for (int i=0; i<10; i++)
		    System.out.println(rnd.next());
	}

}
