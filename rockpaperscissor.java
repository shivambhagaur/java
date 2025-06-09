import java.util.*;
import java.util.Random;

class rockpaperscissor{
    public static void main(String[] args){
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("CHOSSE ONLY THESE OPTIONS:0=stone;1=PAPER;2=SCISSOR");
        int shivam = sc.nextInt();
        switch (shivam){
            case 0:
                System.out.println("STONE");
                break;
            case 1:
                System.out.println("PAPER");
                break;
            case 2 :
                System.out.println("SCISSOR");
                break;
        }
        System.out.println("COMPUTER CHOOSE:");
        int computer = random.nextInt(3);
        switch (computer){
            case 0:
                System.out.println("STONE");
                break;
            case 1:
                System.out.println("PAPER");
                break;
            case 2 :
                System.out.println("SCISSOR");
                break;
        }
        if(computer==1&&shivam==0){
            System.out.println("COMPUTER WIN");
        }
        else if(computer==0&&shivam==1){
            System.out.println("SHIVAM WIN");
        }
        else if(computer==2&&shivam==0){
            System.out.println("SHIVAM WIN");
        }else if(computer==0&&shivam==2){
            System.out.println("COMPUTER WIN");
        }
        else if(computer==1&&shivam==2){
            System.out.println("SHIVAM WIN");
        }else if(computer==2&&shivam==1){
            System.out.println("COMPUTER WIN");
        }
        else{
            System.out.println("MATCH DRAW");
        }
    }
}