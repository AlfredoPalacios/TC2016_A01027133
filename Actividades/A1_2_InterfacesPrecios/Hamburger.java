public class Hamburger implements PriceRelatable
{
    protected String tamano;

    public Hamburger(String tamano)
    {
        this.tamano=tamano;
    }

    public int getPrice()
    {
        if(tamano.equals("simple"))
            return 150;
        return 100;
    }
}