package demo.pack1;

public class Demo implements Sample
{
	public static Sample getSample()
	{
		Sample sample=new Sample()
				{
					public void test()
					{
						System.out.println("test car...");
					}
				};
				return sample;
		
		
		
		
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
}
