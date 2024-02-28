package qr.market.backenf.web.rest;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import qr.market.backenf.domain.PaymentList;

import qr.market.backenf.service.PaymentListService;

@RestController
@RequestMapping("/api")
public class PaymentListResource {
    private  final PaymentListService paymentListService;

    public PaymentListResource(PaymentListService paymentListService) {
        this.paymentListService = paymentListService;
    }

    @PostMapping("/payment")
    public ResponseEntity<?> create(@RequestBody PaymentList paymentList){
        PaymentList paymentList1=paymentListService.save(paymentList);
        return ResponseEntity.ok(paymentList);
    }
    @PutMapping("/payment")
    public ResponseEntity <?> update(@RequestBody PaymentList paymentList){
        PaymentList paymentList1=paymentListService.save(paymentList);
        return ResponseEntity.ok(paymentList);
    }
    @GetMapping("/payment/{id}")
    public ResponseEntity<?>getOne(@PathVariable Long id){
        PaymentList paymentList=paymentListService.findOne(id);
        return ResponseEntity.ok(paymentList);
    }
    @GetMapping("/payment")
    public ResponseEntity<?>getAll(Pageable pageable){
        Page<PaymentList> paymentListPage=paymentListService.findAll(pageable);
        return ResponseEntity.ok(paymentListPage);
    }
    @DeleteMapping("/payment/{id}")
    public void delete(@PathVariable Long id){
        paymentListService.delete(id);
    }
}
