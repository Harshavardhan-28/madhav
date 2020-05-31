public class area
{
    int lenght,breath,area;
    void init()
    {
       lenght=10;
       breath=20;
    }
    void calc()
    {
        area= lenght*breath;
    }
    void display()
    {
        System.out.println(area);
    }
}