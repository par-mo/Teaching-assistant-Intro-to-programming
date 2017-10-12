
public class Fibumachi_4million_even_valued_sum {
 		
		long Fibumachi_4million_even()
	    {
 	        long sum = 0, f1 = 2, f2 = 8, c = 0;
	         
	        sum = sum + f1 + f2;
	      
	        while(true)
	        {
	            c = f2 * 4 + f1;
	            if(c>4000000)
	                break;
	            sum = sum + c;
	            f1 = f2;
	            f2 = c;
	            System.out.println(c+"   ");
	        }
	        return sum;
	    }
		
	    public static void main(String a[])
	    {
	    	Fibumachi_4million_even_valued_sum object1 = new Fibumachi_4million_even_valued_sum();
	        System.out.println("Sum  : " + object1.Fibumachi_4million_even());
	    }
	}
 