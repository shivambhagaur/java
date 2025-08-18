import java.util.*;

class palindorme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //take a input
        String name = sc.nextLine();
        //remove the space of input 
        String clear = name.replaceAll(" ", "");
        //count the length
        int len = clear.length();
        String reverse = "";
        for (int i = len - 1; i >= 0; i--) {
            reverse = reverse + clear.charAt(i);
        }
        //print a reverse string 
        System.out.println(reverse);
        //check 
        if(clear.equalsIgnoreCase(reverse)){
            System.out.println("PALINDROME NUMBER");
        }
        else{
            System.out.println("NOT PALINDOME NUMBER");
        }
    }
}
