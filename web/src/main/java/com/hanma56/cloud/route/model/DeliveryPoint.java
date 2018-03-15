package com.hanma56.cloud.route.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * <p>
 * 送货点
 * </p>
 *
 * @author 简一带你飞
 * @since 2018-03-12
 */
@TableName("deliveryPoint")
public class DeliveryPoint implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 送货点ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long              id;
    /**
     * 用户ID
     */
    @TableField("userId")
    private Long              userId;

    /**
     * 用户ID
     */
    @TableField("taskId")
    private Long              taskId;
    /**
     * 送货地点名称
     */
    @TableField("addressName")
    private String            addressName;
    /**
     * 经度
     */
    private BigDecimal        longitude;
    /**
     * 纬度
     */
    private BigDecimal        latitude;
    /**
     * 地点类型:出发地,目的地
     */
    private String            pointType;
    /**
     * 修改时间
     */
    private Date              updated;
    /**
     * 创建时间
     */
    private Date              created;

    /**
     * 到达时间
     */
    private Date              arriveTime;

    /**
     * 发车时间
     */
    private Date              dispatchTime;
    /**
     * 备注
     */
    private String            memo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public String getPointType() {
        return pointType;
    }

    public void setPointType(String pointType) {
        this.pointType = pointType;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Date getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(Date arriveTime) {
        this.arriveTime = arriveTime;
    }

    public Date getDispatchTime() {
        return dispatchTime;
    }

    public void setDispatchTime(Date dispatchTime) {
        this.dispatchTime = dispatchTime;
    }
}
