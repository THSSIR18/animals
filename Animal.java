public abstract class Animal implements LivingThings
{
	public String name = null;
	
	public Animal(String name)
	{
		this.name= name;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name= name;
	}
	public void sleep()
	{
		System.out.println("Sleeping");
	}
	public void breathe()
	{
		System.out.println("Using lungs to breathe");
	}
	public void eat()
	{
		System.out.println("eating");
	}
	public abstract void move();
}