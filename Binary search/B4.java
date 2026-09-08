// Duplicate Elements में First Occurrence

// Input: Array = [10, 20, 20, 20, 30, 40]
// Search = 20
// Output: First occurrence at index 1

public class B4 {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 20, 20, 30, 40, 50 };
        int search = 20;
        int low = 0;
        int high = arr.length - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == search) {
                result = mid;
                high = mid - 1; // sabse pahala vala chack karega isliye

            } else if (arr[mid] > search) {
                high = mid - 1;

            } else {
                low = mid + 1;
            }
        }
        System.out.println("First occurrence at index : " + result);
    }

}
