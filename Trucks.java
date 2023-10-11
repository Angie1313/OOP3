public class Trucks extends Vehicle {
		//in this example only trucks have 2 doors
		private int doors;
		public Trucks() {}
		public Trucks(String year, String brand, String mileage){
			super(year, brand,mileage);
			this.doors = 2;
			printDoors();
			
		}
		public void printDoors() {
			System.out.println("Doors: "+this.doors);
		}
			
	}


