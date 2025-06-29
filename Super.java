class A extends Object{
    public A(){
        System.out.println("In A");
    }
        public A( int n){
        System.out.println("In Int A");
    }
}   
class B extends A {
    public B(){
        super(3);
        System.out.println("In B");
    }
        public B( int n){
            this();
        System.out.println("In Int B");
    }
}  



public  class Super{
    public static void main (String[] args){
        System.out.println("About Super and this ");

        B obj = new B(5);

        // Super() method is used to call the constructor of the super class.
        //this() method is used to call the constructor of the same class.

    }
    }
