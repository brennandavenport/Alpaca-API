package com.brennan;

public class BitcoinTradePrice {
    private Trades trades;
    public class Trades {
        
        private EquityPair BTC_USD;
        
        public class EquityPair {
            private String t;
            private double p;
            private double s;
            private String tks;
            private int i;
            public String getT() {
                return t;
            }
            public void setT(String t) {
                this.t = t;
            }
            public double getP() {
                return p;
            }
            public void setP(double p) {
                this.p = p;
            }
            public double getS() {
                return s;
            }
            public void setS(double s) {
                this.s = s;
            }
            public String getTks() {
                return tks;
            }
            public void setTks(String tks) {
                this.tks = tks;
            }
            public int getI() {
                return i;
            }
            public void setI(int i) {
                this.i = i;
            }
        }

        public EquityPair getBTC_USD() {
            return BTC_USD;
        }

        public void setBTC_USD(EquityPair BTC_USD) {
            this.BTC_USD = BTC_USD;
        }
    }
    public Trades getTrades() {
        return trades;
    }
    public void setTrades(Trades trades) {
        this.trades = trades;
    } 
}
