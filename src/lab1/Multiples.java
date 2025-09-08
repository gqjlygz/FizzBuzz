package lab1;

public class Multiples {
    public static void main(String[] args) {
        extracted();
    }

    private static void extracted() {
        int count = multiples();
        System.out.println("There are " + count + " multiples of 3 and 5.");
    }

    private static int multiples() {
        int count = 0;

        for(int i = 1; i < 1000; i++) {
            if(i % 3 == 0 || i % 5 == 0){
                count++;
            }
        }
        return count;
    }
}
