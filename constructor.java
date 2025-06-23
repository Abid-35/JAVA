class Human {
    int age;
    String name;
    

    public Human(){
        age = 18;
        name = "abid";
    }
        public Human( int age){
        this.age = age;
        name = "abid";
    }

    public String getName(){
        return name;
    }
    public int getAge(){
            return  age;
    }
}



public class constructor{
    public static void main(String[] args) {
        System.out.println("Welcome To Constructors");

        Human obj = new Human();
        Human obj1 = new Human(20);
       System.out.println(obj1.getAge()); 
       System.out.println(obj.getAge()); 
    }
}