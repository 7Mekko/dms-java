package com.xmcares.dms.device.domain;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

/**
 * 设备实体类
 *
 * @author huangzh
 */
@Data
@Entity
@Table(name = "dms_device")
public class Device implements Serializable {

    @Transient
    private static final long serialVersionUID = 4444017239100620999L;

    /** id */
    @Id
    @Column(name = "id", nullable = false)
    private String id = UUID.randomUUID().toString();

    /** 区域 */
    @Column(name = "area")
    @Excel(name = "区域", orderNum = "1", isImportField = "true_st")
    @NotNull(message = "区域不能为空")
    private String area;

    /** 位置 */
    @Column(name = "position")
    @Excel(name = "位置", orderNum = "2", isImportField = "true_st")
    private String position;

    /** 备注 */
    @Column(name = "remark")
    @Excel(name = "备注", orderNum = "3", isImportField = "true_st")
    private String remark;

    /** 设备名称 */
    @Column(name = "device_name")
    @Excel(name = "设备名称", orderNum = "4", isImportField = "true_st")
    @NotNull(message = "设备名称不能为空")
    private String deviceName;

    /** 设备型号 */
    @Column(name = "device_model")
    @Excel(name = "设备型号", orderNum = "5", isImportField = "true_st")
    @NotNull(message = "设备型号不能为空")
    private String deviceModel;

    /** 资产编号 */
    @Column(name = "device_number")
    @Excel(name = "资产编号", orderNum = "6", isImportField = "true_st")
    private String deviceNumber;

    /** 设备序号 */
    @Column(name = "device_serial")
    @Excel(name = "设备序号", orderNum = "7", isImportField = "true_st")
    @NotNull(message = "设备序号不能为空")
    private String deviceSerial;

    /** 购入日期 */
    @Column(name = "purchase_date")
    @Excel(name = "购入日期", orderNum = "8", format = "yyyy/MM/dd", isImportField = "true_st")
    @NotNull(message = "购入日期不能为空")
    private Date purchaseDate;

    /** 启用日期 */
    @Column(name = "enable_date")
    @Excel(name = "启用日期", orderNum = "9", format = "yyyy/MM/dd", isImportField = "true_st")
    @NotNull(message = "启用日期不能为空")
    private Date enableDate;

    /** 报废日期 */
    @Column(name = "scrap_date")
    @Excel(name = "报废日期", orderNum = "10", format = "yyyy/MM/dd")
    private Date scrapDate;

    /** 设备状态(0在用,1备用,2维修,3报废) */
    @Column(name = "state")
    private Byte state;

    /** 设备配置 */
    @Column(name = "config")
    @Excel(name = "配置", orderNum = "11", isImportField = "true_st")
    private String config;

}
