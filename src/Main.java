import java.util.Arrays;
/*
Исключить одинаковые элементы массива (каждое значение должно присутствовать в единственном экземпляре)
 */
public class Main {
    public static void main(String[] args) {

        int[] arr = {2, 4, 1, 2, 1, 2, 4, 5};

        int[] distinct = removeDuplicates(arr);
        System.out.println(Arrays.toString(distinct));
    }
    public static int[] removeDuplicates(int[] arr) {
        return Arrays.stream(arr).distinct().toArray();
    }
}
