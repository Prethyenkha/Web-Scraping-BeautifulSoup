import java.util.*;
public class Practice6 //largest of three
{
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        if(a>b&&a>c)
        {
            System.out.println(a +" is greater");
        }
        if(b>a&&b>c)
        {
            System.out.println(b +" is greater");
        }
        else
        {
            System.out.println(c +" is greater");
        }
    }
}
