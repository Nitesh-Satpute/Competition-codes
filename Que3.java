import java.util.*;
public class Que3 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().trim();
        String[] arr=str.split(" ");
        int size=arr[arr.length-1].length();
        System.out.println(size);  
    }
}
