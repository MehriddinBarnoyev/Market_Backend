package qr.market.backenf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import qr.market.backenf.domain.PaymentList;

@Repository
public interface PaymentListRepository extends JpaRepository<PaymentList,Long> {
}
