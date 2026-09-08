// binary search ki help se value ko search karna .
public class B1 {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 8, 12, 16, 23, 38 };
        int search = 16;

        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == search) {
                System.out.println("value index number " + mid + " hai . ");
                return;
            } else if (arr[mid] > search) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("value nhi hai");
    }
}