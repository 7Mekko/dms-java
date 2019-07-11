package com.xmcares.dms.excel.service.impl;

import cn.afterturn.easypoi.excel.entity.result.ExcelImportResult;
import com.xmcares.dms.device.domain.Device;
import com.xmcares.dms.device.repository.DeviceMapper;
import com.xmcares.dms.device.service.DeviceService;
import com.xmcares.dms.excel.domain.ExcelVerifyEntityOfMode;
import com.xmcares.dms.excel.service.ExcelService;
import com.xmcares.dms.utils.excelutils.EasyPoiUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * excel service实现类
 *
 * @author huangzh
 */
@Service
public class ExcelServiceImpl implements ExcelService {

    private DeviceMapper deviceMapper;

    public ExcelServiceImpl(DeviceMapper deviceMapper) {
        this.deviceMapper = deviceMapper;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void testImport() {
        ExcelImportResult<ExcelVerifyEntityOfMode> result = EasyPoiUtils.importExcel("C:\\Users\\hmekk\\Desktop\\设备管理需求初定以及相关资料\\设备管理系统批量录入模板.xlsx",
                0, 2, ExcelVerifyEntityOfMode.class);
        System.out.println(result.getList().size());
        for (Device device : result.getList()) {
            deviceMapper.save(device);
        }
        System.out.println(deviceMapper.findAll());
    }
}
