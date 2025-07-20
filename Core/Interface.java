interface A{
    int age = 20; // public static final by default
    void Show(); // public abstract by default
    }
    interface C {
        void Write();
    }
    interface D extends C {
        void Read();
    }

 class  B implements A,D{
    public void Show(){
        System.out.println("In B");
    }
    public void Write() {
            System.out.println("Writing...");
        }
    public void Read() {
            System.out.println("Reading...");
        }
     }
 public class Interface{
    public static void main(String[] args){
        System.out.println("Welcome to Interface");
        A obj = new B();
        obj.Show(); // Calls the Show method of class B
        System.out.println(A.age);
        B obj1 = new B();
        obj1.Write(); // Calls the Write method of class E
        obj1.Read(); // Calls the Read method of class E  

            }
}