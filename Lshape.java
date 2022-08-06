import java.util.*;

public class Lshape {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
          if(j==1){
            System.out.print("*");
          }else if(i==n){
            System.out.print("*");
          }
        }
        System.out.println();
      }
  }
}