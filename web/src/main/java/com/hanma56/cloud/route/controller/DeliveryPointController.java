package com.hanma56.cloud.route.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.hanma56.cloud.route.convert.PointConvert;
import com.hanma56.cloud.route.core.model.PointModel;
import com.hanma56.cloud.route.integration.gd.GDService;
import com.hanma56.cloud.route.model.DeliveryPoint;
import com.hanma56.cloud.route.service.DeliveryPointService;
import com.hanma56.cloud.route.service.PointCalculateService;

/**
 * <p>
 * 送货点 前端控制器
 * </p>
 *
 * @author 简一带你飞
 * @since 2018-03-12
 */
@Controller
@RequestMapping("/deliveryPoint")
public class DeliveryPointController {

    @Autowired
    private DeliveryPointService  deliveryPointService;

    @Autowired
    private PointCalculateService pointCalculateService;

    @Autowired
    private GDService             gdService;

    @RequestMapping(value = { "/gdMap.htm" })
    public String gdMap(Long lineId, Model model) {

        List<DeliveryPoint> markPoints = deliveryPointService.queryByUserId(lineId);

        List<String[]> polyLine = gdService.getPolyLine(lineId);
        model.addAttribute("polyLine", JSON.toJSONString(polyLine));

        PointModel pointModel = pointCalculateService
            .calculateCenterPoint(PointConvert.convert(markPoints));
        model.addAttribute("center", JSON.toJSONString(PointConvert.convert(pointModel)));

        DeliveryPoint start = markPoints.get(0);
        DeliveryPoint end = markPoints.get(markPoints.size() - 1);
        model.addAttribute("start", start);
        model.addAttribute("end", end);

        markPoints.remove(0);
        markPoints.remove(markPoints.size() - 1);
        model.addAttribute("markPoints", markPoints);

        return "line/gdMap";

    }

    @RequestMapping(value = "/demo.htm")
    public String demo() {
        return "line/demo";
    }

}
