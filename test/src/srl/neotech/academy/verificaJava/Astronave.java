package srl.neotech.academy.verificaJava;

public class Astronave implements IAstronave {
private int velocità;

public int getVelocità() {
	return velocità;
}

public void setVelocità(int velocità) {
	this.velocità = velocità;
}

@Override
public String decolla(int velocità) {

	return "ho impostato la velocità iniziale a: "+velocità;
}

@Override
public String accellera(int velocità) {

	return "Ho accellerato di: "+velocità;
}

@Override
public String decellera(int velocità) {
	
	return  "Ho decellerato di: "+velocità;
}
}
