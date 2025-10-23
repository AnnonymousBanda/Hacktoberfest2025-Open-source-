class Solution
{
    public int finalValueAfterOperations(String[] operations)
    {
        int count=0;
        for(String k:operations)
        {
            if(k.charAt(1)=='-')
                count++;
        }

        return operations.length-2*count;
    }
}
