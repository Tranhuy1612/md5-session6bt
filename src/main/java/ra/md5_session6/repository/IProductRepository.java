package ra.md5_session6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ra.md5_session6.model.Product;


@Repository
public interface IProductRepository extends JpaRepository<Product,Long> {
}
