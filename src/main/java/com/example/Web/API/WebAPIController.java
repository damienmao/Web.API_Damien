package com.example.Web.API;

import aj.org.objectweb.asm.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
//@RequestMapping(path="/coin")
public class WebAPIController {

    @Autowired
    private PriceInfoService priceInfoService;

    //retrieve one currency
    @GetMapping(value="/coins/{id}")
    public ResponseEntity<?> retrievePricesByID(@PathVariable String id){

       // CrytoPricesOutput[]  readvalues=new ObjectMapper().readValue(priceInfoService.getPriceInfo(id).getBody(),CrytoPricesOutput[].class);
        return ResponseEntity.ok(priceInfoService.getPriceInfo(id).getBody());
    }

}
