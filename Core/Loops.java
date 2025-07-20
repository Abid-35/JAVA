public class Loops {
    public static void main(String[] args){
        System.out.println("Welcome to Loops ");
        // While Loop
        int i = 1;
        while(i<=4){
            System.out.println("Hi");
            int j = 1;
            while(j<=4){
                System.out.println("Nice to  meet to You ");
                j++;
            }
            i++;
        }

        //Do While

        int n = 6;
        do{
            System.out.println("Hi My Cute Little Red Flags" + n );
            n++;
        }while(n<=5);

        //For Loop
        for (int m = 1 ; m<=5 ;m++){
            System.out.println("Day" +m);
            for(int l = 1;l<=5 ;l++){
                System.out.println(" " +(l+8) +"-"+(l+9));
            }
        }   
            //Writing For Loop like While Loop
            int x =4 ;
            for(;x<5;){
                System.out.println("Rebel Kid");
                x++;
            }
    }
}