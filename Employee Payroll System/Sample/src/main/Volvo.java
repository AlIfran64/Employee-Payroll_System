package main;
class Vehicle{
protected String model;
public Vehicle (String model){
    this.model=model;
}
public void display(){
    System.out.println("the model is:"+model);
}
}
interface Drive{
    public void startEngine();
    public void stopEngine();
}
public class Volvo extends Vehicle implements Drive {
	  private double price = 2000000;
	    public Volvo(double price){
	        super("453");
	    }
	    @Override
	    public void startEngine(){
	    	System.out.println("Start Engine");  
	    }
	    @Override
	    public void stopEngine(){
	    	System.out.println("Stop Engine");  
	    }
	    public static void main(String[]args){
	        Volvo obj =new Volvo(453.3);
	        obj.startEngine();
	        obj.stopEngine();
	        obj.display();
	          System.out.println("The price is:"+obj.price);
	    }
	}

