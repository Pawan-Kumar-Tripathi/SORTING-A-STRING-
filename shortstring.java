import java.io.*;
import java.util.*;
class shortstring
{
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string plz");
        String str = sc.nextLine();
        char charr[] = str.toCharArray();
        
        int i , j ;
        char temp;
         for(i=0;i<charr.length;i++)
         {
             for(j= i+1;j<charr.length;j++)
             {
                 if(charr[i]  >    charr[j])
                 {
                     temp = charr[i];
                     charr[i] = charr[j];
                     charr[j] = temp;
                    }
                }
            }
            System.out.println(new String (charr));
        }
    }
                     
        
        