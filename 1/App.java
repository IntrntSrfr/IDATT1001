public class App {
    public static void main(String[] args) {
        System.out.println(String.format("got: %f, expected: %f",App.inchToCm(2.0), 5.08));
        System.out.println(String.format("got: %f, expected: %f", App.inchToCm(0.0), 0.0));
        System.out.println(String.format("got: %d, expected: %d", App.DurationToSeconds(1, 1, 6), 3666));
        System.out.println(String.format("got: %d, expected: %d", App.DurationToSeconds(2, 1, 6), 7266));
        System.out.println(String.format("got: %s, expected: %s", App.SecondsToDuration(86399), "23:59:59"));
        System.out.println(String.format("got: %s, expected: %s", App.SecondsToDuration(500000), "138:53:20"));
        System.out.println(String.format("got: %s, expected: %s", App.SecondsToDuration(0), "0:0:0"));
    }

    public static double inchToCm(double inches) {
        return inches * 2.54;
    }

    public static int DurationToSeconds(int hours, int minutes, int second) {
        int seconds = 0;

        seconds += (hours * 3600);
        seconds += (minutes * 60);
        seconds += second;

        return seconds;
    }

    public static String SecondsToDuration(int seconds) {
        int hour = seconds / 3600;
        seconds -= hour * 3600;
        int minute = seconds / 60;
        seconds -= minute * 60;
        return String.format("%d:%d:%d", hour, minute, seconds);
    }
}
