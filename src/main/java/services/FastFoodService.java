package services;

import entities.Order;
import org.springframework.stereotype.Service;
import repositories.FastFoodRepository;

import java.time.LocalDate;

@Service
public class FastFoodService {

    FastFoodRepository fastFoodRepository;

    public FastFoodService(FastFoodRepository fastFoodRepository) {
        this.fastFoodRepository = fastFoodRepository;
    }

    public Order createOrder(Order order) {
        LocalDate localDate = LocalDate.now();
        order.setLastUpdated(localDate);
        order.setCreatedAt(localDate);
        return fastFoodRepository.save(order);
    }
}
