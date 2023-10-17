
package Project;

import java.util.Scanner;
class Calculator {
    static void solver(int a,int b, char c,int d){
        switch (c){
            case('+'):
                d=a+b;
                System.out.println(d);
            case('-'):
                d=a-b;
                System.out.println(d);
            case('*'):
                d=a*b;
                System.out.println(d);
            case('/'):
                d=a/b;
                System.out.println(d);
        System.out.println("result is "+d);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,d;
        d=0;
        char c;
        System.out.println("========================");
        System.out.println("Calculadoras method exam");
        System.out.println("========================");
        System.out.println("enter your number 1: ");
        a=input.nextInt();
        System.out.println("enter your number 2: ");
        b=input.nextInt();
        System.out.println("enter the operator: ");
        c=input.next().charAt(0);
        solver(a,b,c,d);
        System.out.println(" ");
        input.close();
    }
}
