package com.xmcares.dms.device.service.impl;

import com.xmcares.dms.device.domain.Device;
import com.xmcares.dms.device.repository.DeviceMapper;
import com.xmcares.dms.device.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 设备service实现类
 *
 * @author huangzh
 */
@Service
public class DeviceServiceImpl implements DeviceService {

    private DeviceMapper deviceMapper;

    @Autowired
    public DeviceServiceImpl(DeviceMapper deviceMapper) {
        this.deviceMapper = deviceMapper;
    }

    @Override
    public List<Device> listAll() {
        return deviceMapper.findAll();
    }
}
