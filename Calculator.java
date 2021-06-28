import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner s1 = new Scanner(System.in);
		 
		System.out.print("Enter a operator: ");
		String operator = s1.nextLine();
		
		// if operator = !
	      
	      if(operator.equals("!")) {
		   
		    System.out.print("Enter a number: ");
		    
		    int j = s1.nextInt();
		    
		    int d = j;
		    
		    int fact = 1;
		    
		    for(int i = 1; i <= d; i++) {
		        
		        fact *= i;
		    }
		    System.out.println(fact);
		}
		
		
		// if operator = x^2
		
		else if(operator.equals("x^2")) {
		    
		    System.out.print("Enter a number: ");
		    
		   int j = s1.nextInt();
		    
		    int w = j*j;
		    
		    System.out.println(w);
		}
		
		 // if operator = Square root
		
	 else if(operator.equals("Square root")) {
		    
		    System.out.print("Enter a number: ");
		    
		    double v = s1.nextInt();
		    
		    double p = (double) Math.sqrt(v);
		    
		    System.out.println(p);
		}
		
		// if scientific operator = a
		
	  else if(operator.equals("a")) {
		    
		    System.out.print("Enter the initial velocity (in m): ");
		    
		    double u1 = s1.nextInt();
		    
		     System.out.print("Enter the final velocity (in m): ");
		    
		    double v1 = s1.nextInt();
		    
		     System.out.print("Enter the time (in sec): ");
		    
		    double time = s1.nextInt();
		    
		    double ac = (double) (v1 - u1) / time;
		    
		    System.out.println("Accelration:" + "\t" + ac);
		}
		
		
		// if scientific operator = Speed
		
	 else if(operator.equals("Speed")) {
		    
		     System.out.print("Enter the distance (in m): ");
		    
		    double distance = s1.nextInt();
		    
		     System.out.print("Enter the time (in sec): ");
		    
		    double time = s1.nextInt();
		    
		    double speed = (double) distance / time;
		    
		    System.out.println("Speed of the object:" + "\t" +  speed);
		}
		
		
		// if scientific operator = P
		
	else if(operator.equals("P")) {
		    
		    System.out.print("Enter the work (symbol - W): ");
		    
		    double work = s1.nextInt();
		    
		     System.out.print("Enter the time: ");
		    
		    double time = s1.nextInt();
		    
		    double power = (double) work / time;
		    
		    System.out.println("Power excited by the object:" + "\t" + power);
		}
		
		
		else {
	    
	    Scanner s = new Scanner(System.in);
	    
		System.out.print("Enter num1: ");
		int num1 = s.nextInt();
		
		 
		System.out.print("Enter num2: ");
		int num2 = s.nextInt();
	
		
		
		// if operator = +
		
		if(operator.equals("+")) {
		    
		    int e = num1 + num2;
		    
		    System.out.println(e);
		}
		
		// if operator = -
		
		if(operator.equals("-")) {
		    
		    int a = num1 - num2;
		    
		    System.out.println(a);
		}
		
		// if operator = *
		
		if(operator.equals("*")) {
		    
		    int q = num1 * num2;
		    
		   System.out.println(q);
		}
		
		// if operator = /
		
		if(operator.equals("/")) {
		    
		   double k = (double) num1 / num2;
		    
		    System.out.println(k);
		}
		
	  // if operator = %
		
		if(operator.equals("%")) {
		    
		    int l = num1 % num2;
		    
		    System.out.println("Remainder is:" + "\t" +l);
		}
		}
    
	}
}
