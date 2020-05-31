 class Q5
{
    static void triangular_series(int n)
    {
        int i,j=1,k=1;
        for(i=1;i<=n;i++){
            System.out.printf("%d",k);
            j=j+1;
            k=k+j;
        }
    }
    public static void main(String[]args)
    {
        int n = 5;
        triangular_series(n);
    }
}
        