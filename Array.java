public class Array{
    public static void main(String[] args){

        int num[]={1,3,5,6};
        for(int i = 0 ;i<=3 ;i++){
            System.out.println("The Values are " + " " + num[i]);
        }

        int num1[] = new int[4];
         num1[0]=35;
         num1[1]=30;
         num1[2]=34;
         num1[3]=39;
         for(int i = 0 ;i<=3 ;i++){
            System.out.println("The Values are " + " " + num1[i]);
        }
        System.out.println("Welcome");

        //Multi Dimensional Array 

        int arr[][] = new int[3][4];

        for(int i = 0 ; i<3 ; i++){
            for(int n =0 ; n<=3 ;n++){
                arr[i][n] = (int)(Math.random()*10);
            }
        }


        for (int i = 0 ;  i<3 ; i++){
            for(int n = 0 ; n<4 ;n++){
                System.out.print(arr[i][n] + "");
            }
            System.out.println();
       }

        System.out.println("USing enhanced loop");
        for(int n[]:arr){
            for(int m:n){
                System.out.print(m +"");
            }
            System.out.println();
        }
        System.out.println("Jagged Array");
        //Jagged array
        int nor[][] = new int[3][];
        nor[0] = new int[3];
        nor [1] = new int[2];
        nor [2] = new int[4];
        for(int i = 0 ; i<nor.length ;i++){
            for(int n = 0 ; n<nor[i].length;n++){
                nor[i][n]=  (int)(Math.random()*10);
            }
        }

        for(int n[]:nor){
            for(int m : n){
                System.out.print(m+"");
  }
            System.out.println();
        }

    }
     
}