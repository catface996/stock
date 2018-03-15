package com.hanma56.cloud.route.model;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 
 * </p>
 *
 * @author 简一带你飞
 * @since 2018-03-14
 */
@TableName("stockInfo")
public class StockInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableField("id")
    private Long              id;
    @TableField("tradeDate")
    private Date              tradeDate;
    @TableField("stockCode")
    private String            stockCode;
    @TableField("stockName")
    private String            stockName;
    @TableField("endPrice")
    private String            endPrice;
    @TableField("highPrice")
    private String            highPrice;
    @TableField("lowPrice")
    private String            lowPrice;
    @TableField("beginPrice")
    private String            beginPrice;
    @TableField("lastEndPrice")
    private String            lastEndPrice;
    @TableField("upDownAmount")
    private String            upDownAmount;
    @TableField("upDownRange")
    private String            upDownRange;
    @TableField("changeRate")
    private String            changeRate;
    @TableField("dealCount")
    private String              dealCount;
    @TableField("dealAmount")
    private String              dealAmount;
    @TableField("totalValue")
    private String              totalValue;
    @TableField("exchangeTotalValue")
    private String              exchangeTotalValue;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "StockInfo{" + ", tradeDate=" + tradeDate + ", stockCode=" + stockCode
               + ", stockName=" + stockName + ", endPrice=" + endPrice + ", highPrice=" + highPrice
               + ", lowPrice=" + lowPrice + ", beginPrice=" + beginPrice + ", lastEndPrice="
               + lastEndPrice + ", upDownAmount=" + upDownAmount + ", upDownRange=" + upDownRange
               + ", changeRate=" + changeRate + ", dealCount=" + dealCount + ", dealAmount="
               + dealAmount + ", totalValue=" + totalValue + ", exchangeTotalValue="
               + exchangeTotalValue + "}";
    }
}
