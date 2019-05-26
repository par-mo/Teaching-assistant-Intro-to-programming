
public class Multiples_of_3_and_5 {
	public static void main(String[] args){
	
	
	 int a=0;
	 int b=1000; 
	 
	 int i=0;
	  int sum=0;
	
	 for (i=a; i<b; i++ ){
	if 	 ((i % 3)==0) {
		sum=sum+i;	
	} else if((i % 5)==0) {
		sum=sum+i;	
	}
	 } 


	System.out.println("The sum of the multiples of 3 and 5 is:"+ sum);
}}


//public class MultiplesOf3And5 {

//public static void main(String[] args){

//System.out.println("The sum of the multiples of 3 and 5 is: " + getSum());

//}

//private static int getSum() {
//int sum = 0;
//for (int i = 1; i < 1000; i++) {
//   if (i % 3 == 0 || i % 5 == 0) {
//       sum += i;
//   }
//}
//return sum;
//}
