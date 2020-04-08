package njustz.data_structure.hashtable;


/**
 * @author njustz
 * @date 2020/4/8
 */
public class HashTableTest {
    public static void main(String[] args) {
        Emploee emploee1 = new Emploee(1,"aa1");
        Emploee emploee2 = new Emploee(2,"bbb");
        Emploee emploee3 = new Emploee(3,"ccc");
        Emploee emploee4 = new Emploee(4,"ddd");
        Emploee emploee5 = new Emploee(8,"aa2");
        /*EmpLinkedList empLinkedList = new EmpLinkedList();
        empLinkedList.add(emploee1);
        empLinkedList.add(emploee2);
        empLinkedList.add(emploee3);
        empLinkedList.add(emploee4);
        empLinkedList.showList();*/

        HashTab hashTab = new HashTab(7);
        hashTab.add(emploee1);
        hashTab.add(emploee2);
        hashTab.add(emploee3);
        hashTab.add(emploee4);
        hashTab.add(emploee5);
        hashTab.listShow();
        System.out.println("----------------");
        hashTab.findById(8);
    }
}

class Emploee{
    int id;
    String name;
    Emploee next;

    public Emploee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Emploee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class EmpLinkedList{
    private Emploee head;

    public void add(Emploee emploee){
        if(head == null){
            head = emploee;
            return;
        }

        Emploee temp = head;
        while (true) {
            if(temp.next == null){
                break;
            }
            temp = temp.next;
        }
        temp.next = emploee;
    }

    public void showList(){
        if(head == null){
            System.out.println("the list is null");
            return;
        }
        Emploee temp = head;
        while (true){
            System.out.print(temp + " ");
            if(temp.next == null){
                break;
            }
            temp = temp.next;
        }
        System.out.println();
    }

    public Emploee findById(int id){
        if(head == null){
            System.out.println("the list is null");
            return null;
        }
        Emploee temp = head;
        while (true){
            if(temp.id == id){
                return temp;
            }
            temp = temp.next;
            if(temp == null){
                return null;
            }
        }

    }

}

class HashTab{

    private EmpLinkedList[] empLinkedLists;
    private int size;

    public HashTab(int size){
        this.size = size;
        empLinkedLists = new EmpLinkedList[size];
        //一定要初始化每个链表
        for (int i = 0; i < size; i++) {
            empLinkedLists[i] = new EmpLinkedList();
        }
    }

    public int hashFunc(int id){
        return id%size;
    }

    public void  add(Emploee emploee){
        int empId = hashFunc(emploee.id);
        empLinkedLists[empId].add(emploee);
    }

    public void findById(int id){
        int empId = hashFunc(id);
        Emploee emploee = empLinkedLists[empId].findById(id);
        if(emploee != null){
            System.out.println("find: " + emploee);
        }else {
            System.out.println("not find");
        }
    }

    public void listShow(){
        for (int i = 0; i < size; i++) {
            empLinkedLists[i].showList();
        }
    }
}
