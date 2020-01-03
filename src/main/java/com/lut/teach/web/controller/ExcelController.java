package com.lut.teach.web.controller;


import io.swagger.annotations.Api;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

@RestController
@Api(description = "下载")
public class ExcelController {
    /*
     poi
     */
    @GetMapping("/download")
    public void download(HttpServletResponse response) throws IOException {
        //1 创建工作簿
        XSSFWorkbook workbook = new XSSFWorkbook();
        //2 创建表
        XSSFSheet sheet=workbook.createSheet("课调表格");
        //3 创建第一行
        XSSFRow row = sheet.createRow(0);
        //4 创建第一个单元格
        XSSFCell cell = row.createCell(0);
        //5 设置单元格数据类型
        cell.setCellType(CellType.STRING);
        //6 设置单元格内容
        cell.setCellValue("今天");

        XSSFCell rcell1 = row.createCell(1);
        rcell1.setCellType(CellType.STRING);
        cell.setCellValue("bbjnj");

        //response.setHeader("content-Type", "application/vnd.ms-excel");
        //告诉返回的数据类型
        response.setContentType("application/vnd.ms-excel");
        // 下载文件的默认名称
        response.setHeader("Content-Disposition", "attachment;filename="+ URLEncoder.encode("课调"+".xlsx", "utf-8"));

        ServletOutputStream stream = response.getOutputStream();
        workbook.write(stream);
    }
}
