//start program using scanner class
import java.util.Scanner;
class use_to_undrstand_scanner
{
    String name, zodiac_sign;
    double wt;
    int lucky_num;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        name = sc.nextLine();
        System.out.println("Enter your zodiac sign is: ");
        zodiac_sign = sc.nextLine();
        System.out.println("Enter your weight: ");
        wt = sc.nextDouble();
        System.out.println("Enter your lucky number: ");
        lucky_num = sc.nextInt();
    }
    void display()
    {
        System.out.println("YOUR NAME IS: ");
        System.out.println("YOUR ZODIAC IS: ");
        System.out.println("YOUR WEIGHT IS: ");
        System.out.println("YOUR LUCKY NUMBER IS: ");
    }
    public static void main()
    {
        use_to_undrstand_scanner obj = new use_to_undrstand_scanner();
        obj.input();
        obj.display();
    }
}