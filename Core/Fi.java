@FunctionalInterface
interface Sam{
    void display();

}
// class know implements Sam{
//     public void display(){
//         System.out.println("It is a SAM");
//     }
// }



public class Fi{
    public static void main(String args[]){
        System.out.println("Welcome to the Single Abstract Method (SAM) example!");
        Sam obj = new know()
        {
            public void display() {
                System.out.println("It is a SAM");
            }
        };
        obj.display();
    }
}