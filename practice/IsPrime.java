package practice;

public class IsPrime {
    //O(root n)
    public static void main(String[] args) {
        // Take Input
        System.out.println(isPrime(51));
    }
    static int isPrime(int num) {
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return i;
            }
        }
        return -1;
    }
}