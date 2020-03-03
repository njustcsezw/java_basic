package njustz.oop.project_encapsulation;

/**
 * @author njustz
 * @date 2020/3/1
 */
public class CustomerList {

    private Customer[] customers;
    private int total;

    public CustomerList(int totalCustomer){
        this.customers = new Customer[totalCustomer];
    }

    public boolean addCustomer(Customer customer){
        if(total >= customers.length){
            return false;
        }
        customers[total++] = customer;
        return true;
    }

    public boolean replaceCustomer(int index, Customer customer){
        if(index < 0 || index >= total){
            return false;
        }
        customers[index] = customer;
        return true;
    }

    public boolean deleteCustomer(int index){
        if(index < 0 || index >= total){
            return false;
        }
        for(int i = index; i < total-1; i++){
            customers[i] = customers[i + 1];
        }
        customers[total-1] = null;
        total -- ;
        return true;
    }

    public Customer[] getAllCustomers(){
        Customer[] customerLists = new  Customer[total];
        for(int i = 0; i < total; i++){
            customerLists[i] = customers[i];
        }
        return customerLists;
    }

    public Customer getCustomer(int index){
        if(index < 0 || index >= total){
            return null;
        }
        return customers[index];
    }

    public int getTotal(){
        return total;
    }

}
