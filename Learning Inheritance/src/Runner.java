
public class Runner
	{

		public static void main(String[] args)
			{
				
				rTriangle rT = new rTriangle(4,6);
				System.out.println("Right Triangle");
				System.out.println("The area of this triangle is " + rT.findArea());
				System.out.println("The perimeter of this triangle is " + rT.findPerimeter());
				System.out.println("The hypotenuse of this triangle is " + rT.findHypotenuse());
				
				Triangle eT = new eTriangle(4,6);
				System.out.println("Equilateral Triangle");
				System.out.println("The area of this triangle is " + eT.findArea());
				System.out.println("The perimeter of this triangle is " + eT.findPerimeter());
				
				Trapezoid trap = new Trapezoid(4,6);
				System.out.println("Trapezoid");
				System.out.println("The area of this trapezoid is " + trap.findArea());
				System.out.println("The perimeter of this triangle is " + trap.findPerimeter());
						//need to determine how to find the perimeter of a trapezoid
				
				Rectangle r = new eTriangle(4,6);
				System.out.println("Right Triangle");
				System.out.println("The area of this triangle is " + r.findArea());
				System.out.println("The perimeter of this triangle is " + r.findPerimeter());
				
				
					
	
				
				
				
			}

	}