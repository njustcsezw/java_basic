package njustz.data_structure.queue;



/**
 * 用数组实现队列
 * @author njustz
 * @date 2020/4/7
 */
public class ArrayQueueTest {
    public static void main(String[] args) {
        ArrayQueueTest.ArrayQueue arrayQueue = new ArrayQueueTest.ArrayQueue(5);
        arrayQueue.addQueue(5);
        arrayQueue.addQueue(4);
        arrayQueue.showQueue();
        System.out.println(arrayQueue.headData());
    }

    static class ArrayQueue{
        private int maxSize;
        private int front;
        private int rear;
        private int[] arr;

        public ArrayQueue(int maxSize){
            this.maxSize = maxSize;
            arr = new int[maxSize];
            front = -1;
            rear = -1;
        }

        public boolean isFull(){
            return rear == maxSize-1;
        }

        public boolean isEmpty(){
            return rear == front;
        }

        public void addQueue(int n){
            if(isFull()){
                System.out.println("The Queue is full");
                return;
            }
            rear ++;
            arr[rear] = n;
        }

        public int getQueue(){
            if(isEmpty()){
                throw new RuntimeException("The Queue is Empty");
            }else {
                front++;
                return arr[front];
            }
        }

        public void showQueue(){
            if(isEmpty()){
                System.out.println("The Queue is empty");
            }else {
                for (int i = front+1; i < rear+1; i++) {
                    System.out.printf("%d\t",arr[i]);
                }
            }
        }

        public int headData(){
            if(isEmpty()){
                throw new RuntimeException("The Queue is Empty");
            }else {
                return arr[front + 1];
            }
        }

    }

}

