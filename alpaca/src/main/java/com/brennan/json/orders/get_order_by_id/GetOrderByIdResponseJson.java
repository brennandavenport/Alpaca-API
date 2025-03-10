package com.brennan.json.orders.get_order_by_id;

public class GetOrderByIdResponseJson {
    private String id;
    private String client_order_id;
    private String created_at;
    private String updated_at;
    private String submitted_at;
    private String filled_at;
    private String expired_at;
    private String canceled_at;
    private String failed_at;
    private String replaced_at;
    private String replaced_by;
    private String replaces;
    private String asset_id;
    private String symbol;
    private String asset_class;
    private String notional;
    private String qty;
    private String filled_qty;
    private String filled_avg_price;
    private String order_class;
    private String order_type;
    private String type;
    private String side;
    private String time_in_force;
    private String limit_price;
    private String stop_price;
    private String status;
    private String extended_hours;
    private String legs;
    private String trail_percent;
    private String trail_price;
    private String hwm;
    private String subtag;
    private String source;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getClient_order_id() {
        return client_order_id;
    }
    public void setClient_order_id(String client_order_id) {
        this.client_order_id = client_order_id;
    }
    public String getCreated_at() {
        return created_at;
    }
    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
    public String getUpdated_at() {
        return updated_at;
    }
    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
    public String getSubmitted_at() {
        return submitted_at;
    }
    public void setSubmitted_at(String submitted_at) {
        this.submitted_at = submitted_at;
    }
    public String getFilled_at() {
        return filled_at;
    }
    public void setFilled_at(String filled_at) {
        this.filled_at = filled_at;
    }
    public String getExpired_at() {
        return expired_at;
    }
    public void setExpired_at(String expired_at) {
        this.expired_at = expired_at;
    }
    public String getCanceled_at() {
        return canceled_at;
    }
    public void setCanceled_at(String canceled_at) {
        this.canceled_at = canceled_at;
    }
    public String getFailed_at() {
        return failed_at;
    }
    public void setFailed_at(String failed_at) {
        this.failed_at = failed_at;
    }
    public String getReplaced_at() {
        return replaced_at;
    }
    public void setReplaced_at(String replaced_at) {
        this.replaced_at = replaced_at;
    }
    public String getReplaced_by() {
        return replaced_by;
    }
    public void setReplaced_by(String replaced_by) {
        this.replaced_by = replaced_by;
    }
    public String getReplaces() {
        return replaces;
    }
    public void setReplaces(String replaces) {
        this.replaces = replaces;
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
    public String getAsset_class() {
        return asset_class;
    }
    public void setAsset_class(String asset_class) {
        this.asset_class = asset_class;
    }
    public String getNotional() {
        return notional;
    }
    public void setNotional(String notional) {
        this.notional = notional;
    }
    public String getQty() {
        return qty;
    }
    public void setQty(String qty) {
        this.qty = qty;
    }
    public String getFilled_qty() {
        return filled_qty;
    }
    public void setFilled_qty(String filled_qty) {
        this.filled_qty = filled_qty;
    }
    public String getFilled_avg_price() {
        return filled_avg_price;
    }
    public void setFilled_avg_price(String filled_avg_price) {
        this.filled_avg_price = filled_avg_price;
    }
    public String getOrder_class() {
        return order_class;
    }
    public void setOrder_class(String order_class) {
        this.order_class = order_class;
    }
    public String getOrder_type() {
        return order_type;
    }
    public void setOrder_type(String order_type) {
        this.order_type = order_type;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getSide() {
        return side;
    }
    public void setSide(String side) {
        this.side = side;
    }
    public String getTime_in_force() {
        return time_in_force;
    }
    public void setTime_in_force(String time_in_force) {
        this.time_in_force = time_in_force;
    }
    public String getLimit_price() {
        return limit_price;
    }
    public void setLimit_price(String limit_price) {
        this.limit_price = limit_price;
    }
    public String getStop_price() {
        return stop_price;
    }
    public void setStop_price(String stop_price) {
        this.stop_price = stop_price;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getExtended_hours() {
        return extended_hours;
    }
    public void setExtended_hours(String extended_hours) {
        this.extended_hours = extended_hours;
    }
    public String getLegs() {
        return legs;
    }
    public void setLegs(String legs) {
        this.legs = legs;
    }
    public String getTrail_percent() {
        return trail_percent;
    }
    public void setTrail_percent(String trail_percent) {
        this.trail_percent = trail_percent;
    }
    public String getTrail_price() {
        return trail_price;
    }
    public void setTrail_price(String trail_price) {
        this.trail_price = trail_price;
    }
    public String getHwm() {
        return hwm;
    }
    public void setHwm(String hwm) {
        this.hwm = hwm;
    }
    public String getSubtag() {
        return subtag;
    }
    public void setSubtag(String subtag) {
        this.subtag = subtag;
    }
    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "Order By ID Information \nid=" + id + "\nclient_order_id=" + client_order_id + "\ncreated_at=" + created_at
                + "\nupdated_at=" + updated_at + "\nsubmitted_at=" + submitted_at + "\nfilled_at=" + filled_at
                + "\nexpired_at=" + expired_at + "\ncanceled_at=" + canceled_at + "\nfailed_at=" + failed_at
                + "\nreplaced_at=" + replaced_at + "\nreplaced_by=" + replaced_by + "\nreplaces=" + replaces
                + "\nasset_id=" + asset_id + "\nsymbol=" + symbol + "\nasset_class=" + asset_class + "\nnotional="
                + notional + "\nqty=" + qty + "\nfilled_qty=" + filled_qty + "\nfilled_avg_price=" + filled_avg_price
                + "\norder_class=" + order_class + "\norder_type=" + order_type + "\ntype=" + type + "\nside=" + side
                + "\ntime_in_force=" + time_in_force + "\nlimit_price=" + limit_price + "\nstop_price=" + stop_price
                + "\nstatus=" + status + "\nextended_hours=" + extended_hours + "\nlegs=" + legs + "\ntrail_percent="
                + trail_percent + "\ntrail_price=" + trail_price + "\nhwm=" + hwm + "\nsubtag=" + subtag + "\nsource="
                + source;
    }
}
