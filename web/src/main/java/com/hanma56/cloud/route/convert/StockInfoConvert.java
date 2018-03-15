package com.hanma56.cloud.route.convert;

import com.hanma56.cloud.route.integration.stack.StockVO;
import com.hanma56.cloud.route.model.StockInfo;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 张钟
 * @date 2018/3/14
 */
public class StockInfoConvert {

    public static StockInfo convert(StockVO stockVO){
        StockInfo stockInfo = new StockInfo();
        BeanUtils.copyProperties(stockVO,stockInfo);
        return stockInfo;
    }

    public static List<StockInfo> convert(List<StockVO> stockVOList){
        List<StockInfo> stockInfoList = new ArrayList<>();

        if(stockVOList!=null){
            for(StockVO stockVO: stockVOList){
                StockInfo stockInfo = new StockInfo();
                BeanUtils.copyProperties(stockVO,stockInfo);
                stockInfoList.add(stockInfo);
            }
        }

        return stockInfoList;
    }
}
