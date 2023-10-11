// this is the parent class, it has the elements of a vehicle

public class Vehicle {
		
		String year;
		String brand;
		String mileage;
		public Vehicle() {}
		public Vehicle(String year,String brand,String mileage) {
			//gives the variables values
			this.year = year;
			this.brand = brand;
			this.mileage = mileage;
			//prints the values in each variable
			System.out.println("Year: "+this.year);
			System.out.println("Brand: "+this.brand);
			System.out.println("Mileage: "+this.mileage);
		}
		
		public static void main(String[] args) {
			//this is test cases for truck, car, airplane, motorcycle
			 Trucks t = new Trucks("2013","Mercedes","20000");
			 Car c = new Car("2009","Subaru","30000");
			 Motorcycle m = new Motorcycle("2017","BMW","15000");
			 Airplane a = new Airplane("2023","Jetblue","80000");
			
			
			
			
			
			
		}

	
	}



	
