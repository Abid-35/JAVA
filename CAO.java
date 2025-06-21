 class Adder{// cass name 
    int a ;//instant variable used to store object related data 
    public int Add(int n1 ,int n2){ //method
        return n1+n2;
    }
}
class Subtractor {
        int a;
         public int Sub (int n3 ,int n4) {
            int res = n3-n4;
            return res;

        }
    }

  class computer{
    public void playmusic(){
        System.out.println("Music is playing");
    }
    public String getmypen(int  cost){
        if(cost>=10)
           return "pen";
        return "nothing";   
    }
    class overloading{
        public int add(int n1 ,int n2 ,int n3) {
            return n1+n2+n3;
        }
        public int add(short n1 , short n2 , short n3 ){
            return n1+n2+n3;
        }
                public int add(short n1 , short n2  ){
            return n1+n2;
        }
    }
  }  
public class CAO{
    public static void main (String[] args){
        int num1 = 5;
        int num2 = 6;
        int num3 = 4; 

        int so = 10;
        int on = 50;

        Adder sum = new Adder();//Creating object of adder class & sum  is refernce variable ..
        int result = sum.Add(sum.Add(num1 , num2),num3);//calling method using object..
        System.out.println(result);

        Subtractor dif = new Subtractor();
        int op = dif.Sub(on , so );
        System.out.println(op);

        computer fun = new computer();
        fun.playmusic();
        String note = fun.getmypen(1);
        System.out.println(note);

    }
}

    //Term	Meaning	Example
    //Class	Blueprint	Calculator
    //Instance (Object)	Real thing created from blueprint	new Calculator()
    //Reference Variable	Name that points to the object	calc

    //Method Overriding 
    //Creating same method with different no of the parameters and  different type 

    

        


    

