public class IF{
    public static void main(String args[])
    {
        //IF 
        int x = 20;

        if(x>10)
        System.out.println("I am abid");

        //IF ELSE 
        int num = 20;
        int numb = 30;
        if(num>numb)
        System.out.println("num is Greater than numb");
        else
        System.out.println("num is less than numb");

        // IF ELSE IF

        int num3 =40;
        if(num>numb) {
            if(num>num3){
            System.out.println("num is greater than all");
            }
            else{
                System.out.println("num3 is greaater than all");
            }
        }
        else{
            if(numb>num3){
                System.out.println("numb is greater than all");
            }
            else{
                System.out.println("num3 is greater than all");
            }
        }

        //Efficient  Way
        if(num>numb && num>num3){
            System.out.println("num is the graetest");
        }
        else if(numb>num3){
            System.out.println("numb is the greatest");
        }
        else{
            System.out.println("num3 is the greatest");
        }

        //Ternary operator 
        int a = 10, b = 20;
        int max = (a > b) ? a : b;
        System.out.println("Max is: " + max); // +max is used for  as the "MAx is "string  max is int so used for concatniation.

        int n = 6 ;
        String res = "";
         res = (n%2==0)?"Even":"Odd";
        System.out.println(res);

        //Switch (Old)

        int day =0;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;    
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break; 
            default:
               System.out.println("Enter a Valid Data");                        
        }

        // New Switch The Updates are the instead of semicolun we can use arrowmark instead  of break keyword if u want use semicolumm then we need to use yield keyword 
        // we can use for the strings also and return the values also 

        String Day = "sunday";
         String result = switch (Day){

            case"sunday","Saturday" -> "8Am";
            default ->"10 AM";
            // case"sunday","Saturday": yield  "8Am";
            // default: yield "10 AM";
        };
        System.out.println(result);

    }
}