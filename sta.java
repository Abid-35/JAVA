

    class device{
        int cost;
        String brand;
         static String name; // we should access static variable in static method i.e we should refer then by class name;

    public device(){
        cost = 1555;
        brand ="";
        System.out.println("In Static block");

    }     

    static {
        name = "cam";
        System.out.println("In Constructor block");
    }
    
    public void show(){
        System.out.println("My: " + brand + ": " + name + " is " + cost + " Rupees");
    }

    public static void show1(device  obj){    //Static method their is no need of obj in static method to work
        System.out.println( name + obj. brand + obj. cost);
    }
    }
    
public class sta{
    public static void main(String[] args){
        System.out.println("Hello About Static Variables");

        device obj1 = new device();
        // obj1.cost = 12000;
        // obj1.brand = "Apple";
        // device.name = "Smartphone";
        // device obj2 = new device();
        // obj2.cost = 15000;
        // obj2.brand = "IQOO";
        // device.name = "Smartphone";

        // device.name ="Mobile";

        obj1.show();
        // obj2.show();
        device.show1(obj1);

        // static keywords belongs to class..




    }
}