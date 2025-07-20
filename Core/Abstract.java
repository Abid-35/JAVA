abstract class Car{
    public  abstract void Fly();
    public abstract void Drive();
    public void Music(){
        System.out.println("Playing Music Car");
    }
}

 abstract class Benz extends Car{
    public void Drive(){
        System.out.println("Driving Benz");
    }
 }
   class Royals extends Benz{
    public void Fly() {
        System.err.println("Flying Royals");
    }
    
  }




public class Abstract{
    public static void main(String[] args){
        System.out.println("About AbstractKeyword");

     Royals obj = new Royals();
     obj.Drive();
     obj.Music();
     obj.Fly();


    }
}

//Abstract Keyword is used to declare the  methods 
// We can not create obj for abstract  class. 
