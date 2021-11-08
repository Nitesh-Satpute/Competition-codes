/*Question 2: The string "PAYPALISHIRING" is written in a
zigzag pattern on a given number of rows like this: (you may
want to display this pattern in a fixed font for better legibility)
P.......A........H.......N
..A..P....L....S....I...I....G
....Y.........I........R
And then read line by line: PAHNAPLSIIGYIR
Write the code that will take a string and make this conversion
given a number of rows:
string convert(string text, int nRows);
convert("PAYPALISHIRING", 3) should return
"PAHNAPLSIIGYIR"
Example 2 :
ABCD, 2 can be written as
A....C
...B....D*/ 
import java.util.*;
public class Que2
{
    String res="";

    public String Output(String strr,int noRows)
    {
        if (strr == null || noRows <= 0) 
            return res;
        else if(noRows==1)
            return strr;
        else if(noRows==2)
        {
            int count=0;
            char[] ch=strr.toCharArray();
            do
            {
                if(count==0)
                {
                    for(int j=0; j<ch.length; j+=2)
                    res=res+ch[j];
                }
                else if(count==1)
                {
                    for(int j=1; j<ch.length; j+=2)
                    res=res+ch[j];
                }
                ++count;
            }while(count!=2);
        }
        else 
        {   
            StringBuilder result = new StringBuilder();
            int jump = 2 * noRows - 2;
            for (int i = 0; i < noRows; i++) 
            {
            for (int j = i; j < strr.length(); j += jump) 
            {
                result.append(strr.charAt(j));
                if (i != 0 && i != noRows - 1 && (j + jump - 2 * i) < strr.length()) 
                {
                    result.append(strr.charAt(j + jump - 2 * i));
                }
            }
        }
        return res=result.toString();
        }
        return res;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String strr=sc.next();
        StringBuilder str=new StringBuilder(strr);
        int noRows=sc.nextInt();
        Que2 obj=new Que2();
        System.out.println(obj.Output(strr,noRows));
    }
}
