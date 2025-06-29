class Human {
    private int age;
    private String name;
    

    public Human(){  //Default Constructors
        age = 18;
        name = "abid";
        System.out.println("In constructor Block");
    }
   public Human( int age , String name){   // Parameterised Constructors
        this.age = age;
        this.name = name;
        System.out.println("In constructor Block");
    }

    public String getName(){ //getters
        return name;
    }
    public int getAge(){  //getters
            return  age;
    }
}



public class constructor{
    public static void main(String[] args) {
        System.out.println("Welcome To Constructors");

        Human obj = new Human();
        Human obj1 = new Human(20,"Abid");
       System.out.println(obj1.getAge()); 
       System.out.println(obj.getAge()); 
       new Human().getName();
    }

}


//Naming convention 
//We use camelCase 
//Var -> name , age , dateOfBirth;
// Class and Interface -> Human , Device ,  Getname() i.e Constructor;
// Constants -> PIE , GRAVITY CONSTANT;