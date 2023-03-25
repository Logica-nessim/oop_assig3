import java.util.ArrayList;

public class GroceryList {
    private ArrayList<GroceryItemOrder> Mylist;

    public GroceryList(GroceryItemOrder[] list) {

        this.Mylist = new ArrayList<>();
    }
    public void add(GroceryItemOrder item)
    {
        if (Mylist.size()<10)
        {
           Mylist.add(item);
        }
    }
    public double getTotalCost()
    {
        int cost=0;
        for(int i=0;i< Mylist.size();i++)
        {
            cost+=Mylist.get(i).price;
        }
         return cost;
    }

}