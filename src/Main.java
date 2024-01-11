public class Main
{
    public static void main(String[] args)
    {
        int[] nums = new int[] {1, 1, 2};
        int[] expected = new int[] {1, 2};

    }

    public static int removeDuplicates(int[] nums)
    {
        int k = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (i < nums.length - 1 && nums[i] == nums[i + 1])
            {
                continue;
            }
            nums[k] = nums[i];
            k++;
        }
        return k;
    }
    public static void removeAt(int[] nums, int index)
    {
        for (int i = 0; i < nums.length - 1; i++)
        {
            if (i >= index)
            {
                nums[i] = nums[i + 1];
            }
        }
    }
}