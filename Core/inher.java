 
class Calc{

    public int add( int n1 , int n2){
        return n1+n2;
    }

    public int sub(int n1 , int n2){
        return n1-n2;
    }

}

class Advancal extends Calc{
    public int mu(int n1 , int n2){
        return n1*n2;
    }
    public int div(int n1 , int n2){
        return  n1/n2;
    }
}

class Scicalc{

    public int pow(int n1 ,int n2){
        return (int)(Math.pow(n1, n2));
    }

}



public class inher{
    public static void main(String[] args) {
        System.out.println("Wlcome to Inheritances");

        Calc obj = new Calc();
        int r1 = obj.add(05,26);
        int r2 = obj.sub(21, 35);
        System.out.println(r1 + " "+ r2);

        Advancal obj2 = new Advancal();
        int r3 = obj2.add(41, 86);
        int r4 = obj2.sub(05, 02);
        int r5 = obj2.mu(05, 05);
        int r6 = obj2.div(25,5);
        System.out.println(r3 + " "+ r4 +" "+r5+" "+r6);

        Scicalc obj3 = new Scicalc();
        int  pow = obj3.pow(2, 4);
        System.out.println(pow);


        




    }
}

// Single Level Inheritance 
// A (Parent Class)
// B (Child Class)
// Multi Level Inheritanc 
// A (Parent Class)
// B (Child Class // Parent class of C)
// C (Child Class )


//Multiple Inheritance 
//  A     B
//  |     |
//  -  C  -
// It is not their in java 
// It is Ambiguity Problem