public class House implements PriceRelatable
{
    protected int cuarto;

    public House(int cuarto)
    {
        this.cuarto=cuarto;
    }

    public int getPrice()
    {
        return cuarto*1000000;
    }
}