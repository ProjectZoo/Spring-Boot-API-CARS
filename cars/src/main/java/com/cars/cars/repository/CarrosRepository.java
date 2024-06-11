package com.cars.cars.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cars.cars.model.Carros;
public class CarrosRepository extends JpaRepository<Carros, Long> {
    Carros findById(Long Id);
    
}
