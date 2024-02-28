package qr.market.backenf.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import qr.market.backenf.domain.MarketBase;
import qr.market.backenf.repository.MarketBaseRepository;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class MarketBaseService {
private final MarketBaseRepository marketBaseRepository;

    public MarketBaseService(MarketBaseRepository marketBaseRepository) {
        this.marketBaseRepository = marketBaseRepository;
    }
    public MarketBase save(MarketBase marketBase){
        if(marketBase.getId()==null) {
            marketBase.setCreateDate(ZonedDateTime.now());
        }
        return marketBaseRepository.save(marketBase);
    }
    public MarketBase findOne(Long id){
        Optional<MarketBase>optional=marketBaseRepository.findById(id);
        if(optional.isPresent()){
            MarketBase marketBase=optional.get();
            return marketBase;
        }
        return null;
    }

    public List<MarketBase> saveList(List<MarketBase> marketBases) {
        List<MarketBase> marketBaseList=marketBaseRepository.saveAll(marketBases);
return marketBaseList;
    }
    public Page<MarketBase> findAll(Pageable pageable){
        Page<MarketBase> page=marketBaseRepository.findAll(pageable);
        return page;
    }
    public void delete(Long id){
        marketBaseRepository.deleteById(id);
    }

@Transactional(readOnly = true)
    public MarketBase findByProductCode(String code) {
        return marketBaseRepository.findTopByProductCode(code);

    }


}
