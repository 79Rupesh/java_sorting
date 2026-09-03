// selection sorth ki help se array ko asending order me arrage karna . ;
public class S1 {
    public static void main(String args[]) {
        int arr[] = { 232, 53, 54, 67, 43, 64, 46 };
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}