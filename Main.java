import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        int x, y, nthPowOfX;
      Scanner sc = new Scanner(System.in);
      x=sc.nextInt();
      y=sc.nextInt();
      nthPowOfX=x;
      for(int i=1;i<y;i++){
          nthPowOfX*=x;
      }
      System.out.println(nthPowOfX);
    }
}
