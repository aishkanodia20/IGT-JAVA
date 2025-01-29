package Practice;
class A {
   
	int arr[] = {2, 3, 5, 6, 7, 8, 44, 2, 11};

    // Method to calculate the sum of the array
    public int sumOfArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
public class Program1 {
    public static void main(String[] args) {
        A a = new A();
        // Correctly pass the 'arr' property to the sumOfArray method
        int sum = a.sumOfArray(a.arr);
        // Print the sum
        System.out.println("Sum of array elements: " + sum);
    }
}
