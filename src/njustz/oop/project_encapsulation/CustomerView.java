package njustz.oop.project_encapsulation;

/**
 * @author njustz
 * @date 2020/3/1
 */
public class CustomerView {

    private CustomerList customerList = new CustomerList(10);

    public void enterMainMenu(){

       /* Customer customer = new Customer("hhh", '男', 26, "12567896789", "hhh@lll.com");
        customerList.addCustomer(customer);*/

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
        System.out.println("---------------添加客户---------------");
        System.out.println("姓名: ");
        String name = CMUtility.readString(10);
        System.out.println("性别: ");
        char gender = CMUtility.readChar();
        System.out.println("年龄: ");
        int age = CMUtility.readInt();
        System.out.println("电话: ");
        String phone = CMUtility.readString(13);
        System.out.println("邮箱: ");
        String email = CMUtility.readString(20);
        Customer customer = new Customer(name, gender, age, phone, email);
        boolean addCustomer = customerList.addCustomer(customer);
        if (!addCustomer){
            System.out.println("---------------添加客户失败---------------");
        }else
            System.out.println("---------------添加客户完成---------------");

    }

    private void modifyCustomer(){
        System.out.println("修改客户");

    }

    private void deleteCustomer(){
        System.out.println("---------------删除客户---------------");
        listAllCustomer();
        System.out.println("请选择删除用户编号：");
        int index = CMUtility.readInt();
        boolean deleteCustomer = customerList.deleteCustomer((index -1));
        if (!deleteCustomer){
            System.out.println("---------------删除客户失败---------------");
        }else
            System.out.println("---------------删除客户完成---------------");
    }

    private void listAllCustomer(){
        System.out.println("---------------客户列表---------------");
        int total = customerList.getTotal();
        if(total == 0){
            System.out.println("没有客户信息");
        }else {
            System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
            Customer[] allCustomers = customerList.getAllCustomers();
            for(Customer customer : allCustomers){
                int i = 1;
                System.out.println(i + "\t\t" + customer.getName() + "\t\t" + customer.getGender() + "\t\t" + customer.getAge() + "\t\t" + customer.getPhone() + "\t" + customer.getEmail());
                i++;
            }
        }

        System.out.println("---------------客户列表完成---------------");
    }

    public static void main(String[] args) {
        CustomerView customerView = new CustomerView();
        customerView.enterMainMenu();
    }

}
