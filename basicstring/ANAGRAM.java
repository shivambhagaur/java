import java.util.*;

class anagram {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toLowerCase();
        String b = sc.nextLine().toLowerCase();
        int len = a.length();
        int leb = b.length();
        if(len!=leb){
        System.out.println("NOT ANAGRAM");
}
        else{
            char arr1[] =a.toCharArray();
            char arr2[] = b.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if(Arrays.equals(arr1,arr2)){
                System.out.println("ANAGRAM ");
            }
            else{
                System.out.println("NOT ANAGRAM");
            }
        }
    }}
