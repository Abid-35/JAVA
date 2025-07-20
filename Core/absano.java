abstract class A{
    public abstract  void Show();
}


public class absano {
    public static void main(String[] args) {
        // Your code here
        System.out.println("Absract  Class and Anonymous Class Example");

        A obj = new A() {
            public void Show() {
                System.out.println("In Show");
            }
        };

        obj.Show();
    }
}