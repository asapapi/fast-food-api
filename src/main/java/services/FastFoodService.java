package services;

import org.springframework.stereotype.Service;
import repositories.FastFoodRepository;

@Service
public class FastFoodService {

    FastFoodRepository fastFoodRepository;

    public FastFoodService(FastFoodRepository fastFoodRepository) {
        this.fastFoodRepository = fastFoodRepository;
    }
}
