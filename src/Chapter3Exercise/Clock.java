package Chapter3Exercise;

public class Clock {
    private int hour;
    private int minute;
    private int second;
    public Clock(int hour, int minute,int second){
        if (hour >23){
            hour = 0;
        } else {
            this.hour = hour;
        }
        if (minute > 59){
            minute = 0;
        } else {
            this.minute = minute;
        }
        if (second > 59){
            second = 0;
        } else {
            this.second = second;
        }

    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}
