public class Institution {

    private String name;
    private Student[]studentsList;
    private Teacher[]teachersList;
    private int contTeachers;
    private int contStudents;

    public Institution(){
        this.name="Una Escuela";
        contTeachers=0;
        contStudents=0;
        studentsList=new Student[100];
        teachersList=new Teacher[100];
    }

    public Institution(String name){
        this.name=name;
        contTeachers=0;
        contStudents=0;
        studentsList=new Student[100];
        teachersList=new Teacher[100];
    }

    public void recievesVisits(Visitor visitor){

        visitor.visit

    }

    public void print(){
        //detalles de la institución
    }

    //aquí hay agregación con Teacher
    //Teacher se guarda pero no se crea

    public void hiresTeacher(Teacher teacher){

        if(contTeachers<100)
        teachersList[contTeachers++]=theTheacher;
        else
        System.out.println("Ya no hay espacio.");

    }

    public int getNumberOfTeachers(){

        return contTeachers-1;

    }

    public void enrollStudent(Student theStudent){

        if(contStudents<100)
            studentsList[contStudents++]=theStudent;
        else
            System.out.println("No hay espacio.");

    }

    public int getNumberOfStudents(){

        return contStudents-1;

    }
    
}