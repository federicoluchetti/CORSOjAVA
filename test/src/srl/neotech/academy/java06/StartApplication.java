package srl.neotech.academy.java06;



public class StartApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Guerriero mioGuerriero=new Guerriero();
		Mago mioMago=new Mago();
		Arciere mioArciere=new Arciere();
		Vampiro mioVampiro=new Vampiro();
		Orco mioOrco=new Orco();

	mioMago.attacca();
	mioMago.difendi();
	mioMago.muori();
	mioMago.mangia();
	mioMago.dormi();
		mioGuerriero.attacca();
		mioGuerriero.difendi();
		mioGuerriero.dormi();
		mioGuerriero.muori();
		mioGuerriero.mangia();
			mioArciere.attacca();
			mioArciere.difendi();
			mioArciere.dormi();
			mioArciere.mangia();
			mioArciere.muori();
			 mioOrco.attacca();
			 mioOrco.caccia();
			 mioOrco.difendi();
			 mioOrco.muori();
			 mioOrco.vainLetargo();
			 	mioVampiro.attacca();
			 	mioVampiro.caccia();
			 	mioVampiro.difendi();
			 	mioVampiro.muori();
			 	mioVampiro.vainLetargo();
			 	
	System.out.println("Mago:"+mioMago.attacca());
	System.out.println("Mago:"+mioMago.difendi());
	System.out.println("Mago:"+mioMago.muori());
	System.out.println("Mago:"+mioMago.mangia());
	System.out.println("Mago:"+mioMago.dormi());
	
		System.out.println("Guerriero:"+mioGuerriero.attacca());
		System.out.println("Guerriero:"+mioGuerriero.difendi());
		System.out.println("Guerriero:"+mioGuerriero.muori());
		System.out.println("Guerriero:"+mioGuerriero.mangia());
		System.out.println("Guerriero:"+mioGuerriero.dormi());
			
			System.out.println("Arciere:"+mioArciere.attacca());
			System.out.println("Arciere:"+mioArciere.difendi());
			System.out.println("Arciere:"+mioArciere.muori());
			System.out.println("Arciere:"+mioArciere.mangia());
			System.out.println("Arciere:"+mioArciere.dormi());
			
				System.out.println("Orco:"+mioOrco.attacca());
				System.out.println("Orco:"+mioOrco.difendi());
				System.out.println("Orco:"+mioOrco.muori());
				System.out.println("Orco:"+mioOrco.caccia());
				System.out.println("Orco:"+mioOrco.vainLetargo());
					
					System.out.println("Vampiro:"+mioVampiro.attacca());
					System.out.println("Vampiro:"+mioVampiro.difendi());
					System.out.println("Vampiro:"+mioVampiro.muori());
					System.out.println("Vampiro:"+mioVampiro.caccia());
					System.out.println("Vampiro:"+mioVampiro.vainLetargo());
		
		
	}

	 
}
