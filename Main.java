//import class scanner
import java.util.Scanner;

public class Main {

    // Method สำหรับเรียงตัวเลขด้วย Insertion Sort
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // เลื่อนตัวเลขที่มากกว่า key ไปทางขวา
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // แทรก key ในตำแหน่งที่ถูกต้อง
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับจำนวนตัวเลข
        int n = sc.nextInt();

        // สร้าง Array
        int[] numbers = new int[n];

        // รับตัวเลข n ตัว
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // เรียก Method เพื่อเรียงลำดับ
        insertionSort(numbers);

        // แสดงผลบรรทัดละ 1 ตัว
        for (int i = 0; i < n; i++) {
            System.out.println(numbers[i]);
        }

        sc.close();
    }
}
