package com.dal.cm.stock;

import java.sql.*;

/**
 * @Auther: TcYgg
 * @Date: 2023/8/9 - 08 - 09 - 20:24
 * @Description: com.dal.cm.stock
 * @version: 1.0
 */
public class stock_01 {
    public String run() throws SQLException {
        String bb_a2 = null;
        try {


            //1加载驱动 Driver
            Driver driver = new com.mysql.jdbc.Driver();

            //2注册驱动 DriverManager
            DriverManager.registerDriver(driver);
            //3获得链接 Connection
            /*
             *
             * user:用户名
             * password:密码
             * 数据库：cm_wms_stock
             * 域名地址: gaea.test.mysql01.b2c.srv
             * 端口：13306
             * 读写账号：cm_wms_stock_wn
             * 密码：Cq2DuWiq7yGw5Hfdqui2t1ZSvJzW_e99
             * url:统一资源定位符 定位我们要连接的数据库的
             *   1协议         jdbc:mysql
             *   2IP          127.0.0.1/localhost  gaea.test.mysql01.b2c.srv
             *   3端口号       3306
             *   4数据库名字   mydb
             *   5参数
             *   协议://ip:端口/资源路径?参数名=参数值&参数名=参数值&....
             *   jdbc:mysql://127.0.0.1:3306/mydb
             * */
            String url = "jdbc:mysql://gaea.test.mysql01.b2c.srv:13306/cm_wms_stock?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&allowMultiQueries=true&useSSL=false";
            String password = "Cq2DuWiq7yGw5Hfdqui2t1ZSvJzW_e99";
            String user = "cm_wms_stock_wn";


            Connection connection = DriverManager.getConnection(url, user, password);

            //4获得语句对象 Statment
            Statement statement = connection.createStatement();
            //5执行SQL语句,返回结果
            /*
             * insert delete update 操作都是调用statement.executeUpdate
             * executeUpdate返回一个int值,代表数据库多少行数据发生了变化
             * */
//        String sql="insert into kcb values('093','教学1部');";
//        int rows = statement.executeUpdate(sql);
//        System.out.println("影响数据行数为:"+rows);

       /* ResultSet resultSet=null;

        String sql="select * from kcb;";
        resultSet = statement.executeQuery(sql);
        System.out.println(resultSet);

        while(resultSet.next()){
            String Kch = resultSet.getString("Kch");
            String Kcm = resultSet.getString("Kcm");

            System.out.println(""+Kch+" "+Kcm+" ");
        }*/

            ResultSet resultSet = null;

            String sql = "SELECT warehouse_id,seat_id from fs_stock_sn WHERE batch_no =\"LOT2023042300000064\";";
            resultSet = statement.executeQuery(sql);

//        while (resultSet.next()) {
//            String Kch = resultSet.getString("warehouse_id");
//            String Kcm = resultSet.getString("seat_id");
//
//            System.out.println("" + Kch + " " + Kcm + " ");
//        }

            //6释放资源
            /*
             * 注意顺序
             * 后获得的先关闭,先获得的后关闭
             * */

            String bb_a1 = resultSet.getString("seat_id");
//        System.out.println(bb_a1);


            statement.close();

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bb_a2;

    }
}

