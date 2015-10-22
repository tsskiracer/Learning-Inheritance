
public abstract class rTriangle extends Triangle
	{
		public rTriangle(int b, int h)
		{
			super(b, h);
			
			double hypotenuse=(math.sqrt(math.pow(base)*math.pow(height)));
			double perimeter=(hypotenuse+base+height);
		}
		
	}
