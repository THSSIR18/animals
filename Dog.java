public class Dog extends Animal
{
	public Dog(String name)
	{
		super(name);
	}
	public void bark()
	{
		System.out.println("Woof!");
	}
	public void move()
	{
		System.out.println("Running");
	}
}