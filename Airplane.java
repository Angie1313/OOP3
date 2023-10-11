	public class Airplane extends Vehicle {
		//in this example only airplanes have capacity
		private int capacity;// number of people it can hold
		public Airplane(String year, String model, String mileage){
			super(year, model,mileage);
			this.capacity = 20;
			printCapacity();
			
		}
		public void printCapacity() {
			System.out.println("Capacity: "+this.capacity);
		}
	
	}
