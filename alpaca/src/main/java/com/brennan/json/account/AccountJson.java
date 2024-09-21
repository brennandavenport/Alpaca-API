package com.brennan.json.account;

//Object used for JSON

public class AccountJson {
    private String id;
    // private AdminConfigs admin_configurations; I dont know what this is
    private String user_configurations;
    private String account_number;
    private String status;
    private String crypto_status;
    private String currency;
    private String buying_power;
    private String regt_buying_power;
    private String daytrading_buying_power;
    private String options_buying_power;
    private String effective_buying_power;
    private String non_marginable_buying_power;
    private double bod_dtbp;
    private String cash;
    private String accrued_fees;
    private String pending_transfer_in;
    private String portfolio_value;
    private boolean pattern_day_trader;
    private boolean trading_blocked;
    private boolean transfers_blocked;
    private boolean account_blocked;
    private String created_at;
    private boolean trade_suspended_by_user;
    private String multiplier;
    private boolean shorting_enabled;
    private String equity;
    private String last_equity;
    private String long_market_value;
    private String short_market_value;
    private String position_market_value;
    private String initial_margin;
    private String maintenance_margin;
    private String last_maintenance_margin;
    private String sma;
    private int daytrade_count;
    private String balance_asof;
    private int crypto_tier;
    private int options_trading_level;

    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String isUser_configurations() {
        return user_configurations;
    }
    public void setUser_configurations(String user_configurations) {
        this.user_configurations = user_configurations;
    }
    public String getAccount_number() {
        return account_number;
    }
    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getCrypto_status() {
        return crypto_status;
    }
    public void setCrypto_status(String crypto_status) {
        this.crypto_status = crypto_status;
    }
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public String getBuying_power() {
        return buying_power;
    }
    public void setBuying_power(String buying_power) {
        this.buying_power = buying_power;
    }
    public String getRegt_buying_power() {
        return regt_buying_power;
    }
    public void setRegt_buying_power(String regt_buying_power) {
        this.regt_buying_power = regt_buying_power;
    }
    public String getDaytrading_buying_power() {
        return daytrading_buying_power;
    }
    public void setDaytrading_buying_power(String daytrading_buying_power) {
        this.daytrading_buying_power = daytrading_buying_power;
    }
    public String getOptions_buying_power() {
        return options_buying_power;
    }
    public void setOptions_buying_power(String options_buying_power) {
        this.options_buying_power = options_buying_power;
    }
    public String getEffective_buying_power() {
        return effective_buying_power;
    }
    public void setEffective_buying_power(String effective_buying_power) {
        this.effective_buying_power = effective_buying_power;
    }
    public String getNon_marginable_buying_power() {
        return non_marginable_buying_power;
    }
    public void setNon_marginable_buying_power(String non_marginable_buying_power) {
        this.non_marginable_buying_power = non_marginable_buying_power;
    }
    public double getBod_dtbp() {
        return bod_dtbp;
    }
    public void setBod_dtbp(double bod_dtbp) {
        this.bod_dtbp = bod_dtbp;
    }
    public String getCash() {
        return cash;
    }
    public void setCash(String cash) {
        this.cash = cash;
    }
    public String getAccrued_fees() {
        return accrued_fees;
    }
    public void setAccrued_fees(String accrued_fees) {
        this.accrued_fees = accrued_fees;
    }
    public String getPending_transfer_in() {
        return pending_transfer_in;
    }
    public void setPending_transfer_in(String pending_transfer_in) {
        this.pending_transfer_in = pending_transfer_in;
    }
    public String getPortfolio_value() {
        return portfolio_value;
    }
    public void setPortfolio_value(String portfolio_value) {
        this.portfolio_value = portfolio_value;
    }
    public boolean isPattern_day_trader() {
        return pattern_day_trader;
    }
    public void setPattern_day_trader(boolean pattern_day_trader) {
        this.pattern_day_trader = pattern_day_trader;
    }
    public boolean isTrading_blocked() {
        return trading_blocked;
    }
    public void setTrading_blocked(boolean trading_blocked) {
        this.trading_blocked = trading_blocked;
    }
    public boolean isTransfers_blocked() {
        return transfers_blocked;
    }
    public void setTransfers_blocked(boolean transfers_blocked) {
        this.transfers_blocked = transfers_blocked;
    }
    public boolean isAccount_blocked() {
        return account_blocked;
    }
    public void setAccount_blocked(boolean account_blocked) {
        this.account_blocked = account_blocked;
    }
    public String getCreated_at() {
        return created_at;
    }
    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
    public boolean isTrade_suspended_by_user() {
        return trade_suspended_by_user;
    }
    public void setTrade_suspended_by_user(boolean trade_suspended_by_user) {
        this.trade_suspended_by_user = trade_suspended_by_user;
    }
    public String getMultiplier() {
        return multiplier;
    }
    public void setMultiplier(String multiplier) {
        this.multiplier = multiplier;
    }
    public boolean isShorting_enabled() {
        return shorting_enabled;
    }
    public void setShorting_enabled(boolean shorting_enabled) {
        this.shorting_enabled = shorting_enabled;
    }
    public String getEquity() {
        return equity;
    }
    public void setEquity(String equity) {
        this.equity = equity;
    }
    public String getLast_equity() {
        return last_equity;
    }
    public void setLast_equity(String last_equity) {
        this.last_equity = last_equity;
    }
    public String getLong_market_value() {
        return long_market_value;
    }
    public void setLong_market_value(String long_market_value) {
        this.long_market_value = long_market_value;
    }
    public String getShort_market_value() {
        return short_market_value;
    }
    public void setShort_market_value(String short_market_value) {
        this.short_market_value = short_market_value;
    }
    public String getPosition_market_value() {
        return position_market_value;
    }
    public void setPosition_market_value(String position_market_value) {
        this.position_market_value = position_market_value;
    }
    public String getInitial_margin() {
        return initial_margin;
    }
    public void setInitial_margin(String initial_margin) {
        this.initial_margin = initial_margin;
    }
    public String getMaintenance_margin() {
        return maintenance_margin;
    }
    public void setMaintenance_margin(String maintenance_margin) {
        this.maintenance_margin = maintenance_margin;
    }
    public String getLast_maintenance_margin() {
        return last_maintenance_margin;
    }
    public void setLast_maintenance_margin(String last_maintenance_margin) {
        this.last_maintenance_margin = last_maintenance_margin;
    }
    public String getSma() {
        return sma;
    }
    public void setSma(String sma) {
        this.sma = sma;
    }
    public int getDaytrade_count() {
        return daytrade_count;
    }
    public void setDaytrade_count(int daytrade_count) {
        this.daytrade_count = daytrade_count;
    }
    public String getBalance_asof() {
        return balance_asof;
    }
    public void setBalance_asof(String balance_asof) {
        this.balance_asof = balance_asof;
    }
    public int getCrypto_tier() {
        return crypto_tier;
    }
    public void setCrypto_tier(int crypto_tier) {
        this.crypto_tier = crypto_tier;
    }
    public int getOptions_trading_level() {
        return options_trading_level;
    }
    public void setOptions_trading_level(int options_trading_level) {
        this.options_trading_level = options_trading_level;
    }


    @Override
    public String toString() {
        return "Account Information \nid=" + id + "\nuser_configurations=" + user_configurations + "\naccount_number="
                + account_number + "\nstatus=" + status + "\ncrypto_status=" + crypto_status + "\ncurrency=" + currency
                + "\nbuying_power=" + buying_power + "\nregt_buying_power=" + regt_buying_power
                + "\ndaytrading_buying_power=" + daytrading_buying_power + "\noptions_buying_power="
                + options_buying_power + "\neffective_buying_power=" + effective_buying_power
                + "\nnon_marginable_buying_power=" + non_marginable_buying_power + "\nbod_dtbp=" + bod_dtbp + "\ncash="
                + cash + "\naccrued_fees=" + accrued_fees + "\npending_transfer_in=" + pending_transfer_in
                + "\nportfolio_value=" + portfolio_value + "\npattern_day_trader=" + pattern_day_trader
                + "\ntrading_blocked=" + trading_blocked + "\ntransfers_blocked=" + transfers_blocked
                + "\naccount_blocked=" + account_blocked + "\ncreated_at=" + created_at + "\ntrade_suspended_by_user="
                + trade_suspended_by_user + "\nmultiplier=" + multiplier + "\nshorting_enabled=" + shorting_enabled
                + "\nequity=" + equity + "\nlast_equity=" + last_equity + "\nlong_market_value=" + long_market_value
                + "\nshort_market_value=" + short_market_value + "\nposition_market_value=" + position_market_value
                + "\ninitial_margin=" + initial_margin + "\nmaintenance_margin=" + maintenance_margin
                + "\nlast_maintenance_margin=" + last_maintenance_margin + "\nsma=" + sma + "\ndaytrade_count="
                + daytrade_count + "\nbalance_asof=" + balance_asof + "\ncrypto_tier=" + crypto_tier
                + "\noptions_trading_level=" + options_trading_level;
    }

    
}
