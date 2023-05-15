package look;

/**
 * @author sunday
 * @create 2022 --- 10 --- 30 --- 18:24
 */
public class RingArray {
    public static class MyQueue{
        public int[] arr;
        public int pushi;
        public int polli;
        public int size;
        public final int limit;
        public MyQueue(int limit){
            arr = new int[limit];
            polli = 0;
            pushi = 0;
            size = 0;
            this.limit = limit;
        }

        public void push(int value){
            if(size == limit){
                throw new RuntimeException("栈满了");
            }
            size++;
            arr[pushi] = value;
            pushi = nextIndex(pushi);
        }

        public int pop(){
            if(size == 0){
                throw new RuntimeException("栈空了");
            }
            size--;
            int ans = arr[polli];
            polli = nextIndex(polli);
            return ans;
        }
        public int nextIndex(int i){
            return i < limit - 1 ? i + 1: 0;
        }
    }
}
