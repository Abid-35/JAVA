
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class stream{
	public static void main(String[] args){
		System.out.println("Welcome to Stream");
		List<Integer> now = Arrays.asList(2,3,4,5);
		System.out.println(now);
		System.out.println("stream");
		Stream<Integer> no = now.stream();
		no.forEach(n-> System.out.println(n));
		System.out.println("Filter");
		Stream<Integer> fil = now.stream().filter(n->n%2!=0);
		fil.forEach(n->System.out.println(n));
		System.out.println("Map");
		Stream<Integer> filt = now.stream().map(n->n*5);
		filt.forEach(n->System.out.println(n));
		System.out.println("Reduce");
		int result = now.stream().reduce(0,(c,e)->c+e);
		System.out.println(result);
   
        List<Integer> nom = Arrays.asList(1,2,3,4,5,6,7,9);
		int res = now.stream()
		             .filter(n->n%2==0)
					 .map(n->n*2)
					 .reduce(0,(c,e)->c+e);
		System.out.println("All at once " +res);			 


		


 	}
 }
