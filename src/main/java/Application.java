import com.meda.dao.CustomerDao;
import com.meda.daoImpl.CustomerDaoImpl;
import com.meda.domain.Customer;
import com.meda.service.CustomerService;
import com.meda.serviceImpl.CustomerServiceImpl;

public class Application {

    public static void main(String[] args){
        CustomerDao dao =   new CustomerDaoImpl();
        CustomerService service = new CustomerServiceImpl(dao);

        Customer customer1 = Customer.builder().withId(1l).withFirstName("AAA").withLastName("BBB").build();
        Customer customer2 = Customer.builder().withId(2l).withFirstName("CCC").withLastName("DDD").build();
        Customer customer3 = Customer.builder().withId(3l).withFirstName("EEE").withLastName("FFF").build();
        dao.createCustomer(customer1);
        dao.createCustomer(customer2);
        dao.createCustomer(customer3);

        System.out.println(service.findAllCustomer());


    }
}
