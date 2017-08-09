package abstraction;

public class Car extends MotorCar implements TravelVehicle {
		public void bodyShape(){
			System.out.println("The car is 6 feet");
		}
		
			
		public void start(){
			System.out.println("It should start feature");
		}
		public void stop(){
			System.out.println("It must have break feature");
		}


		
		public void electicCar() {
			System.out.println("Car can run");
			
		}
		
		
		
		
	}


