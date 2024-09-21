package com.brennan.json.orders.get_all_orders;

//Not needed as of now

public class GetAllOrdersJsonRequest {
    private String status;
    private String limit;
    private String after;
    private String until;
    private String direction;
    private boolean nested;
    private String symbols;
    private String side;

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getLimit() {
        return limit;
    }
    public void setLimit(String limit) {
        this.limit = limit;
    }
    public String getAfter() {
        return after;
    }
    public void setAfter(String after) {
        this.after = after;
    }
    public String getUntil() {
        return until;
    }
    public void setUntil(String until) {
        this.until = until;
    }
    public String getDirection() {
        return direction;
    }
    public void setDirection(String direction) {
        this.direction = direction;
    }
    public boolean isNested() {
        return nested;
    }
    public void setNested(boolean nested) {
        this.nested = nested;
    }
    public String getSymbols() {
        return symbols;
    }
    public void setSymbols(String symbols) {
        this.symbols = symbols;
    }
    public String getSide() {
        return side;
    }
    public void setSide(String side) {
        this.side = side;
    }
}
