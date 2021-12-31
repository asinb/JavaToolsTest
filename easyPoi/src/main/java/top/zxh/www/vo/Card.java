package top.zxh.www.vo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: 郑兴华
 * @CreateTime: 2021-12-31 14:08
 * @Description:
 */
@Data
@ExcelTarget("card")
public class Card  implements Serializable {

    @Excel(name = "身份证",width = 30)
    private  String no;

    @Excel(name = "地址",width = 50)
    private  String address;

    private  String other;
}
