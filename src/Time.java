public class Time {
    public static void main(String[] args) {
        int time = 8;
        if (time >= 6 && time <= 12)
            System.out.println("Good Morning Sunshine!");
        if (time >= 13 && time <= 19) ;
        System.out.println("Good afternoon. Work hard!");
        if (time >= 20 && time <= 24) ;
        System.out.println("Good evening. Get some rest!");
        int time2 = -2;
        if (time2 < 0 || time2 > 24)
            System.out.println("Invalid time, check the settings");
        int time3 = 100;
        if (time3 >= 0 && time3 <= 8) {
            System.out.println("Time to go to bed now!");

        }
    }
}

