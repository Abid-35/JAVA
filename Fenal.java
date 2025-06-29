 final class cal{
    public void add(int n1 , int n2){
        System.err.println(n1 + n2);
    }
}

class Adcal extends cal{

}

class no {
    public final void show(){
        System.err.println("Created By me");
    }
}


class yes extends no{
    public void show(){

    }
}



public class Fenal{
    public static void main(String[] args){
        
        System.out.println("Lets talk about Final");

        // Final -- Var , Class , Method

        //Final -- Var we Use final to make variable contants
        final double PIE = 4.13;
        System.err.println(PIE);

        // Final -- Class we use final to stop inheritance


        // Final -- Method we use stop overriding the method
    }
} 