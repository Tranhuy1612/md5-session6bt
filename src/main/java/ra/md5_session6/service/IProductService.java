package ra.md5_session6.service;



import ra.md5_session6.model.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    List<Product> findAll();
    Optional<Product> findById(Long id);
    void deleteById(Long id);
}
