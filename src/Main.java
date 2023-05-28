public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();

        String binaryNum1 = "101";
        String binaryNum2 = "110";

        String sumResult = bins.sum(binaryNum1, binaryNum2);
        String multResult = bins.mult(binaryNum1, binaryNum2);

        System.out.println("Sum: " + sumResult);
        System.out.println("Mult: " + multResult);
    }
}