//Дан массив nums = [3,2,2,3] и число val = 3.
//Если в массиве есть числа, равные заданному, нужно перенести
//эти элементы в конец массива.
//Таким образом, первые несколько (или все) элементов массива
//должны быть отличны от заданного, а остальные - равны ему.

public class LS1Taks_03 {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;
        int right = nums.length - 1;

        while (nums[right] == val) {
            right--;
        }
        for (int i = 0; i < right; i++) {
            if (nums[i] == val) {
                int temp = nums[i];
                nums[i] = nums[right];
                nums[right] = temp;
                right--;
            }

        }

        for (int item : nums) {
            System.out.println(item + " ");
        }

    }
}
