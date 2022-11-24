import java.util.Scanner;

public class Odd_Parity_Generator_and_Checker {
    public static boolean decision(int n){
        boolean x;
        if(n==0)
            x=false;
        else
            x=true;
        return x;

    }
    public static boolean xnor(int x, int y){
        boolean p,q;
        p=decision(x);
        q=decision(y);
        return (!(p^q));
    }
    public static boolean xor(int x, int y){
        boolean p,q;
        p=decision(x);
        q=decision(y);
        return ((p^q));
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int a,b,c;
        System.out.print("Bit value of a: ");
        a = sc.nextInt();
        System.out.print("Bit value of b: ");
        b = sc.nextInt();
        System.out.print("Bit value of c: ");
        c = sc.nextInt();

        int d,p,u1,u2,u3;

        //Parity bit generator
        if(xnor(b,c))
            d =1;
        else
            d=0;

        if(xor(a,d))
            p =1;
        else
            p=0;
        System.out.println();
        System.out.println("********************* The Parity Bit Generator ********************");
        System.out.println("The parity bit generated is "+p);
        System.out.println("*******************************************************************");
        System.out.println();

        //Parity bit receiver or checker
        System.out.print("Enter the value of transmitted parity value to receiver: ");
        int e=sc.nextInt();
        if(xnor(a,b))
            u1=1;
        else
            u1=0;
        if(xnor(c,e))
            u2=1;
        else
            u2=0;
        if(xnor(u1,u2))
            u3=1;
        else
            u3=0;

        System.out.println();
        System.out.println("******************* Odd Parity Checker **********************");
        if(u3==0){
            System.out.println("No Error!");
            System.out.println("There are odd no. of 1s in received message");
        }
        else{
            System.out.println("Error!!!!");
            System.out.println("There are even no. of 1s in received message");
        }

        System.out.println("*************************************************************");
    }
}
