public  class rectangle
{
    int len,breath1,ans;
    void init(int length,int breath)
    {
        len=length;
        breath1=breath;
    }
    double calc()
    {
        ans=len*breath1;
        return ans;
    }
    public static void main()
    {
        rectangle obj=new rectangle();
        obj.init(5,4);
        double result = obj.calc();
        System.out.println(result);
    }
}