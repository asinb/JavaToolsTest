package top.zxh.www.vo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author: 郑兴华
 * @CreateTime: 2021-12-31 14:30
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ExcelTarget("emp")
public class Emp {

    @Excel(name = "编号")
    private  String  id ;

    @Excel(name = "姓名")
    private  String  name ;

    @Excel(name = "入职时间",format = "yyyy-MM-dd HH:mm:ss")
    private  Date data ;

    @Excel(name = "其它")
    private  String  other ;
}
