package top.zxh.www;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.Test;
import top.zxh.www.vo.Card;
import top.zxh.www.vo.Emp;
import top.zxh.www.vo.Order;
import top.zxh.www.vo.User;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author: 郑兴华
 * @CreateTime: 2021-12-31 11:50
 * @Description:
 */
public class TestPoi {

    //普通数据导出
    @Test
    public  void export() throws IOException {
        //获取list
        List<User> list = getuser();

        //导出
        Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams("用户信息列表", "用户"), User.class, list);
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/yons/Desktop/aa.xls");
        workbook.write(fileOutputStream);
        fileOutputStream.close();
        workbook.close();

    }


    @Test
    public void  importData(){

        ImportParams params = new ImportParams();
        params.setTitleRows(1);
        params.setHeadRows(1);
        List<Emp> emps = ExcelImportUtil.importExcel(new File("/Users/yons/Desktop/bb.xls"), Emp.class, params);

        for (int i = 0; i < emps.size(); i++) {
            System.out.println(emps.get(i));
        }

    }





    /**
     * 初始化数据
     * @return
     */
    public List<User> getuser(){
        List<User> list = new ArrayList<User>();
        for (int i = 0; i < 5; i++) {
            User user = new User();
            user.setId("http://www.zhengxinghua.top/prod-api/profile/avatar/2021/12/30/c5886fc4-3b45-482b-91e1-764507dc94dc.jpeg");
            user.setName("郑兴华");
            user.setAge(10+i);
            user.setBir(new Date());

            //身份信息
            Card card = new Card() ;
            card.setNo("511527199708124738");
            card.setAddress("四川成都温江");
            card.setOther("other");
            user.setCard(card);


            List<Order> orders = new ArrayList<Order>();
            orders.add(new Order("12","连衣裙"));
            orders.add(new Order("13","帽子"));
            orders.add(new Order("14","靴子"));
            user.setOrders(orders);



            list.add(user);
        }
        return  list;
    }







}
