 class Adder{// cass name 
    int a ;//instant variable used to store object related data 
    public int Add(int n1 ,int n2){ //method
        return n1+n2;
    }
}
public class CAO{
    public static void main (String[] args){
        int num1 = 5;
        int num2 = 6;

        Adder sum = new Adder();//Creating object of adder class & sum  is refernce variable ..
        int result = sum.Add(  num1 , num2);//calling method using object..
        System.out.println(result);

    }
}