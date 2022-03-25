package srl.neotech.academy.java10;

import java.util.Random;

public class Java10_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
	    
	    int numeri=10;
        while(true) {
        	int rando = random.nextInt(numeri+1-1)+1;
        if(rando%3==0) {break;}
        else System.out.println(rando);
        	rando++;
        		
        	


}
}
}