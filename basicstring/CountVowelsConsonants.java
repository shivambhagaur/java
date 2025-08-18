import java.util.*;

public class countvc{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase().replaceAll(" ","");
        int vow = 0;
        int cons  = 0;
        int len = str.length();
        for(int i =0;i<=len-1;i++){
            char b =  str.charAt(i);
            if(b =='a'||b=='e'||b=='i'||b=='o'||b=='u'){

                vow++;
            }
            else{
                cons++;
            }
        }
        System.out.println("VOWELS : "+vow);
        System.out.println("CONSONANT : "+cons);

    }
