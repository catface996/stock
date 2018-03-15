package com.hanma56.cloud.route.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hanma56.cloud.route.core.model.PointModel;
import com.hanma56.cloud.route.service.PointCalculateService;

/**
 * @author 张钟
 * @date 2018/3/12
 */
@Service
public class PointCalculateServiceImpl implements PointCalculateService {

    @Override
    public PointModel calculateCenterPoint(List<PointModel> pointModelList) {
        //分别记录最大和最小的经纬度
        BigDecimal maxLatitude = new BigDecimal(0);
        BigDecimal minLatitude = new BigDecimal(90);
        BigDecimal maxLongitude = new BigDecimal(0);
        BigDecimal minLongitude = new BigDecimal(180);

        for(PointModel pointModel:pointModelList){
            if(pointModel.getLatitude().compareTo(maxLatitude)>0){
                maxLatitude = pointModel.getLatitude();
            }
            if(pointModel.getLatitude().compareTo(minLatitude)<0){
                minLatitude = pointModel.getLatitude();
            }
            if(pointModel.getLongitude().compareTo(maxLongitude)>0){
                maxLongitude = pointModel.getLongitude();
            }
            if(pointModel.getLongitude().compareTo(minLongitude)<0){
                minLongitude = pointModel.getLongitude();
            }
        }

        PointModel pointModel = new PointModel();
        pointModel.setLatitude(maxLatitude.add(minLatitude).divide(new BigDecimal(2)));
        pointModel.setLongitude(maxLongitude.add(minLongitude).divide(new BigDecimal(2)));
        return pointModel;
    }
}
