
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class set{
    public static void main(String[] args){
        System.out.println("Welcome to Set");
        Set<Integer> no = new TreeSet<Integer>();
        no.add(83);
        no.add(35);
        no.add(0);
        no.add(7);
        no.add(0);
        System.out.println(no);
        for(int n : no){
             System.out.println(n);
         }
         System.out.println("Now");
          Iterator<Integer> now = no.iterator();
          while (now.hasNext()) { 
            System.out.println(now.next());
              
          }

        







        
    }
}