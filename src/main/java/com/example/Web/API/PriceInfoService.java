package com.example.Web.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service  //what does it do?
public class PriceInfoService {
    @Autowired
    private CoingeckoClient coingeckoClient;

    public ResponseEntity<CrytoPricesOutput> getPriceInfo(String id){
        return coingeckoClient.getInfoCoingecko(id);
    }

}
