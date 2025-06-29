class Demo{
    public int add(int n1, int n2){
      return n1+n2;
    }
}
class Nom extends Demo{
    public int add(int n1,int n2){
        return n1+n2+1;
    }
}



public class moverriding{
    public static void main(String[] args) {

        System.out.println("Hello World");
        Nom obj = new Nom();
        int r2 = obj.add(4,3);
        System.out.println(r2);
        
        Demo obj2  = new Demo();
        int r3 = obj2.add(1, 2);
        System.out.println(r3);
    }}
