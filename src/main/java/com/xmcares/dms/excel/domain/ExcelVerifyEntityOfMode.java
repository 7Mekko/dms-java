package com.xmcares.dms.excel.domain;

import cn.afterturn.easypoi.handler.inter.IExcelModel;
import com.xmcares.dms.device.domain.Device;

import javax.persistence.*;

/**
 * excel导入验证结果
 *
 * @author huangzh
 */
@Entity
@DiscriminatorValue(value = "ET")
public class ExcelVerifyEntityOfMode extends Device implements IExcelModel {

    /** 错误信息 */
    @Transient
    private String errorMsg;

    @Override
    @Transient
    public String getErrorMsg() {
        return errorMsg;
    }

    @Override
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
