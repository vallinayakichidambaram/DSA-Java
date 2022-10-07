import java.util.Scanner;

class simpleBinarySearch {
    //O(log n)
    public static void main(String args[]) {
        int[] intArray = { 34, 38, 45, 49, 54, 68, 74, 77, 89, 91 };
        //Input = Sorted list of elements
        int low = 0;
        int high = intArray.length - 1;
        int input;
        int mid = 0;
        int element = 0;
        boolean flag = false;
        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
        sc.close();

        while (low <= high) {
            mid = (low + high) / 2;
            element = intArray[mid];
            if (element == input) {
                flag = true;
                break;
            } else if (element > input) {
                high = mid - 1;
            } else if (element < input) {
                low = mid + 1;
            }
        }

        if (flag) {
            System.out.println("Element found at index " + mid);
        } else {
            System.out.println("Element not found");
        }

    }

}
