package com.xmcares.dms.device.service;

import com.xmcares.dms.device.domain.Device;

import java.util.List;

/**
 * 设备service
 *
 * @author huangzh
 */
public interface DeviceService {

    /**
     * 查询全部设备
     */
    List<Device> listAll();
}
