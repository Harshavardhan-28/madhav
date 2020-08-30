class ifelse_ifconstructer
{
    int n;
    void init(int num)
    {
        n = num;
    }
    void calc()
    {
        if(n>0 && n%2==0)
        {
            System.out.println("First succeeding even no.- "+(n+2));
            System.out.println("Second succeeding even no.- "+(n+4));
            System.out.println("Third succeeding even no.- "+(n+6));
        }
        else if(n<0 && n%2!=0)
        {
            System.out.println("First preceeding odd no.- "+(n-2));
            System.out.println("Second preceeding odd no.- "+(n-4));
            System.out.println("Third preceeding odd no.- "+(n-6));
        }
        else
        {
            System.out.println("INVALID- THE NUMBER IS NEITHER POSITIVE EVEN NOR NEGATIVE ODD");
        }
    }
    public static void main()
    {
        ifelse_ifconstructer obj = new ifelse_ifconstructer();
        obj.init(5);
        obj.calc();
    }
}