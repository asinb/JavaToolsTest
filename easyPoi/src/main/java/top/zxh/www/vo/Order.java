package top.zxh.www.vo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: 郑兴华
 * @CreateTime: 2021-12-31 14:14
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ExcelTarget("orders")
public class Order  implements Serializable {

    @Excel(name = "订单编号")
    private  String orderNumber;

    @Excel(name = "订单名称")
    private  String orderName;


}
