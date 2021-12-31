package top.zxh.www.vo;


import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelCollection;
import cn.afterturn.easypoi.excel.annotation.ExcelEntity;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @Author: 郑兴华
 * @CreateTime: 2021-12-31 11:55
 * @Description:
 */
@Data
@ExcelTarget("user")
public class User implements Serializable {

    @Excel(name = "图片", type = 2)
    private String id;

    @Excel(name = "姓名", mergeVertical = true)
    private String name;

    @Excel(name = "年龄", suffix = "岁")
    private Integer age;

    @Excel(name = "生日", width = 30, format = "yyyy-MM-dd HH:mm:ss")
    private Date bir;

    @ExcelEntity
    private Card card;


    @ExcelCollection(name = "订单列表")
    private List<Order> orders;

}
