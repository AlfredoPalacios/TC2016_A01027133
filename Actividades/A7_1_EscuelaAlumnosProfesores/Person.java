public class Person {

    private String name;

    private Person(){

    }

    public Person(String name){

        this.name=name;

    }

    public void print(){

        System.out.println("Soy: "+name);

    }
    
}