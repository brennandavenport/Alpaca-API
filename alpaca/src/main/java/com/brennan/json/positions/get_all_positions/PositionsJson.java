package com.brennan.json.positions.get_all_positions;

public class PositionsJson {
    private int statusCode;
    private String asset_id;
    private String symbol;
    private String exchange;
    private String asset_class;
    private String avg_entry_price;
    private String qty;
    private String qty_available;
    private String side;
    private String market_value;
    private String cost_basis;
    private String unrealized_pl;
    private String unrealized_plpc;
    private String unrealized_intraday_pl;
    private String unrealized_intraday_plpc;
    private String current_price;
    private String lastday_price;
    private String change_today;
    private boolean asset_marginable;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getAsset_id() {
        return asset_id;
    }
    public void setAsset_id(String asset_id) {
        this.asset_id = asset_id;
    }
    public String getSymbol() {
        return symbol;
    }
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    public String getExchange() {
        return exchange;
    }
    public void setExchange(String exchange) {
        this.exchange = exchange;
    }
    public String getAsset_class() {
        return asset_class;
    }
    public void setAsset_class(String asset_class) {
        this.asset_class = asset_class;
    }
    public String getAvg_entry_price() {
        return avg_entry_price;
    }
    public void setAvg_entry_price(String avg_entry_price) {
        this.avg_entry_price = avg_entry_price;
    }
    public String getQty() {
        return qty;
    }
    public void setQty(String qty) {
        this.qty = qty;
    }
    public String getQty_available() {
        return qty_available;
    }
    public void setQty_available(String qty_available) {
        this.qty_available = qty_available;
    }
    public String getSide() {
        return side;
    }
    public void setSide(String side) {
        this.side = side;
    }
    public String getMarket_value() {
        return market_value;
    }
    public void setMarket_value(String market_value) {
        this.market_value = market_value;
    }
    public String getCost_basis() {
        return cost_basis;
    }
    public void setCost_basis(String cost_basis) {
        this.cost_basis = cost_basis;
    }
    public String getUnrealized_pl() {
        return unrealized_pl;
    }
    public void setUnrealized_pl(String unrealized_pl) {
        this.unrealized_pl = unrealized_pl;
    }
    public String getUnrealized_plpc() {
        return unrealized_plpc;
    }
    public void setUnrealized_plpc(String unrealized_plpc) {
        this.unrealized_plpc = unrealized_plpc;
    }
    public String getUnrealized_intraday_pl() {
        return unrealized_intraday_pl;
    }
    public void setUnrealized_intraday_pl(String unrealized_intraday_pl) {
        this.unrealized_intraday_pl = unrealized_intraday_pl;
    }
    public String getUnrealized_intraday_plpc() {
        return unrealized_intraday_plpc;
    }
    public void setUnrealized_intraday_plpc(String unrealized_intraday_plpc) {
        this.unrealized_intraday_plpc = unrealized_intraday_plpc;
    }
    public String getCurrent_price() {
        return current_price;
    }
    public void setCurrent_price(String current_price) {
        this.current_price = current_price;
    }
    public String getLastday_price() {
        return lastday_price;
    }
    public void setLastday_price(String lastday_price) {
        this.lastday_price = lastday_price;
    }
    public String getChange_today() {
        return change_today;
    }
    public void setChange_today(String change_today) {
        this.change_today = change_today;
    }
    public boolean isAsset_marginable() {
        return asset_marginable;
    }
    public void setAsset_marginable(boolean asset_marginable) {
        this.asset_marginable = asset_marginable;
    }


    @Override
    public String toString() {
        return "Positions Information \nasset_id=" + asset_id + "\nsymbol=" + symbol + "\nexchange=" + exchange + "\nasset_class="
                + asset_class + "\navg_entry_price=" + avg_entry_price + "\nqty=" + qty + "\nqty_available="
                + qty_available + "\nside=" + side + "\nmarket_value=" + market_value + "\ncost_basis=" + cost_basis
                + "\nunrealized_pl=" + unrealized_pl + "\nunrealized_plpc=" + unrealized_plpc
                + "\nunrealized_intraday_pl=" + unrealized_intraday_pl + "\nunrealized_intraday_plpc="
                + unrealized_intraday_plpc + "\ncurrent_price=" + current_price + "\nlastday_price=" + lastday_price
                + "\nchange_today=" + change_today + "\nasset_marginable=" + asset_marginable;
    }
}
