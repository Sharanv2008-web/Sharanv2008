import java.util.Scanner;
class Greater{
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        int n,m;
        System.out.println("Enter Number:");
        n=ob.nextInt();
        m=ob.nextInt();
        if(n>m){
            System.out.println(n+" is greater than "+m);
        }
        else{
            System.out.println(m+" is greater than "+n);
        }
    }
}