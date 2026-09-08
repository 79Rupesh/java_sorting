// 5. Negative Number Search करना

// Input: Array = [-20, -10, 0, 10, 20]
// Search = -10
// Output: Element found at index 1

public class B3 {
    public static void main(String[] args) {
        int arr[] = { 10, -20, 30, 40, 50, 60 };
        int search = -20;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == search) {
                System.out.println("negetive value : " + mid);
                return;
            } else if (arr[mid] > search) {
                high = mid + 1;
            } else {
                low = mid - 1;
            }
        }
        System.out.println("array not found ");

    }
}