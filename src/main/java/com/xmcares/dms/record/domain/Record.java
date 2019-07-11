package com.xmcares.dms.record.domain;

import com.xmcares.dms.device.domain.Device;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

/**
 * 记录实体类
 *
 * @author huangzh
 */
@Data
@Entity
@Table(name = "dms_record")
public class Record {

    /** id */
    @Id
    @Column(name = "id", nullable = false)
    private String id = UUID.randomUUID().toString();

    /** 关联的设备id */
    @Column(name = "device_id")
    private String deviceId;

    /** 关联的设备实体 */
    @ManyToOne
    @JoinColumn(name = "device_id", insertable = false, updatable = false)
    private Device device;

    /** 新增日期 */
    @Column(name = "add_date")
    private Date addDate;

    /** 新增模式 */
    @Column(name = "mode")
    private String mode;

    /** 更换日期 */
    @Column(name = "swap_date")
    private Date swapDate;

    /** 更换目标设备id */
    @Column(name = "t_target_id")
    private String targetId;

    @ManyToOne
    @JoinColumn(name = "t_target_id", insertable = false, updatable = false)
    private Device target;

    /** 送修日期 */
    @Column(name = "send_date")
    private Date sendDate;

    /** 修复日期 */
    @Column(name = "repair_date")
    private Date repairDate;

    /** 故障描述 */
    @Column(name = "description")
    private String description;

    /** 送修更换配件 */
    @Column(name = "fitting")
    private String fitting;

    /** 报废日期 */
    @Column(name = "scrap_date")
    private Date scrapDate;

    /** 记录类型(0新增,1更换,2维修,3报废) */
    @Column(name = "record_type")
    private Byte recordType;

    /** 备注 */
    @Column(name = "remark")
    private String remark;
}
