package Java.src.com.LeetCodeDec;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestElementsInArray {

    public  static  int  largestElements(ArrayList<Integer> arr, int n){

        // ?    Initialize the largest variable with the first element of the list or array
        int  largest = arr.get(0);

        for (var nums: arr){
            if(nums > largest){
                largest = nums;
            }
        }
        return largest;


        //! Alternative way to find the largest element in the array
        //? Iint largest = Collections.max(arr);
        //?  return largest;

    }

    public static void main(String[] args) {;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        // ?    Adding elements to the array
//        arr.add(10);
//        arr.add(20);
//        arr.add(30);
//        arr.add(40);
//        arr.add(50);

        System.out.println("Enter the size of the array: ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements  inside the array:  ");
        for(int i=0; i<n; i++){
            int num = scanner.nextInt();
            arr.add(num);
        }

        int largest = largestElements(arr, n);
        System.out.println("Largest Element in the Array is: "+ largest);

    }

}
