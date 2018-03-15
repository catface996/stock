package com.hanma56.cloud.route.service.impl;

import java.util.Date;
import java.util.List;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.hanma56.cloud.route.convert.StockInfoConvert;
import com.hanma56.cloud.route.dao.StockInfoMapper;
import com.hanma56.cloud.route.integration.stack.StockService;
import com.hanma56.cloud.route.integration.stack.StockVO;
import com.hanma56.cloud.route.model.StockInfo;
import com.hanma56.cloud.route.service.StockInfoService;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 简一带你飞
 * @since 2018-03-14
 */
@Service
public class StockInfoServiceImpl extends ServiceImpl<StockInfoMapper, StockInfo>
                                  implements StockInfoService {

    @Autowired
    private StockService stockService;

    @Override
    public void saveStockInfo(String stockCode, Date endDate) {
        String dateTimeString = new DateTime().toString("yyyyMMdd");
        List<StockVO> stockVOList = stockService.getStockInfoList(stockCode, dateTimeString);
        if(stockVOList!=null && stockVOList.size()>0){
            List<StockInfo> stockInfoList = StockInfoConvert.convert(stockVOList);
            insertBatch(stockInfoList);
        }
    }
}
