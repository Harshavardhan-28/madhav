//*p=2000
//t=5yrs
//r=2.5
public  class SI
{
    int p;
    int t;
    int r;
    double si;
    void init(int pr,int ti,double ra)
    {
        p=pr;
        t=ti;
        r=r;
    }
    double calc()
    {
        si=(p*t*r)/100;
        return si;
    }
    public static void main()
    {
        SI obj = new SI();
        obj.init(20000,5,2.5);
        double ans=obj.calc();
        System.out.println(ans);
    }
}
        
