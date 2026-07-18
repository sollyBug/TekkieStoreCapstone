package za.ac.cput.tekkiestorecapstone.factory;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Order;
import za.ac.cput.tekkiestorecapstone.domain.Customer;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CustomerFactoryTest {

    @Test
    @Order(1)
    public void createCustomer() {

        Customer customer = CustomerFactory.createCustomer(
                "C001",
                "John",
                "Michael",
                "Smith",
                "johnsmith@gmail.com",
                "0821234567",
                "12",
                "Main Road",
                "Claremont",
                "Cape Town",
                "7708"
        );

        assertNotNull(customer);
        System.out.println(customer.toString());
    }

    @Test
    @Order(2)
    public void createCustomerWithoutEmail() {

        Customer customer = CustomerFactory.createCustomer(
                "C001",
                "John",
                "Michael",
                "Smith",
                "",
                "0821234567",
                "12",
                "Main Road",
                "Claremont",
                "Cape Town",
                "7708"
        );

        assertNull(customer);
    }
}