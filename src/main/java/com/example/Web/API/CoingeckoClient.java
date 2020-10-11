package com.example.Web.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CoingeckoClient {

    @Autowired
    private RestTemplate restTemplate;

    public ResponseEntity<CrytoPricesOutput> getInfoCoingecko(String id){
        System.out.println("API Coingecko");
        return restTemplate.getForEntity("https://api.coingecko.com/api/v3/coins/"+id+"?fields=id,name,symbol,last_updated",CrytoPricesOutput.class);
        //.getForEntity method retrieves resources of a given URI or URL templates



        /*ArrayList<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
        //Add the Jackson Message converter
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();

        // Note: here we are making this converter to process any kind of response,
        // not only application/*json, which is the default behaviour

        converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
        messageConverters.add(converter);
        restTemplate.setMessageConverters(messageConverters);*/

    }

}
