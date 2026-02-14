
package studentmanagement;

public class StudentManager {
    public Student searchStudentById(Student[] StudentInfo,int id)
    {
        for(int i=0;i<StudentInfo.length;i++)
        {
            if(id==StudentInfo[i].getId())
            {
                return StudentInfo[i];
            }
        }
           return null;
        
    }
}
