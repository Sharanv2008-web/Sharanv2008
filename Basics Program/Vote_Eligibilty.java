import java.util.Scanner;
class Vote{
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        int n;
        System.out.println("Enter Number:");
        n=ob.nextInt();
        if(n>=18){
            System.out.println("Mani is eligible to vote");
        }
        else{
            System.out.println("Mani is not eligible to vote");
        }
    }
}