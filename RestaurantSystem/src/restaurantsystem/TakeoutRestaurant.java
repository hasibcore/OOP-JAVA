
package restaurantsystem;
public class TakeoutRestaurant extends Restaurant{
    private int StaffCount;

    public TakeoutRestaurant(int StaffCount, String name, double waitTime) {
        super(name, waitTime);
        this.StaffCount = StaffCount;
    }

    public int getStaffCount() {
        return StaffCount;
    }

    public void setStaffCount(int StaffCount) {
        this.StaffCount = StaffCount;
    }
@Override
public double getPreparationTime(Item i)
{
    if(StaffCount<1)
    {
        return Integer.MAX_VALUE;
    }
    else
    {
        return (getWaitTime()/StaffCount) +i.getPrice();
    }
}
}
