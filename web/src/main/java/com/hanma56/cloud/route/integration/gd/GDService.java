package com.hanma56.cloud.route.integration.gd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.hanma56.cloud.route.integration.gd.vo.GDDriveResult;
import com.hanma56.cloud.route.integration.gd.vo.Paths;
import com.hanma56.cloud.route.integration.gd.vo.Route;
import com.hanma56.cloud.route.integration.gd.vo.Steps;
import com.hanma56.cloud.route.model.DeliveryPoint;
import com.hanma56.cloud.route.service.DeliveryPointService;

/**
 * Created by 张钟 on 2017/8/16.
 */

@Service
public class GDService {

    @Autowired
    private AsyncGdService       asyncGdService;

    @Autowired
    private DeliveryPointService deliveryPointService;

    public List<GDPointVO> getPoints(Long taskId) {

        List<DeliveryPoint> pointList = deliveryPointService.queryByUserId(taskId);
        List<Future<JSONObject>> futureList = new ArrayList<>();
        List<JSONObject> jsonArrayList = new ArrayList<>();
        for (int i = 1; i < pointList.size(); i++) {
            Future<JSONObject> future = asyncGdService.getPoints(pointList.get(i - 1),
                pointList.get(i));
            futureList.add(future);
        }
        for (Future<JSONObject> future : futureList) {
            try {
                jsonArrayList.add(future.get());
            } catch (Exception e) {
                continue;
            }
        }
        List<GDPointVO> gdPointVOList = new ArrayList<>();
        for (JSONObject jsonObject : jsonArrayList) {
            GDDriveResult gdDriveResult = JSONObject.toJavaObject(jsonObject, GDDriveResult.class);
            if ("1".equals(gdDriveResult.getStatus())) {
                Route route = gdDriveResult.getRoute();
                Paths paths = route.getPaths().get(0);
                for (Steps steps : paths.getSteps()) {
                    String polyline = steps.getPolyline();
                    List<String> tmpPointList = Arrays.asList(polyline.split(";"));
                    for (String pointStr : tmpPointList) {
                        String[] lng_lat = pointStr.split(",");
                        GDPointVO gdPointVO = new GDPointVO();
                        gdPointVO.setLongitude(lng_lat[0]);
                        gdPointVO.setLatitude(lng_lat[1]);
                        gdPointVOList.add(gdPointVO);
                    }
                }
            }
        }
        return gdPointVOList;
    }

    public List<String[]> getPolyLine(Long taskId) {
        List<DeliveryPoint> pointList = deliveryPointService.queryByUserId(taskId);
        List<Future<JSONObject>> futureList = new ArrayList<>();
        List<JSONObject> jsonArrayList = new ArrayList<>();
        for (int i = 1; i < pointList.size(); i++) {
            Future<JSONObject> future = asyncGdService.getPoints(pointList.get(i - 1),
                pointList.get(i));
            futureList.add(future);
        }
        for (Future<JSONObject> future : futureList) {
            try {
                jsonArrayList.add(future.get());
            } catch (Exception e) {
                continue;
            }
        }
        List<String[]> polyLine = new ArrayList<>();
        for (JSONObject jsonObject : jsonArrayList) {
            GDDriveResult gdDriveResult = JSONObject.toJavaObject(jsonObject, GDDriveResult.class);
            if ("1".equals(gdDriveResult.getStatus())) {
                Route route = gdDriveResult.getRoute();
                Paths paths = route.getPaths().get(0);
                for (Steps steps : paths.getSteps()) {
                    String polyline = steps.getPolyline();
                    List<String> tmpPointList = Arrays.asList(polyline.split(";"));
                    for (String tempPoint : tmpPointList) {
                        polyLine.add(tempPoint.split(","));
                    }
                }
            }
        }
        return polyLine;
    }

}
