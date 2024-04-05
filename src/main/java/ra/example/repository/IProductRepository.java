package ra.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ra.example.model.entity.Product;

@Repository
public interface IProductRepository extends JpaRepository<Product,Long> {
}
