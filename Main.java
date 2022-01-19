import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        int x, y, nthPowOfX;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of x: "); 
      x=sc.nextInt();
      System.out.println("Enter the value of y: ");
      y=sc.nextInt();
      nthPowOfX=x;
      for(int i=1;i<y;i++){
          nthPowOfX*=x;
      }
      System.out.println("Yth Power of X is: " + nthPowOfX);
    }
}
