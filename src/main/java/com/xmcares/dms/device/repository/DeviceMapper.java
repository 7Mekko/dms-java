package com.xmcares.dms.device.repository;

import com.xmcares.dms.device.domain.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * 设备DAO
 *
 * @author huangzh
 */
@Repository
public interface DeviceMapper extends JpaRepository<Device, Integer> {

}
