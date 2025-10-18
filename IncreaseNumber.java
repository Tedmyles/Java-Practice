public class IncreaseNumber {

    public static int increaseNumber(int number) {
        return number + 1;
    }

    public static void main(String[] args) {
        System.out.println(increaseNumber(5));  // Output: 6
        System.out.println(increaseNumber(-3)); // Output: -2
        System.out.println(increaseNumber(0));  // Output: 1
    }
    
}
