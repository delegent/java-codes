class Box{
	private int length,breadth,height;
	public void setDimenson(int l,int b,int h)
	{
		length = l;
		breadth = b;
		height = h;
		
	}
	public void showDimension()
	{
		System.out.println("length = " + length);
		System.out.println("breadth = " + breadth);
		System.out.println("Height = " + height);
	}
	
}
class Example{
	public static void main(String [] args)
	{
		Box b = new Box();
		b.setDimenson(12,11,10);
		b.showDimension();
		b = new Box();
		b.showDimension();
		
	}
}


