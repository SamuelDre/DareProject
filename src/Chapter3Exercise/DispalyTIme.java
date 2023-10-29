package Chapter3Exercise;

public class DispalyTIme {
    public static void main (String[] args){
        Clock clock= new Clock(23, 54, 12);
        System.out.print("hh:mm:ss");
        System.out.printf("%n%d:%d:%d", clock.getHour(), clock.getMinute(),clock.getSecond() );
    }
}
