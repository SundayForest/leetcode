package look;

import java.util.PriorityQueue;

/**
 * @author sunday
 * @create 2022 --- 11 --- 02 --- 13:02
 */
public class Heap {
    public static class MyMaxHeap{
        private int[] heap;
        private final int limit;
        private int heapSize;

        public MyMaxHeap(int limit){
            this.limit = limit;
            heapSize = 0;
            heap = new int[limit];
        }

        public void push(int value){
            if(heapSize == limit){
                throw new RuntimeException("full...");
            }
            heap[heapSize] = value;
            heapInsert(heap,heapSize++);
        }

        public void heapInsert(int[] arr,int index){
            while (arr[index] > arr[(index - 1) / 2]){
                swap(arr,index,(index - 1) / 2);
                index = (index - 1) / 2;
            }
        }
        public void swap(int[] arr,int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
//      返回大根堆最大值，并且仍然维持大根堆结构
        public int pop(){
            int ans = heap[0];
            swap(heap,0,--heapSize);
            heapify(heap,0,heapSize);
            return ans;
        }

        public void heapify(int[] arr,int index,int heapSize){
            int left = index * 2 + 1;
//            先看左孩子
            while (left < heapSize){
//                比左右孩子
                int largest = left + 1 < heapSize && arr[left + 1] > arr[left] ? left + 1 : left;
                largest = arr[largest] > arr[index] ? largest : left;
                if(largest == index){
                    return;
                }
                swap(heap,largest,index);
                index = largest;
                left = index * 2 + 1;
            }
        }
//      堆排序
//      堆排序 时间复杂度 o(nlogn)  空间复杂度 o(1)
        public void heapSort(int[] arr){
            if(arr == null || arr.length < 2){
                return;
            }
            for(int i = 0; i < arr.length; i++){
                heapInsert(arr,i);
            }
            int heapSize = arr.length;
            swap(arr, 0, --heapSize);
            while (heapSize > 0){
                heapify(arr,0,heapSize);
                swap(arr,0,--heapSize);
            }
        }

        public static void main(String[] args) {
            PriorityQueue<Integer> heap = new PriorityQueue<>();
//            系统提供的堆   小根堆
            heap.add(5);
            heap.add(6);
            heap.add(3);
            heap.add(8);
            heap.add(1);
            heap.add(0);
            heap.add(22);
            heap.add(5);
            while (!heap.isEmpty()){
                System.out.println(heap.poll());
            }
        }
    }
}
