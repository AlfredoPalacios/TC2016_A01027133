public class Prueba{
    
    public static void main(String[] args){

        Date theDay = new Date();
        theDay.setDay(14);
        Date theMonth = new Date();
        theMonth.setMonth(1);
        Date theYear = new Date();
        theYear.setYear(2019);

        Date otherDate = new Date();
        otherDate.setDate("14/01/2019");

        System.out.println(otherDate.getDateString());

        Time theHour = new Time();
        theHour.setHour(14);
        Time theMinute = new Time();
        theMinute.setMinute(10);
        Time theSecond = new Time();
        theSecond.setSecond(35);

        Time otherTime = new Time();
        otherTime.setTime("14:10:35");

        System.out.println(otherTime.getTimeString());

    }

}