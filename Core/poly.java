class  A{
    public void show(){
        System.err.println("In A");
    }
}

class  B extends A{
    public void show(){
        System.err.println("In B");
    }
}

class  C extends A{
    public void show(){
        System.err.println("In C");
    }
}



public class poly  {
    public static void main(String[] args){
        System.out.println("Welcome to Polymorphisam");

        // A obj = new B();
        // obj.show();

        // A obj1 = new C();
        // obj1.show();

         A obj = new A();
         obj.show();;
         

        obj = new B();
        obj.show();   

        
        

        obj = new C();
        obj.show();  
        

        // it polymorphisam it means many form of objects based on context

        // it is divided into two compile time and run time 

        // compile time  --> Methodoverloading

        //Run time --> Method overriding  to understand it we use a method --> Dynamic method dispatch
        //  A obj = new A() --> A class runs
        //  A obj = new B() --> B class runs
        //  A obj = new C() --> C class runs
        

    }

}