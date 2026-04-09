package librarysystem;

import java.util.ArrayList;

public class Library {
    private ArrayList<Media> array=new ArrayList<>();
    public void addMedia(Media m)
    {
        array.add(m);
        System.out.println(m.getTitle()+" is added.");
    }
    Media recommendMedia(Member m)
    {
        double max=array.get(0).getSuitability(m);
        int index=0;
        for(int i=1;i<array.size();i++)
        {
            double beshi = array.get(i).getSuitability(m);
            if(max<beshi)
            {
                max=beshi;
                index=i;
            }
        }
        array.remove(m);
        return array.get(index);
    }
}
