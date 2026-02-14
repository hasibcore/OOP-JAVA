
package codetest;

import java.util.Scanner;

public class CodeTest {

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Input Methods: ");
        int method1=sc.nextInt();
        System.out.println("Input Methods,Lines Per Method : ");
        int method2=sc.nextInt(),lpMethod1=sc.nextInt();
         System.out.println("Input Methods,Lines Per Method,Redundantline Per Method : "); 
        int method3=sc.nextInt(),lpMethod2=sc.nextInt(),rpMethod=sc.nextInt();
   CodeFactory codef = new CodeFactory();

Code c1 = codef.CreateCode(method1);
Code c2 = codef.CreateCode(method2, lpMethod1);
Code c3 = codef.CreateCode(method3, lpMethod2, rpMethod);
c1.displayCode();
c2.displayCode();
        c3.displayCode();
    }
    
}
