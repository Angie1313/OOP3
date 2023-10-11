
public class Recursive {
	//adds all the numbers before it(inclusive)
	static int Add(int n)
	{
	   if(n == 1)
	   {
	      return 1;
	   }
	   else
	   {
	      return n + Add(n - 1);
	   }
	}
	//subtracts all the numbers before it(inclusive)
	static int Subtract(int n)
	{
	   if(n == 1)
	   {
	      return 1;
	   }
	   else
	   {
	      return n - Subtract(n - 1);
	   }
	}
	//subtracts the addition of all the numbers before it
	static int Mix(int n)
	{
	   if(n == 1)
	   {
	      return 1;
	   }
	   else
	   {
	      return n - Add(n - 1);
	   }
	}
	//counts down and when it's done prints Go!
	static void countdown(int count){
		    if(count == 0) {            
		        System.out.println("Go!"); 
		    }
		    else {                        
		        System.out.println("We are at number "+count);             
		        countdown(count-1);
		    }
		}
	//it gives you a number raised to the power of a given exponent
	static int power(int a, int b){
	    if( b == 0) {
	    	return 1;
	    }
	    else {
	    	return a*power(a, b-1);
	    }
	}

	public static void main(String[] args) {
		
		System.out.println(Add(5));
		System.out.println(Subtract(5));
		System.out.println(Mix(5));
		countdown(7);
		System.out.println(power(4,3));
		
		
	}

}
