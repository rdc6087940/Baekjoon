import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)  {
      Scanner sc = new Scanner(System.in);
      
      StringBuffer sb = new StringBuffer(sc.next());     

      if(sb.toString().equals(sb.reverse().toString())){
        System.out.println("1");
      }else{
        System.out.println("0");
      }
      
    }
}
