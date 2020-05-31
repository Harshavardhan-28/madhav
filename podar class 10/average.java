public class average
{
    double math,chem,comp,avg;
    void init(double m,double ch,double c)
    {
        math=m;
        chem=ch;
        comp=c;
    }
    void clac()
    { 
        avg=(math+chem+comp)/3;
    }
    void display()
    {
        System.out.print(avg);
    }
}