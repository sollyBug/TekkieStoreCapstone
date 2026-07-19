package za.ac.cput.tekkiestorecapstone.factory;

import za.ac.cput.tekkiestorecapstone.domain.OrderItem;
import za.ac.cput.tekkiestorecapstone.util.Helper;

public class OrderItemFactory {
    public static OrderItem createOrderItem(String orderItemId,
                                            int quantity,
                                            double unitPrice,
                                            double subTotal) {

        if (Helper.isNullOrEmpty(orderItemId)) {
            return null;
        }

        if (quantity <= 0 || unitPrice < 0) {
            return null;
        }

        return new OrderItem.Builder()
                .setOrderItemId(orderItemId)
                .setQuantity(quantity)
                .setUnitPrice(unitPrice)
                .setSubTotal(quantity * unitPrice)
                .build();
    }
}