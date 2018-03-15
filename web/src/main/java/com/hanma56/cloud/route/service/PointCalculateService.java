package com.hanma56.cloud.route.service;

import java.util.List;

import com.hanma56.cloud.route.core.model.PointModel;

/**
 * @author 张钟
 * @date 2018/3/12
 */
public interface PointCalculateService {

    /**
     * 计算坐标点列表的中心点
     * @param pointModelList
     * @return
     */
    PointModel calculateCenterPoint(List<PointModel> pointModelList);
}
