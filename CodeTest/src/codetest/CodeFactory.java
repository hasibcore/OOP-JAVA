
package codetest;

public class CodeFactory {

    public CodeFactory() {
    }
    Code CreateCode(int methods)
    {
        Code c1=new Code(methods*20);
        return c1;
    }
     Code CreateCode(int methods,int linesPerMethod)
    {
        Code c2=new Code(methods*linesPerMethod);
        return c2;
    }
      Code CreateCode(int methods,int linesPerMethod,int redundantLinePerMethod)
    {
        Code c3=new Code((methods*linesPerMethod)/redundantLinePerMethod);
        return c3;
    }
}
