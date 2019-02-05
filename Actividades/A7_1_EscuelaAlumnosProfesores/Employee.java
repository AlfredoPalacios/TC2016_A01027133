import java.util.Date;

public class Employee extends Person{

    private Job hisJob;

    //aquí hay composición con Job  

    public Employee(){

        hisJob=new Job(1, 1000, new Date());

    }

    public void print(){

    }
    
}