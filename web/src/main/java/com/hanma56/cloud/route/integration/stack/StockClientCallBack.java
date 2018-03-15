package com.hanma56.cloud.route.integration.stack;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import feign.hystrix.FallbackFactory;

/**
 * @author 张钟
 * @date 2018/3/14
 */
@Component
public class StockClientCallBack implements FallbackFactory<StockClient> {

    private Logger logger = Logger.getLogger(StockClientCallBack.class);

    @Override
    public StockClient create(Throwable cause) {
        return new StockClient() {
            @Override
            public MultipartFile getStockFile(String code, String end, String fields) {
                logger.error("调用高德地图线路规划异常", cause);
                return null;
            }
        };
    }
}
