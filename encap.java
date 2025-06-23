class Human{
   private int age;
   private String name;

     


    // public void setage(  int age){
    //     this.age = age;
    // }

    // public int  getage(){
    //     return age;
    // }

    // public void setname(  String name){
    //     this.name = name;
    // }

    // public String getname(){
    //     return name;
    // }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


public class encap{
    public static void main(String[] args) {
        System.out.println("Encapsulation");
        Human obj  = new Human();
        obj.setAge(20);
        obj.setName("Abid");
        System.out.println(obj.getName()+":"+obj.getAge());

    }
}