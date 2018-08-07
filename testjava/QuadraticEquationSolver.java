import java.util.ArrayList;

class QuadraticEquationSolver {
	public static void main(String[] args) {
		Double a = 1.0, b = 2.0, c = -3.0;
		try {
			if (args.length != 3) throw new RuntimeException("Error: Wrong number of arguments");
			
			a = Double.parseDouble(args[0]);
			b = Double.parseDouble(args[1]);
			c = Double.parseDouble(args[2]);
 
			if (Math.abs(a) < 2 * Double.MIN_VALUE) throw new RuntimeException("Error: Not a quadratic equation");
			
			QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
			System.out.println((quadraticEquation.findRoots().toString()));

		} catch (NumberFormatException e) {
			System.err.println("Error: Not a decimal number");
			System.exit(1);
		} catch (RuntimeException e) {
			System.err.println(e.getMessage());
			System.exit(1);
		}
	}
}

class QuadraticEquation {
	private Double a, b, c;
	
	QuadraticEquation(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Double findDiscriminant(){
		return b*b - 4*a*c;
	}
		
	public ArrayList findRoots(){
		ArrayList alRoots = new ArrayList();
		Double discriminant = findDiscriminant();
		Double x1, x2;

		if (Math.abs(discriminant) < 2 * Double.MIN_VALUE) {
			x1 = (-b ) / (2*a);
			alRoots.add(x1);	
		} else if (discriminant.compareTo(new Double("0.0")) > 0) {
			x1 = (-b + Math.sqrt(findDiscriminant())) / (2*a);
			x2 = (-b - Math.sqrt(findDiscriminant())) / (2*a);
			alRoots.add(x1);
			alRoots.add(x2);
		}
		return alRoots;
	}	
}

