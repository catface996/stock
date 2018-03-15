package com.hanma56.cloud.route.service;

import com.hanma56.cloud.route.model.StockInfo;
import com.baomidou.mybatisplus.service.IService;

import java.util.Date;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 简一带你飞
 * @since 2018-03-14
 */
public interface StockInfoService extends IService<StockInfo> {

    /**
     * 保存股票数据到数据库
     * @param stockCode
     * @param endDate
     */
    void saveStockInfo(String stockCode, Date endDate);

}
