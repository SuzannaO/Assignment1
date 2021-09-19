public class Time {
    public static void main(String[] args) {
        int time = 8;
        if (time < 0 || time > 24)
            System.out.println("Invalid time meaning, check the settings.");
        if (time >= 8 && time <= 12)
            System.out.println("Good Morning Sunshine!");
        if (time >= 13 && time <= 19)
            System.out.println("Good Afternoon. Work Hard!");
        if (time >= 20 && time <= 24)
            System.out.println("Good Evening. Get some rest!");
        if (time >= 0 && time < 8)
            System.out.println("Time to go to bed now!");
    }
}

