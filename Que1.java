/*Question1 : Given an integer array arr, remove a subarray (can be
empty) from the array such that the remaining elements in arr are
non-decreasing.
A subarray is a contiguous subsequence of the array.
Return the length of the shortest subarray to remove.
Example 1:
Input: arr = [1,2,3,10,4,2,3,5]
Output: 3*/ 
import java.util.*;
public class Que1 
{
    public int Subarray(int[] arr)
    {
        int deep=0;
        int rise=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MAX_VALUE;
        for(int i=0; i<arr.length-1; i++)
        {
            if(arr[i]>arr[i+1])
            {
                deep=i;
                break;
            }
        }
        
        for(int i=arr.length-1; i>0; i--)
        {
            if(arr[i]<arr[i-1])
            {
                rise=i;
                break;
            }
        }
        if (deep==0 && rise==arr.length-1)
            return rise;
        else if(deep==0)
            return 0;
        
        for(int i=deep+1; i<rise; i++)
        {
            min=Math.min(min, arr[i]);
            max=Math.max(max, arr[i]);
        }
        int left=0,right=0;
        for(int i=0; i<arr.length-1; i++)
        {
            if(arr[i]>min)
            {
                left=i;
                break;
            } 
        }  
        for(int i=arr.length-1; i>0; i--)
        {
            if(arr[i]<max)
            {
                right=i;
                break;
            } 
        }
        return (right-left-1);  
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        //System.out.println("element");
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
        Que1 obj=new Que1();
        System.out.println(obj.Subarray(arr));
    }
}
