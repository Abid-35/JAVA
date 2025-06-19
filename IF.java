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

        //Good Way
        if(num>numb && num>num3){
            System.out.println("num is the graetest");
        }
        else if(numb>num3){
            System.out.println("numb is the greatest");
        }
        else{
            System.out.println("num3 is the greatest");
        }
    }
}