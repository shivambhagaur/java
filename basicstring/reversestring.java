import java.util.*;

class reverse{
    public static  void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String clear = name.replaceAll(" ","");
        int len = clear.length();
        String reverse ="";
          for(int i = len-1;i>=0;i--){
                reverse = reverse + clear.charAt(i);
          }
          System.out.println(reverse);
    }}
