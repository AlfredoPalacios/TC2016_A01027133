public class Time{

    private int hour, minute, second;

    public void setHour(int hour){

        this.hour = hour;

    }

    public void setMinute(int minute){

        this.minute = minute;

    }

    public void setSecond(int second){

        this.second = second;

    }

    public int getHour(){

        return hour;

    }

     public int getMinute(){

        return minute;

    }

     public int getSecond(){

        return second;

    }

    public void setTime(String time){

        if(time.length() != 8){
            System.out.println("Formato incorrecto");
            return;
        }
        String[] stringTime = time.split(":");
        hour = Integer.parseInt(stringTime[0]);
        minute = Integer.parseInt(stringTime[1]);
        second = Integer.parseInt(stringTime[2]);

    }

    public String getTimeString(){

        String tempTime = new String("");
        tempTime = tempTime + hour + ":" + minute + ":" + second;
        return tempTime;

    }
    
}