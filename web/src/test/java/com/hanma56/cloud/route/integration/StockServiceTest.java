package com.hanma56.cloud.route.integration;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hanma56.cloud.route.integration.stack.StockService;
import com.hanma56.cloud.route.integration.stack.StockVO;
import com.hanma56.cloud.route.service.StockInfoService;

/**
 * @author 张钟
 * @date 2018/3/14
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StockServiceTest {

    @Autowired
    private StockService     stockService;

    @Autowired
    private StockInfoService stockInfoService;

    @Test
    public void test() {
        stockInfoService.saveStockInfo("0603022",new Date());
    }
}
