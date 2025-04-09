public class MultipleGroups implements NumberGroup
{
    private List<NumberGroup> groupList;

    public boolean contains(int num)
    {
        for(NumberGroup x: groupList)
            if(x.contains(num))
                return true;

        return false;
    }
}
