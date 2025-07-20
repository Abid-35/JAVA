interface Computer{
    void code();
}
class laptop implements Computer{
    public void code(){
        System.out.println("Laptop is Given to you");
    }
}
class desktop implements Computer{
    public void code(){
        System.out.println("Desktop is Given to you");
    }
}
class developer{
    public void devapp(Computer lap){
        lap.code();
    }
}
public class ninterface{
    public static void main(String[] args){
        System.out.println("Welcome to Interface");
        developer dev = new developer();
        Computer lap = new laptop();
        Computer desk = new desktop();
        dev.devapp(lap);
        dev.devapp(desk);
    }
}