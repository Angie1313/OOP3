	public class Car extends Vehicle {
		//in this example only cars have 4 doors
		private int doors;
		public Car(String year, String brand, String mileage){
			super(year, brand,mileage);
			this.doors = 4;
			printDoors();
			
		}
		public void printDoors() {
			System.out.println("Doors: "+this.doors);
		}
	}
