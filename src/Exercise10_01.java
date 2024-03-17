public class Exercise10_01 {
    public static void main(String[] args) {
        Time time1 = new Time();
        System.out.println(time1.getHour() + ":" + time1.getMinute() + ":" + time1.getSecond());

        Time time2 = new Time(555550000);
        System.out.println(time2.getHour() + ":" +  time2.getMinute() + ":" + time2.getSecond());

        Time time3 = new Time(5, 23, 55);
        System.out.println(time3.getHour() + ":" + time3.getMinute() + ":" + time3.getSecond());  }
}

class Time {
    // Write your code
    // Hint for finding hour, minute, second from elapse time.
    // See LiveExample 2.7 for extracting hour, minute,
    // and second from the elapse time.
    private int hour;
    private int minute;
    private int second;
    public Time(){
        long currentTime = System.currentTimeMillis();
        long totalSeconds = currentTime / 1000;
        second = (int)(totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        minute = (int)(totalMinutes % 60);
        long totalHours = totalMinutes / 60;
        hour = (int)(totalHours % 24);
    }
    public Time(long elapseTime){
        long totalSeconds = elapseTime / 1000;
        second = (int)(totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        minute = (int)(totalMinutes % 60);
        long totalHours = totalMinutes / 60;
        hour = (int)(totalHours % 24);
    }
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
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
}
