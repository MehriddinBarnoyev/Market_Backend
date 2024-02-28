package qr.market.backenf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import qr.market.backenf.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    Product findByCode (String code);
}
