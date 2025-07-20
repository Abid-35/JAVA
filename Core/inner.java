class A{
    int age;
    public void Drive(){
        System.out.println("In A");
    }
     static class B{
        public void Show(){
            System.out.println("In B");
        }
    }
}
public class inner{
    public static void main(String[] args){
        System.out.println("Inner Class");
     A obj = new A();
     obj.Drive();

    //  A.B obj1 = obj.new B();// For non static 
    A.B obj1 = new A.B();
     obj1.Show();

     

    //inner.java
    }
}