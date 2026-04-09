package librarysystem;
import java.util.ArrayList;
public class LibrarySystem {
    public static void main(String[] args) {
Member m1=new Member("Alice", 8);
Member m2=new Member("Bob", 4);
Media b1=new Book(7, "Cosmos", 9);
Media b2=new Book(10, "Advanced Calculus", 9.5);
Media ma1=new Magazine(5, "Sci-Fi Monthly", 8.5);
Library L=new Library();
L.addMedia(b1);
L.addMedia(b2);
L.addMedia(ma1);
        System.out.println(L.recommendMedia(m1).getTitle()+" is recommended for "+m1.getName());
  
        System.out.println(L.recommendMedia(m2).getTitle()+" is recommended for "+m2.getName());
      
    } 
    
}
