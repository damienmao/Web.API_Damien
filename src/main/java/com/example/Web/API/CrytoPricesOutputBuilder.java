package com.example.Web.API;

public class CrytoPricesOutputBuilder {
    public String id;
    public String name;
    public String symbol;
    public String last_updated;
   /* public String price_usd;     //in aud/jpy as well
    public String price_btc;
    public String twentyFourHour_volume_usd; //in aud,jpy,btc
    public String percent_change_24h;
    public String market_cap_usd;*/
    //last week price in Aud,usd,py,btc
    //Genesis date




    public CrytoPricesOutputBuilder getId(String id) {
        this.id=id;
        return this;
    }

    public CrytoPricesOutputBuilder getName(String name) {
        this.name=name;
        return this;
    }

    public CrytoPricesOutputBuilder getSymbol(String symbol) {
        this.symbol=symbol;
        return this;
    }

    public CrytoPricesOutputBuilder getLast_updated(String last_updated) {
        this.last_updated=last_updated;
        return this;
    }

    /*public CrytoPricesOutputBuilder getPrice_usd(String price_usd ) {
        this.price_usd=price_usd;
        return this;
    }

    public CrytoPricesOutputBuilder getPrice_btc(String price_btc) {
        this.price_btc=price_btc;
        return this;
    }

    public CrytoPricesOutputBuilder getTwentyFourHour_volume_usd(String twentyFourHour_volume_usd) {
        this.twentyFourHour_volume_usd=twentyFourHour_volume_usd;
        return this;
    }

    public CrytoPricesOutputBuilder getPercent_change_24h(String percent_change_24h) {
        this.percent_change_24h=percent_change_24h;
        return this;
    }

    public CrytoPricesOutputBuilder getMarket_cap_usd(String market_cap_usd) {
        this.market_cap_usd=market_cap_usd;
        return this;
    }*/
    public CrytoPricesOutput build(){
        return new CrytoPricesOutput(this);
    }
}
