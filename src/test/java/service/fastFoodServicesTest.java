package service;

import entities.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import repositories.FastFoodRepository;
import services.FastFoodService;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class fastFoodServicesTest {

   FastFoodRepository fastFoodRepository;


   @Test
    void createAndOrder(){

       Order order = new Order("Asahi", "BigAzzBurger");
       FastFoodService fastFoodService = new FastFoodService(fastFoodRepository);
       assertNotNull(fastFoodService.createOrder(order).getId());

   }


}
