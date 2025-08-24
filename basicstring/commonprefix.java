import java.util.*;

public class commmonprrefix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        String [] arr = new String[a];

        StringBuilder prefix = new StringBuilder();
        for(int i = 0;i<a;i++){
            arr[i] = sc.nextLine();
        }
        int min = arr[0].length();
        for(int i =0 ;i<a;i++){
            min = Math.min(min,arr[i].length());
        }
        for(int i =0;i<min;i++){
            char ch = arr[0].charAt(i);
            boolean match = true;
            for(int j =0 ;j<a;j++){
                if(arr[j].charAt(i)!= ch){
                    match = false;
                }
            }
            if(match){
                prefix.append(ch);
            }
            else {
                break;
            }
        }
        if(prefix.length()==0){
            System.out.println(" ");
        }
        else{
            System.out.println(prefix.toString());
        }
    }
}
