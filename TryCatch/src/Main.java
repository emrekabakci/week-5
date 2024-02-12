import java.util.Scanner;

public class Main {

    private static int returnChoosedIndex(int index) throws ArrayIndexOutOfBoundsException {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result = 0;
        try {
            result = arr[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("Invalid index, you can choose between 0 and " + (arr.length - 1) + ".");
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int enteredNum = inp.nextInt();
        System.out.println("choosed index num is: " + returnChoosedIndex(enteredNum));

    }
}