
package aust.studentmanagement;

public class Student {
   private String name;
   private String id;

    public Student(String name, String id) throws InvalidNameException,InvalidIdException {
            setName(name);
            setId(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidNameException{
        if(name==null || name.trim().isEmpty())
        {
            throw new InvalidNameException(name);
        }
                String[] parts=name.split(" ");

  if(parts.length !=2)
    {
                throw new InvalidNameException(name);
     }
        
        for(int i=0;i<parts.length;i++)
        {
            String part=parts[i];
            for(int j=0;j<part.length();j++)
            {
                char ch=part.charAt(j);
                if(!(ch>='A' && ch<='B'))
                  {
                     throw new InvalidNameException(name);
                  }
            }
        }
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) throws InvalidNameException {
        for(int i=0;i<)
        if(!())
        this.id = id;
    }
   
}
