public class wrapper{
    public static void main(String args[]){
        System.err.println("Welcome to the Wrapper Classes");
        int num = 55;
        Integer num1 = num;  //Auto-Boxing
        System.err.println(num1);

        int num3 = num1;
        System.err.println(num3);  //Auto-Unboxing

        String str = "15";
        int numb = Integer.parseInt(str);
        int res = numb*3;
        System.err.println(res);



    }
}