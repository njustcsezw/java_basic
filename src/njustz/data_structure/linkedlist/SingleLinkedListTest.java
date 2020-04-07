package njustz.data_structure.linkedlist;

/**
 * @author njustz
 * @date 2020/4/7
 */
public class SingleLinkedListTest {
    public static void main(String[] args) {
        HeroNode heroNode1 = new HeroNode(1,"sj","jsy");
        HeroNode heroNode2 = new HeroNode(2, "ljy", "yql");
        HeroNode heroNode3 = new HeroNode(3,"wy", "zdx");

        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.add(heroNode1);
        singleLinkedList.add(heroNode2);
        singleLinkedList.add(heroNode3);
        singleLinkedList.showList();
    }

    static class HeroNode{
        int no;
        String name;
        String nickName;
        HeroNode next;
        public HeroNode(int no, String name, String nickName){
            this.no = no;
            this.name = name;
            this.nickName = nickName;
        }

        @Override
        public String toString() {
            return "HeroNode{" +
                    "no=" + no +
                    ", name='" + name + '\'' +
                    ", nickName='" + nickName + '\'' +
                    '}';
        }
    }

    static class SingleLinkedList{
        private HeroNode head = new HeroNode(0,"","");

        public void add(HeroNode heroNode){

            //遍历链表，找到最后
            HeroNode temp = head;
            while (true){
                if(temp.next == null){
                    break;
                }
                temp = temp.next;
            }
            temp.next = heroNode;
        }

        public void showList(){
            if(head.next == null){
                System.out.println("The linkedlist is empty");
                return;
            }
            HeroNode temp = head.next;
            while (true){
                if(temp == null){
                    break;
                }
                System.out.println(temp);
                temp = temp.next;
            }
        }

    }
}
