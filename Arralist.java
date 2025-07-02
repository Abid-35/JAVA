import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
public class Arralist{
    public static void main(String[] args) {
        System.out.println("Welcome for the List ");
        Collection<Integer> num = new ArrayList<Integer>();
        num.add(2);
        num.add(4);
        num.add(6);
        num.add(10);
        System.out.println(num);
        for(Object n : num){
            System.out.println(n);
        }

        //To acess with index numbers we need to use List not the Collection..   
        
        List<Integer> nums = new ArrayList<Integer>();   
        nums.add(3);
        nums.add(5);
        nums.add(9);
        nums.add(8);
        System.out.println(nums);
        System.out.println("The Value at index 2 :" + nums.get(2));
        System.out.println("The Index Value of 8 :" + nums.indexOf(8));
        System.out.println("Enhanced For Loop ");
        for(int n : nums){
            System.out.println(n);
        }
        System.out.println("For Loop");
        for(int i=0;i<nums.size();i++){
        System.out.println("The Value at index" + i +":" + nums.get(i));
        }
        
    }}
