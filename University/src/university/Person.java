
package university;

public class Person {
    private String name;
    static int count=0;
     public Person(String name)
    {
        this.name=name;
        count++;
    }
    void setName(String name)
    {
        this.name=name;
    }
    String getName()
    {
        return name;
    }
   void showInfo()
   {
       System.out.println("Name : "+name);
   }
}
