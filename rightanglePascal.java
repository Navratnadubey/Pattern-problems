import java.util.*;

public class rightanglePascal {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
          System.out.print("*");
        }
        System.out.println();
      }
      for(int i=2;i<=n;i++){
        for(int j=n;j>=i;j--){
          System.out.print("*");
        }
        System.out.println();
      }
  }
}