package com.hanma56.cloud.route.integration.stack;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.hanma56.cloud.route.integration.gd.GDClientCallBack;

/**
 * @author 张钟
 * @date 2018/3/14
 */
@FeignClient(name = "stockClient", url = "http://quotes.money.163.com", fallbackFactory = GDClientCallBack.class)
public interface StockClient {

    /**
     * 获取股票文件
     * @param code
     * @param end
     * @param fields
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, value = "/service/chddata.html")
    MultipartFile getStockFile(@RequestParam("code") String code, @RequestParam("end") String end,
                               @RequestParam("fields") String fields);
}
