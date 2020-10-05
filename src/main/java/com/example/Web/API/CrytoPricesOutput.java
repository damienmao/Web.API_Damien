package com.example.Web.API;

public class CrytoPricesOutput {
    private String id;
    private String name;
    private String symbol;
    private String last_updated;
    /*private String price_usd;     //in aud/jpy as well
    private String price_btc;
    private String twentyFourHour_volume_usd; //in aud,jpy,btc
    private String percent_change_24h;
    private String market_cap_usd;*/
    //last week price in Aud,usd,py,btc
    //Genesis date

    public CrytoPricesOutput (CrytoPricesOutputBuilder crytoPricesOutputBuilder){
        id=crytoPricesOutputBuilder.id;
        name= crytoPricesOutputBuilder.name;
        symbol= crytoPricesOutputBuilder.symbol;
        last_updated= crytoPricesOutputBuilder.last_updated;
        /*price_usd= crytoPricesOutputBuilder.price_usd;
        price_btc= crytoPricesOutputBuilder.price_btc;
        twentyFourHour_volume_usd= crytoPricesOutputBuilder.twentyFourHour_volume_usd;
        percent_change_24h= crytoPricesOutputBuilder.percent_change_24h;
        market_cap_usd= crytoPricesOutputBuilder.market_cap_usd;*/
    }

    public CrytoPricesOutput() {
    }
}
