package librarymanager;
public class BookHelper {
    public static int[] filterByprice(Book[] bok,double price)
    {
        int n=0;
        int[] booksIdArray=new int[bok.length];
        for(int i=0;i<bok.length;i++)
        {
           
            if(bok[i].getPrice()<price)
            {
                booksIdArray[n]=bok[i].getBookId();
                n++;
            }
            
        }
        return booksIdArray;
    }
    public static void printAllBooks(Book[] bok)
    {
        for(int i=0;i<bok.length;i++)
        {
            System.out.println(bok[i].getBookId()+" "+bok[i].getPrice()+" "+bok[i].getTitle());    
            
        }
   }
}