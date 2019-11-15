import java.util.Scanner;

public class Main1{
    public static void main(String []args){
        Scanner in =new Scanner(System.in);
        while(in.hasNext()){
            int a=in.nextInt();
            int b=0;
            int c=1;
            int d=b+c;
            while(d<a){
                b=c;
                c=d;
                d=b+c;
            }
            int num=d-a>a-c?d-a:a-c;
            System.out.println(num);
        }
    }
}