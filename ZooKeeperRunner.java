/*
 * Activity 4.9.2
 */
public class ZooKeeperRunner
{
  public static void main(String[] args)
  { 
    System.out.println("My Felines");
    Lion myLion = new Lion();
    myLion.setName("Romeo");
    myLion.growl();
    myLion.roar();
    myLion.huntInPack();

    Tiger myTiger = new Tiger();
    myTiger.setName("Tybalt");
    myTiger.growl();
    myTiger.roar();
    myTiger.huntAlone();
    myTiger.swim();

    System.out.println("My Elephant");
    Elephant myElephant = new Elephant();
    myElephant.setName("Balthasar");
    myElephant.forage();
    myElephant.trumpet();

    System.out.println("My Primates");
    Monkey myMonkey = new Monkey();
    myMonkey.setName("Peter");
    myMonkey.hoot();
    myMonkey.climb();
    myMonkey.howl();
    

    
    
       
  }
}
