package za.ac.cput.tekkiestorecapstone.service;

import za.ac.cput.tekkiestorecapstone.domain.Order;
import java.util.List;

public interface IOrderService extends IService<Order, String> {
    List<Order> getAll();
}
