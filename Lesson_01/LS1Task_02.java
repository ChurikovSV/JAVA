//Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
//максимальное количество подряд идущих 1.

public class LS1Task_02 {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 0, 1, 1, 1 };
        int max = 0;
        int temp = 0;
        for (int el : nums) {
            if (el == 1) {
                temp++;
                if (max < temp) {
                    max = temp;
                }
            } else {
                temp = 0;
            }
        }
        System.out.println(max);

    }
}
