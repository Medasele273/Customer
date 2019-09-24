import com.meda.dao.CustomerDao;
import com.meda.daoImpl.CustomerDaoImpl;
import com.meda.domain.Customer;
import com.meda.service.CustomerService;
import com.meda.serviceImpl.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Optional;

public class Application {

    public static void main(String[] args){
        /*CustomerDao dao =   new CustomerDaoImpl();
        CustomerService service = new CustomerServiceImpl(dao);

        Customer customer1 = Customer.builder().withId(1l).withFirstName("AAA").withLastName("BBB").build();
        Customer customer2 = Customer.builder().withId(2l).withFirstName("CCC").withLastName("DDD").build();
        Customer customer3 = Customer.builder().withId(3l).withFirstName("EEE").withLastName("FFF").build();
        dao.createCustomer(customer1);
        dao.createCustomer(customer2);
        dao.createCustomer(customer3);

        System.out.println(service.findAllCustomer());
*/
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("customer.xml");
        CustomerDao dao = applicationContext.getBean("customerDao",CustomerDao.class);
        CustomerService service =applicationContext.getBean("customerService",CustomerService.class);
        Customer customer1 = Customer.builder().withId(1l).withFirstName("AAA").withLastName("BBB").build();
        Customer customer2 = Customer.builder().withId(2l).withFirstName("CCC").withLastName("DDD").build();
        Customer customer3 = Customer.builder().withId(3l).withFirstName("EEE").withLastName("FFF").build();
        dao.createCustomer(customer1);
        dao.createCustomer(customer2);
        dao.createCustomer(customer3);
        Optional<Customer> fetched = dao.read(4l);
        System.out.println(fetched);

        System.out.println(service.findAllCustomer());
    }
}
