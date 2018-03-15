package com.hanma56.cloud.route.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hanma56.cloud.route.service.StockInfoService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 简一带你飞
 * @since 2018-03-14
 */
@Controller
@RequestMapping("/stockInfo")
public class StockInfoController {

    @Autowired
    private StockInfoService stockInfoService;

    @ResponseBody
    @RequestMapping(value = "/start")
    public String startSyn() {

        new Thread(() -> {
            int baseCode = 600000;
            Date currentDate = new Date();
            for (int i = 0; i < 15000; i++) {
                stockInfoService.saveStockInfo("0" + (baseCode + i), currentDate);
            }
        }).start();

        return "success";
    }

}
