package com.brennan;

public class LatestTradePrice {
    private String symbol;
    private TradePrice trade;

    public class TradePrice {
        private String t;
        private String x;
        private double p;
        private int s;
        private int i;
        private String z;

        public String getT() {
            return t;
        }
        public void setT(String t) {
            this.t = t;
        }
        public String getX() {
            return x;
        }
        public void setX(String x) {
            this.x = x;
        }
        public double getP() {
            return p;
        }
        public void setP(double p) {
            this.p = p;
        }
        public int getS() {
            return s;
        }
        public void setS(int s) {
            this.s = s;
        }
        public int getI() {
            return i;
        }
        public void setI(int i) {
            this.i = i;
        }
        public String getZ() {
            return z;
        }
        public void setZ(String z) {
            this.z = z;
        }
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public TradePrice getTrade() {
        return trade;
    }

    public void setTrade(TradePrice trade) {
        this.trade = trade;
    }
}
