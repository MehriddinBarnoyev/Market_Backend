package qr.market.backenf.web.rest;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import qr.market.backenf.domain.MarketBase;
import qr.market.backenf.service.MarketBaseService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MarketBaseResource {
    private  final MarketBaseService marketBaseService;

    public MarketBaseResource(MarketBaseService marketBaseService) {
        this.marketBaseService = marketBaseService;
    }
@PostMapping("/market-base")
    public ResponseEntity <?> create(@RequestBody MarketBase marketBase){
        MarketBase newMarketBase=marketBaseService.save(marketBase);
        return ResponseEntity.ok(marketBase);
}
    @PostMapping("/market-base/list")
    public ResponseEntity <?> createList(@RequestBody List<MarketBase> marketBaseList){
        List<MarketBase> newMarketBase=marketBaseService.saveList(marketBaseList);
        return ResponseEntity.ok("Maxsulotlar ro'yhatga olindi");
    }
    @PutMapping("/market-base")
    public ResponseEntity <?> update(@RequestBody MarketBase marketBase){
        MarketBase newMarketBase=marketBaseService.save(marketBase);
        return ResponseEntity.ok(marketBase);
    }
    @GetMapping("/market-base/{id}")
    public ResponseEntity<?>getOne(@PathVariable Long id){
        MarketBase marketBase=marketBaseService.findOne(id);
        return ResponseEntity.ok(marketBase);
    }

    @GetMapping("/market-base")
    public ResponseEntity<?>getAll(Pageable pageable){
        Page<MarketBase> marketBase=marketBaseService.findAll(pageable);
        return ResponseEntity.ok(marketBase);
    }
    @GetMapping("/market-base/code")
    public ResponseEntity<?>getAll(@RequestParam String code){
        MarketBase  marketBase=marketBaseService.findByProductCode(code);
        return ResponseEntity.ok(marketBase);
    }
    @DeleteMapping("/market-base/{id}")
            public void delete(@PathVariable Long id){
marketBaseService.delete(id);
    }

}
