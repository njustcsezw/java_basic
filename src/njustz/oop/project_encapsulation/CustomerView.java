package njustz.oop.project_encapsulation;

/**
 * @author njustz
 * @date 2020/3/1
 */
public class CustomerView {

    private CustomerList customerList = new CustomerList(10);

    public void enterMainMenu(){

        boolean isFlag = true;
        while (isFlag){
            System.out.println("\n---------------客户信息软件---------------");
            System.out.println("                1添加客户");
            System.out.println("                2修改客户");
            System.out.println("                3删除客户");
            System.out.println("                4客户列表");
            System.out.println("                5退    出\n");
            System.out.println("               请选择(1-5): ");

            char menu = CMUtility.readMenuSelection();
            switch (menu){
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomer();
                    break;
                case '5':
                    System.out.println("是否确定退出(Y/N): ");
                    char isExit = CMUtility.readConfirmSelection();
                    if (isExit == 'Y'){
                        isFlag = false;
                    }

            }


        }


    }

    private void addNewCustomer(){
        System.out.println("添加客户");
    }

    private void modifyCustomer(){
        System.out.println("修改客户");

    }

    private void deleteCustomer(){
        System.out.println("删除客户");
    }

    private void listAllCustomer(){
        System.out.println("客户列表");

    }

    public static void main(String[] args) {
        CustomerView customerView = new CustomerView();
        customerView.enterMainMenu();
    }

}
