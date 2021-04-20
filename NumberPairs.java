		//Name: Aditya Bilawar
		//Project Name: NumberPairs
		//Date: 9/17/2020
		//Project Description: calculates sum of num1 and num 2 and prints it out
		
		
		
		
		
		
		public class NumberPairs{
			// declare the fields / instance variables "num1, num2, and sum"
		private double num1;
		private double num2;
		private double sum;
			
		
			// Code the default constructor
			public NumberPairs() {
		
			
		}
		        public NumberPairs(double numm1, double numm2) {
		        	this.num1 = numm1;
		        	this.num2 = numm2;
				
			}
		
			
		
			// Code the overloaded constructor that takes two numbers as parameters (not
			// the sum)
		        
		        public void setNums(double num1, double num2) {
		        	this.num1 = num1;
		        	this.num2 = num2;
		        }
		        
		      
			
		
			// Code a mutator to change the values in the NumberPairs object
		        public void setNum1 (double num1 ) {
		        	this.num1 = num1;
		        	this.num1 = num1;
		        }
		        
		        public void setNum2(double num2) {
		        	this.num2 = num2;
		        }
		
			
			// Code a mutator that computes the sum, but does not print it out
		        public void calculateSum() {
		        	this.sum =  this.num1 + this.num2;
		        }
			
		       
		
			// Code a toString method that returns the numbers and their sum
		        public String toString() {
		            return "Number 1:" + this.num1 + "Number 2: " + this.num2 + "\nSum:" + this.sum;
		        }
			//EXTENSION - CAN YOU DO IT?
			// Code a mutator that adds the second NumberPair to increase the first.
		        public void increaseFirstNum() {
		        	this.num1 += this.num2;
		        	
		        }
			

			
		
			//EXTENSION - CAN YOU DO IT?
			// Create a new NumberPairs object from the sum of the others
		        public NumberPairs(NumberPairs a, NumberPairs b) {
		        	this.num1 = a.num1 + b.num1;
		        	this.num2 = a.num2 + b.num2;
		 
		        }
			
			
			public static void main(String[] args) {
				NumberPairs one = new NumberPairs();
				one.setNums(5, 5);
				NumberPairs two = new NumberPairs(90,100.0);
				NumberPairs three = new NumberPairs(100.5,85.8);
				NumberPairs four = new NumberPairs(-100,55);
				NumberPairs five = new NumberPairs(15236,5642);
				NumberPairs six = new NumberPairs(1000,555);
				System.out.println(one);
				System.out.println(two);
				System.out.println(three);
				System.out.println(four);
				System.out.println(five);
				System.out.println(six);
				
				NumberPairs newOne = new NumberPairs(one, two);
				System.out.println(newOne);
		
			}
		
		}