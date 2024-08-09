public class Insertion {
    public static void main(String[] args) {
        int[] num = { 7, 8, 4, 3, 7, 5 };

        for (int i = 0; i < num.length; i++) {
            int current = num[i];
            int j = i - 1;

            while (j >= 0 && current < num[j]) {
                num[j + 1] = num[j];
                j--;
            }

            num[j + 1] = current;
        }
        for (int nums : num) {
            System.out.print(nums+ " ");
        }
    }
}
