package com.xmcares.dms.excel.domain;

import lombok.Data;
import org.apache.poi.ss.usermodel.Workbook;

import java.util.List;

/**
 * 导入校验结果
 *
 * @author huangzh
 */
@Data
public class ExcelImportResult<T> {
    /**
     * 结果集
     */
    private List<T> list;

    /**
     * 是否存在校验失败
     */
    private boolean verfiyFail;

    /**
     * 数据源
     */
    private Workbook workbook;
}
