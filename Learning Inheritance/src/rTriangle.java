
public abstract class rTriangle extends Triangle
	{
	public abstract double findHypotenuse();
		public rTriangle(int b, int h)
		{
			super(b, h);
			
			double hypotenuse=(math.sqrt(math.pow(base)*math.pow(height)));
			double perimeter=(hypotenuse+base+height);
		}
		
	}