public class Range implements NumberGroup
{
    private int first;
    private int last;

    public Range(int x, int y)
    {
        first = x;
        last = y;
    }

    public boolean contains(int num)
    {
        for(int i=first; i<last; i++)
            if(i==num)
                return true;

        return false;
    }
        
}
