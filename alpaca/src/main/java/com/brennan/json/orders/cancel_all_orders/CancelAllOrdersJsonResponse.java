package com.brennan.json.orders.cancel_all_orders;

public class CancelAllOrdersJsonResponse {
    private String id;
    private String status;


    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "Cancel Order Information \nid=" + id + "\nstatus=" + status;
    }
}
