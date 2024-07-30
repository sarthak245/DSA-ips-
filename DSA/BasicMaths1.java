import java.util.*;
public class BasicMaths1{
     static boolean palindrome(int n){
        int revNum = 0;
         int dup = n;
         while(n>0){
            int Id = n % 10;
            revNum = (revNum * 10) + Id;
            n = n/10;
         }
         if(dup == revNum){
            return true;
         }
         else{  
            return false;
         }
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(palindrome(number)){
            System.out.println(number + "is a palindrome");
        }
        else{
            System.out.println(number + "is not a palindrome");
        }
    }
}