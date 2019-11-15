import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        String b=in.nextLine();
        String c=a+a;
        if(c.contains(b)){
            System.out.println(true);
        }
    }
}
