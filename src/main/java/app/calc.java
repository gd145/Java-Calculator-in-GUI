package app;

public class calc {
	public float calculate(String op, long num1, long num2) {
        switch (op) {
        case "+":
            return num1 + num2;
        case "-":
            return num1 - num2;
        case "*":
        	if (num1 == 0 || num2 == 0) {
        		return 0;
        	}
            return num1 * num2;
        case "/":
        		if (num2 == 0 ) {
                return 0;
        		}
            return num1 / num2;
        	
         
        case "^":
        	return (float) java.lang.Math.pow(num1,num2);
        default:
        	throw new IllegalStateException("Operation is invalid.");
		
        }
	}
}