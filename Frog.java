public class Frog extends Animal
{
	public boolean isTadpole = true;
	public Frog(String name, boolean isTadpole)
	{
		
		super(name);
		this.isTadpole =isTadpole;
	}
	public void ribbit()
	{
		System.out.println("Ribbit!");
	}
	public void move()
	{
		System.out.println("Swimming");
	}
	public void setTadpole(boolean isTadpole)
	{
		this.isTadpole =isTadpole;	
	}
	public void breathe()
	{
		if (isTadpole)
		{
			System.out.println("using gills to breathe");
		}
		else
		{
			super.breathe();
		}
	}
}