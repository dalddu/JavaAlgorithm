package _1108;


public class BinarySearch02 {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        System.out.printf("length:%d\n",numbers.length);
        int startIdx = 0;
        int endIdx = numbers.length - 1;
        int midIndex = (startIdx + endIdx) / 2; // start:0 end:10
        System.out.println(midIndex);

    }
}