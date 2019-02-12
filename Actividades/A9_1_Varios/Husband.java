public class Husband extends Person {

    private Wife w;

    private Husband(){

    }

    public Husband(String name){

        super(name);

    }

    public void getMarried(Wife w){

        if(w!=this.w){

            this.w=w;
            w.getMarried(this);

        }

    }

    public void giveLove(){

        System.out.println("Soy " + getName() + " y amo a: " + w.getName());

    }
    
}