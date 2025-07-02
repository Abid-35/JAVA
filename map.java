import java.util.HashMap;
import java.util.Map;




public class map{
    public  static void main(String[] args){
        System.out.println("Maps in java");
        Map<String , Integer> so = new HashMap<>();
        so.put("Abid", 10);
        so.put("Karthik", 19);
        so.put("Vishal",22);
        so.put("Manoj", 30);
        System.out.println(so);
        System.out.println(so.get("Abid"));
        for(String name : so.keySet()){
            System.out.println("The key is :" + name );
            System.out.println( " value is : " +so.get(name));
        }




    } 
}