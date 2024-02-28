package qr.market.backenf.service.dto;

import java.math.BigDecimal;

public class PaymentParam {
    private Long productId;
    private String productName;
    private Integer quantity;
    private BigDecimal currentPrice;
    private BigDecimal sum;

    public PaymentParam(Long productId, String productName, Integer quantity, BigDecimal currentPrice, BigDecimal sum) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.currentPrice = currentPrice;
        this.sum = sum;
    }
     
    public PaymentParam(PaymentList paymentList, <MarketBase marketbase){
        this.productId = product.Id 
    }

}
