package challenges.day_001;

public class Day001 {

    public static void main(String[] args) {
        System.out.println(getRandomNumber(10, 100));
    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}