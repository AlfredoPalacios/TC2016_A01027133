public class Test
{
    public static void main(String[] args) {
        Car carro1 = new Car("advanced");
        Car carro2 = new Car("standard");
        System.out.println(carro2.isMoreExpensive(carro1));

        House casa1 = new House(4);
        House casa2 = new House(8);
        System.out.println(casa2.isMoreExpensive(casa1));

        Hamburger hamburguesa1 = new Hamburger("doble");
        Hamburger hamburguesa2 = new Hamburger("simple");
        System.out.println(hamburguesa1.isMoreExpensive(hamburguesa2));
    }
}