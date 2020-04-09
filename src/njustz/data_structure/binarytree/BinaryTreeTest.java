package njustz.data_structure.binarytree;

/**
 * @author njustz
 * @date 2020/4/9
 */
public class BinaryTreeTest {
    public static void main(String[] args) {
        HeroNode root = new HeroNode(1,"sj");
        HeroNode heroNode2 = new HeroNode(2, "ljy");
        HeroNode heroNode3 = new HeroNode(3,"wy");
        HeroNode heroNode4 = new HeroNode(4,"gs");
        HeroNode heroNode5 = new HeroNode(5,"qm");
        root.setLeft(heroNode2);
        root.setRight(heroNode3);
        heroNode3.setRight(heroNode4);
        heroNode3.setLeft(heroNode5);
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.setRoot(root);
        binaryTree.preOrder();
        System.out.println("---------------");
        binaryTree.infixOrder();
        System.out.println("---------------");
        binaryTree.postOrder();
        System.out.println("---------------");
        System.out.println(binaryTree.preOrderFind(5));
        System.out.println(binaryTree.infixOrderFind(5));
        System.out.println(binaryTree.postOrderFind(5));
    }
}

class HeroNode{
    private int id;
    private String name;
    private HeroNode left;
    private HeroNode right;

    public HeroNode(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HeroNode getLeft() {
        return left;
    }

    public void setLeft(HeroNode left) {
        this.left = left;
    }

    public HeroNode getRight() {
        return right;
    }

    public void setRight(HeroNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    //前序遍历
    public void preOrder(){
        System.out.println(this);
        if(this.left != null){
            this.left.preOrder();
        }
        if(this.right != null){
            this.right.preOrder();
        }
    }

    //中序遍历
    public void infixOrder(){
        if(this.left != null){
            this.left.infixOrder();
        }
        System.out.println(this);
        if(this.right != null){
            this.right.infixOrder();
        }
    }

    //后序遍历
    public void postOrder(){
        if(this.left != null){
            this.left.postOrder();
        }
        if(this.right != null){
            this.right.postOrder();
        }
        System.out.println(this);
    }

    public HeroNode preOrderFind(int no){
        System.out.println("preOrderFind...");
        if(this.id == no){
            return this;
        }
        HeroNode heroNode = null;
        if(this.left != null){
            heroNode = this.left.preOrderFind(no);
        }
        if(heroNode!= null){
            return heroNode;
        }
        if(this.right != null){
            heroNode = this.right.preOrderFind(no);
        }
        return heroNode;
    }

    public HeroNode infixOrderFind(int no){
        HeroNode heroNode = null;
        if(this.left != null){
            heroNode = this.left.infixOrderFind(no);
        }
        if(heroNode!= null){
            return heroNode;
        }
        System.out.println("infixOrderFind...");
        if(this.id == no){
            return this;
        }
        if(this.right != null){
            heroNode = this.right.infixOrderFind(no);
        }
        return heroNode;
    }

    public HeroNode postOrderFind(int no){
        HeroNode heroNode = null;
        if(this.left != null){
            heroNode = this.left.postOrderFind(no);
        }
        if(heroNode!= null){
            return heroNode;
        }
        if(this.right != null){
            heroNode = this.right.postOrderFind(no);
        }
        if(heroNode!= null){
            return heroNode;
        }
        System.out.println("postOrderFind...");
        if(this.id == no){
            return this;
        }
        return heroNode;
    }

}

class BinaryTree{
    private HeroNode root;

    public void setRoot(HeroNode root) {
        this.root = root;
    }

    public void preOrder(){
        if(this.root != null){
            root.preOrder();
        }else {
            System.out.println("the tree is null");
        }
    }

    public void infixOrder(){
        if(this.root != null){
            root.infixOrder();
        }else {
            System.out.println("the tree is null");
        }
    }

    public void postOrder(){
        if(this.root != null){
            root.postOrder();
        }else {
            System.out.println("the tree is null");
        }
    }


    public HeroNode preOrderFind(int no){
        if(root != null){
            return root.preOrderFind(no);
        }else {
            return null;
        }
    }

    public HeroNode infixOrderFind(int no){
        if(root != null){
            return root.infixOrderFind(no);
        }else {
            return null;
        }
    }

    public HeroNode postOrderFind(int no){
        if(root != null){
            return root.postOrderFind(no);
        }else {
            return null;
        }
    }


}
