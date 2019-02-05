import java.util.Date;

public class Job {

    private int jobID;
    private int salary;
    //aquí hay agregación con Date porque se guarda el atributo tipo Date
    Date startDate;
    Date endDate;

    private Job(){

    }

    public Job(int jobID, int salary, Date startDate){

        this.jobID=jobID;
        this.salary=salary;
        this.startDate=startDate;

    }

    public void doTheJob(){

        System.out.println("Doing the job.");

    }

    public void print(){

        //print job info
        System.out.println("The job ID is: "+jobID);
        System.out.println("The salary is: "+salary);
        System.out.println("The start date is: "+startDate);
        System.out.println("The end date is: "+endDate);

    }
    
}