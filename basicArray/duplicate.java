import java.util.*;

class duplicate{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int [] arr = new int[a];
       boolean found =false;
       for(int i =0;i<a;i++){
           arr[i] = sc.nextInt();
       }
       for(int i =0;i<a;i++){
           for(int j =i+1;j<a;j++){
               if(arr[i]==arr[j]){
                   found = true;
                   System.out.print(arr[i]);
               }

           }
       }
       if(!found){
           System.out.println("NOT FOUND");
       }
        }
        }

