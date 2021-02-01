public class Bird extends Animal
{
	public boolean isClipped = true;
	public Bird(String name, boolean isClipped)
	{
		
		super(name);
		this.isClipped =isClipped;
	}
	public void tweet()
	{
		System.out.println("Tweet?");
	}
	public void move()
	{
		
		if (isClipped)
		{
			System.out.println("Cant fly was caught in a chat");
		}
		else
		{
			System.out.println("Can fly and landed on osa naps");
		}
		System.out.println("Fly");
	}
	public void setTadpole(boolean isClipped)
	{
		this.isClipped =isClipped;	
	}
	
}