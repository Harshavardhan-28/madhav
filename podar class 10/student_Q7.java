public class student_Q7
{
    public static void main(String name,int r,int c,int m,int b,int p,int g)
    { 
        System.out.println(name);
        System.out.println(r);
        int t=c+m+b+p+g;
        int ma=t/80*100;
        if (ma>=90)
        {
            System.out.println("Science with Computer");
        }
        else if (ma>=80&&ma<=89)
        {
            System.out.println("Science without computer");
        }
        else if (ma>=70&&ma<=79)
        {
            System.out.println("Commerce with Maths");
        }
        else if(ma>=60&&ma<=69)
        {
            System.out.println("Commerce without Maths");
        }
        
    }
}