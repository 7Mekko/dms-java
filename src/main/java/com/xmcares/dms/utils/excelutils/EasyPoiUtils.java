package com.xmcares.dms.utils.excelutils;


import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import cn.afterturn.easypoi.excel.entity.result.ExcelImportResult;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;
import java.util.NoSuchElementException;

/**
 * EasyPoi工具类
 *
 * @author huangzh
 */
public class EasyPoiUtils {

    /**
     * 前端导入excel
     *
     * @param file 前端上传的excel
     * @param titleRows 标题行
     * @param headerRows 表头行
     * @param pojoClass 实体类
     * @param <T> 类型
     * @return 导入后的list
     */
    public static <T> ExcelImportResult<T> importExcel(MultipartFile file, Integer titleRows, Integer headerRows, Class<T> pojoClass) {
        if (file == null) {
            return null;
        }
        ImportParams params = new ImportParams();
        // 设置需要校验和留底以及留底位置
        params.setNeedVerfiy(true);
        params.setNeedSave(true);
        params.setSaveUrl("D:\\files");
        // 设置标题行和表头行
        params.setTitleRows(titleRows);
        params.setHeadRows(headerRows);
        ExcelImportResult<T> result = null;
        try {
            // list = ExcelImportUtil.importExcel(file.getInputStream(), pojoClass, params);
            result = ExcelImportUtil.importExcelMore(file.getInputStream(),
                    pojoClass, params);
            FileOutputStream fos = new FileOutputStream("D:/files/verifyTest.xlsx");
            result.getFailWorkbook().write(fos);
            fos.close();
        } catch (NoSuchElementException e) {
            throw new RuntimeException("excel文件不能为空");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
        return result;
    }
}
