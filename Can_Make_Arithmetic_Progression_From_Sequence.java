import java.util.Arrays;
public class Can_Make_Arithmetic_Progression_From_Sequence 
{
    public static boolean canMakeArithmeticProgression(int[] arr) 
    {
        Arrays.sort(arr);
        int i=1;
        while(i < arr.length-1)
        {
            if((arr[i-1] - arr[i]) != (arr[i] - arr[i+1]))
            {
                return false;
            }
            i++;
        }
        return true;
    }
    public static void main(String[] args) 
    {
        int arr[] = {3,4,1};
        System.out.println(canMakeArithmeticProgression(arr));
    }
}    
