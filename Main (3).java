import java.util.*;
public class Main{
public static void main(String [] args){
  Scanner kbd=new Scanner(System.in);
  int temp,N,cnt=0;
  N=kbd.nextInt();
  for(int i=1;i<=N;i++){
    temp=kbd.nextInt();
    if(temp<0){
      cnt++;
    }
  }System.out.print(cnt+"\n");

}
}