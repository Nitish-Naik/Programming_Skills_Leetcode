class sign_of_Product_of_array 
{
    public static int arraySign(int[] nums) 
    {
        int product = 0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == 0)
            {
                return 0;
            }
            if(nums[i] < 0)
            {
                product++;
            }
        }
        if(product % 2 == 0)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
    public static void main(String[] args) 
    {
        int[] nums = {1,5,0,2,-3};
        System.out.println(arraySign(nums));
    }
}