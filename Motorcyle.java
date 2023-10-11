public class Motorcycle extends Vehicle {
	//in this example only motorcycles have 2 wheels
		private int wheels;
		public Motorcycle(String year, String brand, String mileage){
			super(year, brand,mileage);
			this.wheels = 2;
			printWheels();
			
		}
		public void printWheels() {
			System.out.println("Wheels: "+ this.wheels);
		}
	}
