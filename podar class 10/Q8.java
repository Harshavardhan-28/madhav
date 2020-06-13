public class Q8
{
    public static void check(String s,char ch)
    {
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==ch)
            c++;
        }
        System.out.println("number of "+ c +" present is="+c);
    }
    public static void check(String s1)
    {
        s1=s1.toLowerCase();
        for(int i=0;i<s1.length();i++)
        {
            char ch = s1.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            System.out.println("The vowel in word "+s1+" present is "+ch);
        }
    }
    public static void main(String arg[])
    {
        Q8 obj= new Q8();
        obj.litration("hello gj");
    }
}
        
      
    
    
