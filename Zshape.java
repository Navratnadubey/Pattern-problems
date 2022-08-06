import java.util.*;

public class Zshape {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      for(int i=1;i<=n;i++){
        if(i==1 || i==n){
        for(int j=1;j<=n;j++){
          System.out.print("*");
        }
        }else if(i>1 && i<n){
        for(int j=-1;j<=n;j++){
          if((i+j)==n-1){
            System.out.print("*");
          }else{
            System.out.print(" ");
          }
        }
        }
        System.out.println();
      }
  }
}