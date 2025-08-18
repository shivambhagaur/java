import java.util.*;

public class duplicatechar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toLowerCase();
        boolean b = false;
        for(int i =0;i<a.length();i++){
            char c = a.charAt(i);
            for(int j = i+1;j<a.length();j++){
                if(c==a.charAt(j)){
                    b = true;
                    System.out.println("DUPLICATES CHARACTERS : "+ c);
                }
            }
        }
        if(!b){
            System.out.println("NOT FOUND DUPLICATE");
        }


    }
}
