
package batsmanselection;

import java.util.Scanner;

public class BatsmanSelection {


    public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
        System.out.println("Total Runs :");
        int run=sc.nextInt();
        System.out.println("Total Outs: ");
        int out=sc.nextInt();
        System.out.println("Selection Criteria : ");
        int select=sc.nextInt();
        Batsman b1=new Batsman(run,out);
        Committee c=new Committee(select);
        c.calculatedAverage(b1);
    }
    
}
