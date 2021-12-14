import java.util.Scanner;

public class NameReverse {
  public static void main (String [] args) {
   
   Scanner sc= new Scanner(System.in);
  
   System.out.println ("digite um nome");
   String name = sc.nextLine();
   System.out.println("");
    
   int length = name.length(); 
   System.out.println(name+" ao contrário:");
    
   for(int i=1;i<=length;i++){
       String reverse = name.substring(length-i,length-(i-1));
       System.out.print(reverse);
     }


 }
}
