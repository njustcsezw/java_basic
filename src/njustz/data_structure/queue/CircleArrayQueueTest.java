package njustz.data_structure.queue;

/**
 * @author njustz
 * @date 2020/4/7
 */
public class CircleArrayQueueTest {
    public static void main(String[] args) {
        CircleArrayQueue circleArrayQueue = new CircleArrayQueue(3);
        circleArrayQueue.addQueue(3);
        circleArrayQueue.addQueue(5);
        //circleArrayQueue.addQueue(6);
        circleArrayQueue.showQueue();
        //----------------------------
        circleArrayQueue.getQueue();
        circleArrayQueue.addQueue(6);
        circleArrayQueue.showQueue();
       /* circleArrayQueue.getQueue();
        circleArrayQueue.getQueue();
        circleArrayQueue.getQueue();*/

    }

    static class CircleArrayQueue{
        private int maxSize;
        private int front;
        private int rear;
        private int[] arr;

        public CircleArrayQueue(int maxSize){
            this.maxSize = maxSize;
            arr = new int[maxSize];
            front = 0;
            rear = 0;
        }

        public boolean isFull(){
            return ((rear+1)%maxSize == front);
        }

        public boolean isEmpty(){
            return rear == front;
        }

        public void addQueue(int n){
            if(isFull()){
                System.out.println("The Queue is full");
                return;
            }
            arr[rear] = n;
            rear = (rear+1)%maxSize;
        }

        public int getQueue(){
            if(isEmpty()){
                throw new RuntimeException("The Queue is Empty");
            }else {
                //front++;
                int val = arr[front];
                front = (front+1)%maxSize;
                return val;
            }
        }

        public int size(){
            return (rear+maxSize-front)%maxSize;
        }

        public void showQueue(){
            if(isEmpty()){
                System.out.println("The Queue is empty");
            }else {
                for (int i = front; i < front+size(); i++) {
                    System.out.printf("arr[%d]= %d\t",i%maxSize,arr[i%maxSize]);
                }
            }
        }

        public int headData(){
            if(isEmpty()){
                throw new RuntimeException("The Queue is Empty");
            }else {
                return arr[front];
            }
        }

    }
}
