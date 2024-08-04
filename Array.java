package array;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Enter array size:");
        n = s.nextInt();
        
        int x[] = new int[100];
        
        System.out.println("Enter array values:");
        for (int i =0; i < n; i++) {
            x[i] = s.nextInt();
        }
        
System.out.println("Print array values:");
for (int i = 0; i < n; i++) {
    System.out.print(x[i] + " ");
}
    }
}
