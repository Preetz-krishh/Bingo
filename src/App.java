import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = 5;
        int b = sc.nextInt()-1;
        System.out.printf("%dx%d",b/a+1,b%a+1);
        sc.close();
    }
}
