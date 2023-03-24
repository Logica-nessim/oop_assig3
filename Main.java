import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    //q.2
    public static double max(ArrayList<Integer> x)
    {
        int i,max;
        if(x.size()==0)
            return  0;
        else
        {
            max=x.get(0);
            for(i=1;i<x.size();i++)
            {
                if(x.get(i)>max)
                    max=x.get(i);
            }
            return max;
        }
    }
    //q.3
    public static void sort(ArrayList<Integer> x)
    {
        int i,j;
        for (i=0;i<x.size();i++)
        {
            for(j=1;i<x.size()-1;j++)
            {
                int z;
                if(x.get(i)<x.get(j))
                {
                    z=x.get(i);
                    x.set(i,x.get(j));
                    x.set(j,z);
                }
            }
        }
    }
}
