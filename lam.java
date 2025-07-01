@FunctionalInterface
interface no{
    int add(int a, int b);
}

public class lam{
    public static void main(String[] args) {
        System.out.println("Welcome to the Lambda Expression example!");
        no obj = (a,b)-> a+b;
        System.out.println(obj.add(2, 7));
        
    }}

    //Lambda Expression if it has only one statement then no need of cruly brackets and return keyword for expression.