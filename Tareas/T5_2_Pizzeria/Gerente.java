
public class Gerente {
	protected static Gerente instance = null;
    public static Gerente getInstance() {
        if(instance == null) {
            instance = new Gerente();
        }
        return instance;
    }
}
