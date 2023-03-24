public class GroceryList {
    private GroceryItemOrder[] item;

    public GroceryList(GroceryItemOrder[] list) {
        this.item = new GroceryItemOrder[10];
    }
    public void add(GroceryItemOrder item)
    {
       int i=0;
        if (this.item.length<10)
        {
           this.item[i]=item;
           i++;
        }
    }
    public double getTotalCost()
    {
        int cost=0;
        for(int i=0;i<item.length;i++)
        {
            cost+=item[i].getCost();
        }
         return cost;
    }

}