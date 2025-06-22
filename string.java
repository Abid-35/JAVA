    class string{
    public static void main(String args[]){
        System.out.println("Jiraya");

        String name = "Abid";
        name = name+" Khan ";
        System.out.println(name);

         String s1 = "navin";
         String sa = "navin";

         System.out.println(s1 == sa );


         String nor = "Sydhani"; // In String Constant  Pool.
         String sam = new String("Sydhani");// This creates new object in heap memory.

         System.out.println(nor == sam);        // false → Compares Address so false.
         System.out.println(nor.equals(sam));   // true →  Same Data in both variables i.e Sydhani and Sydhani values are same

    }
}