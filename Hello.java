class Hello {
    public static void main(String args[])
    { 
        // Data types 

        byte by = 12;
        short sh = 100;
        int num = 129;  //Default
        long  l = 12345l;

        float dec = 4.5f;
        double d = 5.8;  //Default

        char letter = 'k';
        char dig = '3';

        boolean bool = true;

        // Literals = Fixed values in the code are knowns as Literals , Which  can  be assigned to the variables , and in the conditions .

        char salmon = 'a';
        char simon  = salmon++;
        System.out.println(salmon);
        System.out.println(simon);

        // Type Conversion 

        byte A = 12;
        int b = 258;
        int c = A;
        System.out.println(c);

        // Type Casting

        int no = 257;
        byte yes =127;
        byte know = (byte)no;
        System.out.println(know);

        //Type Promotion 

        byte num1 = 10;
        byte num2 = 30;
        int res = num1*num2;
        System.out.println(res);

        //Arithematic Operators 

        int oper1 = 2;
        int oper2 = 6;
        int add = oper1+oper2;
        int sub = oper1-oper2;
        int mul = oper1*oper2;
        int div = oper1/oper2;//division means quotient
        int mod = oper1%oper2;//modulo means remainder
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);



        //Increment
        int pre = ++oper1;//Pre-Increment  output = 3
        System.out.println(pre);
        int pos = oper2++;//Post-Increment output = 6
        System.out.println(pos);
        System.out.println(oper2);

        
        System.out.println("hello world");
    }

}

