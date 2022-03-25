package srl.neotech.academy.java10;


import java.util.Random;

public class Java10_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
	    
	    
        for(int i=0;i<10;i++) {
        	int randomNumber = random.nextInt(10+1-1)+1;
        
        	System.out.println(randomNumber);
	}
        

}
}