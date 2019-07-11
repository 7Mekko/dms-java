package com.xmcares.dms.excel.controller;

import com.xmcares.dms.excel.service.ExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Excel Controller
 *
 * @author huangzh
 */
@RestController
@RequestMapping("/excel")
public class ExcelController {

    private ExcelService excelService;

    @Autowired
    public ExcelController(ExcelService excelService) {
        this.excelService = excelService;
    }

    /**
     * 测试导入
     */
    @PostMapping("/testImport")
    public void batchImport() {
        excelService.testImport();
    }
}
