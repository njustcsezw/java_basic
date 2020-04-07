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
        HeroNode heroNode4 = new HeroNode(3,"wy11", "zdx11");

        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.add(heroNode1);
        singleLinkedList.add(heroNode2);
        singleLinkedList.add(heroNode3);
        //singleLinkedList.addByOrder(heroNode3);
        singleLinkedList.showList();
        //-----------------------------

        SingleLinkedList singleLinkedList11 = new SingleLinkedList();
        singleLinkedList11.addByOrder(heroNode1);
        singleLinkedList11.addByOrder(heroNode3);
        singleLinkedList11.addByOrder(heroNode2);
        singleLinkedList11.showList();
        singleLinkedList11.update(heroNode4);
        singleLinkedList11.showList();
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


        //按照某一属性进行排序添加
        public void addByOrder(HeroNode heroNode){
            HeroNode temp = head;
            boolean flag = false;
            while (true){
                if(temp.next == null){
                    //temp.next = heroNode;
                    break;
                }
                if(temp.next.no > heroNode.no){
                    //heroNode.next = temp.next;
                    //temp.next = heroNode;
                    break;
                }
                if(temp.next.no == heroNode.no){
                    flag =true;
                    break;
                }
                temp = temp.next;
            }

            if(flag){
                System.out.println("the heroNode is exist");
                return;
            }else {
                heroNode.next = temp.next;
                temp.next = heroNode;
            }

        }

        public void update(HeroNode heroNode){
            if(head.next == null){
                System.out.println("The linkedlist is empty");
                return;
            }

            HeroNode temp = head.next;
            boolean flag = false;
            while (true){
                if(temp == null){
                    break;
                }
                if(temp.no == heroNode.no){
                    flag = true;
                    break;
                }
                temp = temp.next;
            }

            if(flag){
                temp.name = heroNode.name;
                temp.nickName = heroNode.nickName;
            }else {
                System.out.println("not find");
            }

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
