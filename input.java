// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
import java.util.Scanner;

public class input {
     public static void main(String[] args) {
    // throws IOException {

    //     System.out.println("Enter a number");

    //     InputStreamReader in = new InputStreamReader(System.in);
    //     BufferedReader bf = new BufferedReader(in);

    //     int num = Integer.parseInt(bf.readLine());
    //     System.out.println(num);

    //     bf.close();
    System.out.println("Enter the number:");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.println("Enter the name:");
    Scanner soc = new Scanner(System.in);
    String str = soc .nextLine();
    System.out.println("You entered :"+num);
    System.out.println("You entered :"+str);

    }
}


