class A {
    public void show(){
        System.out.println("In A");

    }
}
class B extends A{
    public void show2(){
        System.err.println("In B");
    }
}




public  class castingc{
    public static void main(String args[]){
        System.out.println("Welcome to casting");
         A obj = new B();
         obj.show();//Up Casting
        // //  obj.show2();

         B obj1 = (B) obj;
         obj1.show2();//Down Casting

 

    }
}