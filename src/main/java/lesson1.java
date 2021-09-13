public class lesson1 {
    public static void main(String[] args) {
        isMyTicketLucky();
    }

    public static void isMyTicketLucky() {
        int sum1 = 0;
        int sum2 = 0;
        int[] arr = {1, 3, 1, 2, 2, 1};
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        for (int i = 0; i < 3; i++)
            sum1 += arr[i];
        for (int i = 3; i < arr.length; i++) {
            sum2 += arr[i];
            if (sum2 == sum1) {
                System.out.println(true);
            }
        }
    }
}
