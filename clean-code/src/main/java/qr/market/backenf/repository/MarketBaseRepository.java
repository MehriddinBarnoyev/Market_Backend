package qr.market.backenf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import qr.market.backenf.domain.MarketBase;

@Repository
public interface MarketBaseRepository extends JpaRepository<MarketBase,Long> {

    MarketBase findTopByProductCode(String code);
}
