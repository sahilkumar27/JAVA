package Java.src.com.SDET;

public class Q19_FindMissingNumberInArray {
    // How do you find the missing number in an integer array from 1 to 10?
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 8, 9, 10};
        int n = 10;
//        int totalSum = n * (n + 1) / 2;
//        int arraySum = 0;
//        for(int num: arr){
//            arraySum+= num;
//        }
//        int missingNumber = totalSum - arraySum;
//        System.out.println("The missing number is: " + missingNumber);

        boolean[] present = new boolean[n + 1];
        for (int num : arr) {
            present[num] = true;
        }
        System.out.println("Missing number are: ");

        // Check which number are not marked
        for (int i = 1; i <= n; i++) {
            if(!present[i]){
                System.out.println(i);
            }
        }

    }
}
