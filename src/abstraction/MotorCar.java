package abstraction;

public abstract class MotorCar  {
	public void engine(){
		System.out.println("we have a engine");
	} 
	public void wheel(){
		System.out.println("We have four wheel");
	}
	public abstract void electicCar();
	
	public void solarEngine(){
		System.out.println("Run on battery");
		
	}
	

}
