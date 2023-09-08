import java.util.Scanner;

public class store{
    public static void main(String[] args){
        int i, n;
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter Array length");
        n= sc.nextInt();

        for(i=0; i<n; i++){
            System.out.println("Enter a["+i+"]");
            a[i] = sc.nextInt();
        }
        for(i=0; i<n; i++){
            System.out.println(a[i]);
        }


    }
}