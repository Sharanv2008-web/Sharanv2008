import java.util.Scanner;
class Smaller{
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        int n,m,p;
        System.out.println("Enter Number:");
        n=ob.nextInt();
        m=ob.nextInt();
        p=ob.nextInt();
        if(n<m && n<p){
            System.out.println(n+" is smaller than "+m+"&"+p);
        }
        else if(m<n && m<p){
            System.out.println(m+" is smaller than "+n+"&"+p);
        }
        else{
            System.out.println(p+" is smaller than "+m+"&"+n);
        }
    }
}