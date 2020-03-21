package repositories;

import entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FastFoodRepository extends JpaRepository<Order, Long> {

}
