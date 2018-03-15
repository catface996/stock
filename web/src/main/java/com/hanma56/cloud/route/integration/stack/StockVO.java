package com.hanma56.cloud.route.integration.stack;

import java.util.Date;

import org.joda.time.DateTime;

/**
 * @author 张钟
 * @date 2018/3/14
 */
public class StockVO {

    /** 交易日 **/
    private Date   tradeDate;

    /** 股票代码 **/
    private String stockCode;

    /** 股票名称 **/
    private String stockName;

    /** 收盘价 **/
    private String endPrice;

    /** 最高价 **/
    private String highPrice;

    /** 最低价 **/
    private String lowPrice;

    /** 开盘价 **/
    private String beginPrice;

    /** 前收盘 **/
    private String lastEndPrice;

    /** 涨跌额 **/
    private String upDownAmount;

    /** 涨跌幅 **/
    private String upDownRange;

    /** 换手率 **/
    private String changeRate;

    /** 成交量 **/
    private String dealCount;

    /** 成交金额 **/
    private String dealAmount;

    /** 总市值 **/
    private String totalValue;

    /** 流通市值 **/
    private String exchangeTotalValue;

    public StockVO() {

    }

    public StockVO(String[] data) {
        this.tradeDate = DateTime.parse(data[0]).toDate();
        this.stockCode = data[1].replace("'","");
        this.stockName = data[2];
        this.endPrice = data[3];
        this.highPrice = data[4];
        this.lowPrice = data[5];
        this.beginPrice = data[6];
        this.lastEndPrice = data[7];
        this.upDownAmount = data[8];
        this.upDownRange = data[9];
        this.changeRate = data[10];
        this.dealCount = data[11];
        this.dealAmount = data[12];
        this.totalValue = data[13];
        this.exchangeTotalValue = data[14];
    }

    public Date getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(Date tradeDate) {
        this.tradeDate = tradeDate;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getEndPrice() {
        return endPrice;
    }

    public void setEndPrice(String endPrice) {
        this.endPrice = endPrice;
    }

    public String getHighPrice() {
        return highPrice;
    }

    public void setHighPrice(String highPrice) {
        this.highPrice = highPrice;
    }

    public String getLowPrice() {
        return lowPrice;
    }

    public void setLowPrice(String lowPrice) {
        this.lowPrice = lowPrice;
    }

    public String getBeginPrice() {
        return beginPrice;
    }

    public void setBeginPrice(String beginPrice) {
        this.beginPrice = beginPrice;
    }

    public String getLastEndPrice() {
        return lastEndPrice;
    }

    public void setLastEndPrice(String lastEndPrice) {
        this.lastEndPrice = lastEndPrice;
    }

    public String getUpDownAmount() {
        return upDownAmount;
    }

    public void setUpDownAmount(String upDownAmount) {
        this.upDownAmount = upDownAmount;
    }

    public String getUpDownRange() {
        return upDownRange;
    }

    public void setUpDownRange(String upDownRange) {
        this.upDownRange = upDownRange;
    }

    public String getChangeRate() {
        return changeRate;
    }

    public void setChangeRate(String changeRate) {
        this.changeRate = changeRate;
    }

    public String getDealCount() {
        return dealCount;
    }

    public void setDealCount(String dealCount) {
        this.dealCount = dealCount;
    }

    public String getDealAmount() {
        return dealAmount;
    }

    public void setDealAmount(String dealAmount) {
        this.dealAmount = dealAmount;
    }

    public String getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(String totalValue) {
        this.totalValue = totalValue;
    }

    public String getExchangeTotalValue() {
        return exchangeTotalValue;
    }

    public void setExchangeTotalValue(String exchangeTotalValue) {
        this.exchangeTotalValue = exchangeTotalValue;
    }
}
