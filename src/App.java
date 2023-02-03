import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt()-1;
        System.out.println("row:"+b/a);
        System.out.println("column:"+b%a);
        sc.close();
    }
}
