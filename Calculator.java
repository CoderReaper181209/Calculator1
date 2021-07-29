import java.util.*;

public class Main
{
    
    // factorial function
    
    static int fact(int j) {
      
		   int d = j;
		   int fact = 1;
		    
	    for(int i = 1; i <= d; i++) {
		        
		      fact *= i;
			    
		   }
		    return fact; 
    }
    
    // Square function
    
   static int Square(int j) {
        
      int w = j*j;
       return w;
		   
    }	   
    
    // squareRoot function
    
    static double squareRoot(double j) {
        
        double l =  Math.sqrt(j);
        return l;
    }
    
    // acceleration function
    
    static double acceleration(double initialVelocity, double finalVelocity, double time) {
        
         double acceleration = (double) (finalVelocity - initialVelocity) / time;
         return acceleration;
    }
    
    // Speed function
    
    static double speed(double distance, double time) {
        
        double speed = (double) distance / time;
        return speed;
    }
    
     // power function
    
    static double power(double work, double time) {
        
        double power = (double) work / time;
        return power;
    }
    
    // Addition function
    
    static double addition(double num1, double num2) {
        
        double e = num1 + num2;
        return e;
    }
    
    // Subtraction function
    
    static double subtraction(double num1, double num2) {
        
        double a = num1 - num2;
        return a;
    }
    
    // multiplication function
    
    static double multiplication(double num1, double num2) {
        
       double q = num1 * num2;
        return q;
    }
    
    // Division function
    
    static double division(double num1, double num2) {
        
        double k = num1 / num2;
        return k;
    }
    
    // Remainder function
    
    static double remainder(double num1, double num2) {
        
         double l = num1 % num2;
        return l;
    }
    
    // Tan function
    
    static double tan(double j) {
        
        double tan = Math.tan(j);
        return tan;
    }
    
     // Cos function
    
    static double cos(double j) {
        
        double cos = Math.cos(j);
        return cos;
    }
    
     // Sin function
    
    static double sin(double j) {
        
        double sin = Math.sin(j);
        return sin;
    }
    
    // PI function
    
    static double PI(double j) {
        
        double PI = 3.141592653589793238;
        double val = PI*j;
        return val;
    }
    
    
    // log function
    
    static double log(double j) {
        
        double log = Math.log(j);
        return log;
    }
    
    // e function
    
    static double e(double j) {
        
        double e = 2.718281828459045;
        double eVal = e*j;
        return eVal;
    }
    
    // EXP function
    
    static double EXP(double j) {
        
        double EXPval = Math.exp(j);
        return EXPval;
    }
    
    
	public static void main(String[] args) {
	    
	    Scanner s1 = new Scanner(System.in);
	    
	    String operator = "";
	    
	    while (!operator.equals("!") && !operator.equals("squareRoot") && !operator.equals("Square") && !operator.equals("tan") && !operator.equals("cos") && !operator.equals("sin") && !operator.equals("a") && !operator.equals("Speed") && !operator.equals("Power") && !operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/") && !operator.equals("%") && !operator.equals("PI") && !operator.equals("log") && !operator.equals("e") && !operator.equals("EXP")) {
		 
		System.out.print("Enter a operator: ");
		 operator = s1.nextLine();
	
		
		
		// if operator = !
	      
	     if(operator.equals("!")) {
		   
		    System.out.print("Enter a number: ");
		    
		    int j = s1.nextInt();
		    
		     System.out.println(fact(j));
	      }
	      
		 //  if operator = squareRoot
		    
          else if (operator.equals("squareRoot")) {

		   System.out.print("Enter a number: ");
		   double j = s1.nextDouble();
		    
		   System.out.println(squareRoot(j));
		
		}
		
		// if operator = square
		
	   else if(operator.equals("Square")) {
			
		  System.out.print("Enter a number: ");
		  int j = s1.nextInt();
		
		 System.out.println("Square is:" + "\t" + Square(j));
		 
		}
		
		
		// if operator = tan
		
	   else if(operator.equals("tan")) {
			
		  System.out.print("Enter a number: ");
		  double j = s1.nextDouble();
		
		 System.out.println("Tan of this number is:" + "\t" + tan(j));
		 
		}
		
		// if operator = cos
		
	   else if(operator.equals("cos")) {
			
		  System.out.print("Enter a number: ");
		  double j = s1.nextDouble();
		
		 System.out.println("Cos of this number is:" + "\t" + cos(j));
		 
		}
		
		// if operator = sin
		
	   else if(operator.equals("sin")) {
			
		  System.out.print("Enter a number: ");
		  double j = s1.nextDouble();
		
		 System.out.println("Sin of this number is:" + "\t" + sin(j));
		 
		}
		
		//  if operator = PI
		    
          else if (operator.equals("PI")) {

		   System.out.print("Enter a number: ");
		   double j = s1.nextDouble();
		    
		   System.out.println(PI(j));
		
		}
		
		//  if operator = log
		    
          else if (operator.equals("log")) {

		   System.out.print("Enter a number: ");
		   double j = s1.nextDouble();
		    
		   System.out.println("Natural log: " + "\t" + log(j));
		
		}
		
		//  if operator = e
		    
          else if (operator.equals("e")) {

		   System.out.print("Enter a number: ");
		   double j = s1.nextDouble();
		    
		   System.out.println(e(j));
		
		}
		
		//  if operator = EXP
		    
          else if (operator.equals("EXP")) {

		   System.out.print("Enter a number: ");
		   double j = s1.nextDouble();
		    
		   System.out.println(EXP(j));
		
		}
		
		// if scientific operator = a
		
		else if (operator.equals("a")) {
		    
		    System.out.print("Enter the initial velocity (in m): ");
		    double initialVelocity = s1.nextDouble();
		    
		    System.out.print("Enter the final velocity (in m): ");
		    double finalVelocity = s1.nextDouble();
		    
		    System.out.print("Enter the time (in sec): ");
		    double time = s1.nextDouble();
		    
		  
		   System.out.println("Acceleration:" + "\t" +  acceleration(initialVelocity, finalVelocity, time) +"\t" + "m/s^2");
		  
		}
		
		// if scientific operator = Speed
		
	 else if (operator.equals("Speed")) {
		    
		    System.out.print("Enter the distance (in m): ");
		    double distance = s1.nextDouble();
		    
		    System.out.print("Enter the time (in sec): ");
		    double time = s1.nextDouble();
		    
		   System.out.println("Speed of the object:" + "\t" + speed(distance, time));
		 
		}
		
		
		// if scientific operator = Power
		
	else if (operator.equals("Power")) {
		    
		    System.out.print("Enter the work (symbol - W): ");
		    double work = s1.nextDouble();
		
		    System.out.print("Enter the time: ");
		    double time = s1.nextDouble();
		
		   System.out.println("Power excited by the object:" + "\t" + power(work, time));
		
		}
		
		// if user doesn't enter a correct operator
		 
		else if(!operator.equals("!") && !operator.equals("squareRoot") && !operator.equals("Square") && !operator.equals("tan") && !operator.equals("cos") && !operator.equals("sin") && !operator.equals("a") && !operator.equals("Speed") && !operator.equals("Power") && !operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/") && !operator.equals("%") && !operator.equals("PI") && !operator.equals("log") && !operator.equals("e") && !operator.equals("EXP")) {
		    
		    System.out.println("Please enter a correct operator.");
		}
		
		
		else {
	    
		System.out.print("Enter num1: ");
		double num1 = s1.nextDouble();
		
		System.out.print("Enter num2: ");
		double num2 = s1.nextDouble();
	
		// if operator = +
		
		if(operator.equals("+")) {
		    
		    System.out.println(addition(num1, num2));
			
		}
		
		// if operator = -
		
		if(operator.equals("-")) {
		    
		    System.out.println(subtraction(num1, num2));
			
		}
		
		// if operator = *
		
		if(operator.equals("*")) {
		    
		  System.out.println(multiplication(num1, num2));
			
		}
		
		// if operator = /
		
		if(operator.equals("/")) {
			
		   System.out.println(division(num1, num2));
			
		}
		
	  // if operator = %
		
		if(operator.equals("%")) {
			
     	 System.out.println("Remainder is:" + "\t" + remainder(num1, num2));
		 
		}
		
	     }
	     
	}
}
}
