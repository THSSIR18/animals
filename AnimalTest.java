
public class AnimalTest {
        

    public static void main(String[] args) 
    {
    	Dog fido = new Dog("Fido");
    	Cat garfield= new Cat("Garfield");
        Frog kermit =new Frog("Kermit",true);
        Bird chatsby = new Bird("Chatsby",true);
       
       System.out.println("Fido actions:");
       fido.eat();
       fido.sleep();
       fido.breathe();
       fido.move();
       fido.bark();
       System.out.println("Garfield actions:");
       garfield.eat();
       garfield.sleep();
       garfield.breathe();
       garfield.move();
       garfield.Meow();
       System.out.println("Kermit actions:");
       kermit.eat();
       kermit.sleep();
       kermit.breathe();
       kermit.move();
       kermit.ribbit();
       System.out.println("Change tadpole to false and breathe again:");
       kermit.setTadpole(false);
       kermit.breathe();
       System.out.println("Kermit actions:");
       chatsby.eat();
       chatsby.sleep();
       chatsby.breathe();
       chatsby.move();
       chatsby.tweet();
       System.out.println("Change tadpole to false and breathe again:");
       chatsby.setTadpole(false);
       chatsby.breathe();
    }
}
