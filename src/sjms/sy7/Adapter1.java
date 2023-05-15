package sjms.sy7;

/**
 * @author sunday
 * @create 2023 --- 04 --- 10 --- 11:22
 */
public class Adapter1 implements DataOperation{
    BinarySearch search = new BinarySearch();
    QuickSort sort = new QuickSort();
    @Override
    public void Sort(int[] arr) {
        sort.quickSort(arr);
    }

    @Override
    public int search(int[] arr, int target) {
        return search.binarySearch(arr,target);
    }
}
