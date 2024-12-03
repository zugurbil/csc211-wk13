

/**
This program demonstrates how the Integer.parseInt
method throws an exception.
*/

public class Excpetion4
{
public static void main(String[] args)
{
    String str = "abcde";
    int number;
    
    try
    {
       number = Integer.parseInt(str);
    }
    catch (NumberFormatException e)
    { 
        	System.out.println("error :" + e.getMessage());
    }
    try
    {
       number = Integer.parseInt(str);
    }
    catch (Exception e)
    { 
        	System.out.println("error message 2  :" + e.getMessage());
        	//e.printStackTrace();
    }
    str="123";
    System.out.println(Integer.parseInt(str));
}
}