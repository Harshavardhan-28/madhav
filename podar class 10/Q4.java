public class Q4
{
    public static void main (String arg[]){
        Scanner sc = new Scanner(System.in);
        float P = 0;
        double A = 0.0;
        double r = 0.0;
        int n= 0;
        System.out.println("Main menu:-");
        System.out.println("1-> Term Deposit");
        System.out.println("2-> Recurring Deposit");
        System.out.print("Enter your choice:");
        int ch = sc.nextlnt();
        switch(ch) {
            case 1:
            System.out.print("Enter pricipal amt:");
            P=sc.nextDouble();
            System.out.println("Enter time peiod in years: ");
            n = sc.nextlnt();
            A = P* Math.pow((1+r/100),n);
            break;
            case 2:
            System.out.print("Enter time period in months: ");
            n = sc.nextlnt();
            A = P*n+P*n*(n+1)/2*r/100*1/12;
            break;
            default:
            System.out.println("Invalid choice");
        }
        System.out.print("Maturity amount is: "+A);
    }
}
            
