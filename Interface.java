interface A{
    int age = 20; // public static final by default
    void Show(); // public abstract by default
    } 
 class  B implements A{
    public void Show(){
        System.out.println("In B");
    }
     }
 public class Interface{
    public static void main(String[] args){
        System.out.println("Welcome to Interface");
        A obj = new B();
        obj.Show(); // Calls the Show method of class B
        System.out.println(A.age);


            }
}