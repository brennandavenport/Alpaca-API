package com.brennan.json.orders.create_order;

//Object used for JSON request

public class CreateOrderJsonRequest {
    private String symbol;
    private String qty;
    private String side; //buy or sell
    private String type; //market, limit, etc.
    private String time_in_force;
    //required above optional below
    //private String limit_price; //req. if type is limit or stop_limit
    //private String stop_price; //req. if type is limit or stop_limit
    //private String trail_price; //req. if 
    
    public String getSymbol() {
        return symbol;
    }
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    public String getQty() {
        return qty;
    }
    public void setQty(String qty) {
        this.qty = qty;
    }
    public String getSide() {
        return side;
    }
    public void setSide(String side) {
        this.side = side;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getTime_in_force() {
        return time_in_force;
    }
    public void setTime_in_force(String time_in_force) {
        this.time_in_force = time_in_force;
    }    
}

