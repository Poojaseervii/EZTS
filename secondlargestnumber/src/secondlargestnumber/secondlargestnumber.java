package secondlargestnumber;

public class secondlargestnumber {

    public static int getSecondLargestNumber(int[] a) {
        if (a.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }

        int firstLargest, secondLargest;
        if (a[0] > a[1]) {
            firstLargest = a[0];
            secondLargest = a[1];
        } else {
            firstLargest = a[1];
            secondLargest = a[0];
        }

        for (int i = 2; i < a.length; i++) {
            if (a[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = a[i];
            } else if (a[i] > secondLargest && a[i] != firstLargest) {
                secondLargest = a[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int[] b = {11, 12, 13, 14, 15, 16, 17};

        try {
            System.out.println("Second Largest in array a: " + getSecondLargestNumber(a));
            System.out.println("Second Largest in array b: " + getSecondLargestNumber(b));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
