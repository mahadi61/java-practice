import java.util.Scanner;

public class table {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter a number for table:");
        n = sc.nextInt();

        for(int i = 1;i<=10; i++){
            int result = n * i;
            System.out.println(+n+"*"+i+"="+result);
        }
}
}
