package com.hanma56.cloud.route.integration.stack;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author 张钟
 * @date 2018/3/14
 */
@Service
public class StockService {

    private Logger      logger = Logger.getLogger(StockService.class);

    private String      fields = "TCLOSE;HIGH;LOW;TOPEN;LCLOSE;CHG;PCHG;TURNOVER;VOTURNOVER;VATURNOVER;TCAP;MCAP";

    @Autowired
    private StockClient stockClient;

    public List<StockVO> getStockInfoList(String stockCode, String end) {
        MultipartFile file = stockClient.getStockFile(stockCode, end, fields);

        List<StockVO> stockVOS = new ArrayList<>();
        try {
            byte[] data = file.getBytes();
            String text = new String(data, "GBK");
            String[] rows = text.split("\r\n");
            for (int i = 1; i < rows.length; i++) {
                stockVOS.add(new StockVO(rows[i].split(",")));
            }
        } catch (Exception e) {
            logger.error("解析股票文件异常", e);
        }
        return stockVOS;

    }

}
