package librarymanager;

import java.util.Scanner;

public class LibraryManager {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.print("Number of Books: ");
        int no=sc.nextInt();
        Book[] book=new Book[no];
        for(int i=0;i<no;i++)
        {
             
            System.out.print("\nBook "+(i+1)+" Id :");
            int id=sc.nextInt();
            System.out.print("\nBook "+(i+1)+" Price :");
            double price=sc.nextDouble();
            System.out.print("\nBook "+(i+1)+" Title :");
            sc.nextLine();
            String title=sc.nextLine();
            book[i]=new Book(id,title,price);
            Book.totalBooksCreated=i+1;
        }
        System.out.print("\nFilter Price : ");
        double price1=sc.nextDouble();
        BookHelper bookHelper=new BookHelper();
       int[] idArray= bookHelper.filterByprice(book,price1);
        System.out.println("Filtered Book Id : ");
       for(int i=0;i<idArray.length;i++)
        {
            if(idArray[i]!=0){
            System.out.println(idArray[i]);
            }
        }
       BookHelper.printAllBooks(book);
        System.out.println("Total Books Created : "+Book.totalBooksCreated);
    }
    
}
