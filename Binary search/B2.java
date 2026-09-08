// Binary Search से comparisons की संख्या निकालो
// arr = [10, 20, 30, 40, 50, 60, 70]
// key = 50
// output : 3 

public class B2 {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70 };

        int key = 50;
        int low = 0;
        int high = arr.length - 1;
        int count = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            count++;
            if (arr[mid] == key) {
                System.out.println(count);
                return;

            } else if (arr[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        System.out.println(count);
    }
}
