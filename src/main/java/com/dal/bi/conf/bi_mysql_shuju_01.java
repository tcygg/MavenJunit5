package com.dal.bi.conf;


//import com.mysql.jdbc.Driver;
//import java.sql.Driver;

import java.sql.*;

/**
 * @Auther: TcYgg
 * @Date: 2023/8/9 - 08 - 09 - 15:11
 * @Description: com.kelaite.bixm
 * @version: 1.0
 */
public class bi_mysql_shuju_01 {
    public static void main(String[] args) throws Exception {
        /*
         * 向Dept表增加一条数据
         *
         * */
        //1加载驱动 Driver
//        Driver driver =new com.mysql.cj.jdbc.Driver();

//        Driver driver =new com.mysql.jdbc.Driver();
        Driver driver =new com.mysql.jdbc.Driver();

        //2注册驱动 DriverManager
        DriverManager.registerDriver(driver);
        //3获得链接 Connection
        /*
         *
         * user:用户名
         * password:密码
         * url:统一资源定位符 定位我们要连接的数据库的
         *   1协议         jdbc:mysql
         *   2IP          127.0.0.1/localhost
         *   3端口号       3306
         *   4数据库名字   mydb
         *   5参数
         *   协议://ip:端口/资源路径?参数名=参数值&参数名=参数值&....
         *   jdbc:mysql://127.0.0.1:3306/mydb
         * */
        String url1="jdbc:mysql://gaea.test.mysql02.b2c.srv:13406/smart_bi_local_db?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&allowMultiQueries=true&useSSL=false";
        String password1="wJspBvp0Vtfto-yvoAh-y4xHe5KujBgI";
        String user1="smart_bi_local_db_wn";


        String user="root";
        String password="zxwdzhang";

        String url="jdbc:mysql://127.0.0.1:3306/zxwd?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai";
//        Connection connection =DriverManager.getConnection(url, user,password );
        Connection connection =DriverManager.getConnection(url1, user1,password1 );

        //4获得语句对象 Statment
        Statement statement = connection.createStatement();
        //5执行SQL语句,返回结果
        /*
         * insert delete update 操作都是调用statement.executeUpdate  10.225.165.110:65156
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

        ResultSet resultSet=null;

        String sql="SELECT * from ygg_gaojing_01;";
        resultSet = statement.executeQuery(sql);
//        System.out.println(resultSet);

        while(resultSet.next()){
            String Kch = resultSet.getString("alarm_id");
            String Kcm = resultSet.getString("oint");
            String Kcm1 = resultSet.getString(3);
            String Kcm2 = resultSet.getString(4);

            String Kcm3 = resultSet.getString(5);



            System.out.println(""+Kch+" "+Kcm+" "+Kcm1+" "+Kcm2+" "+Kcm3+" ");
        }

        //6释放资源
        /*
         * 注意顺序
         * 后获得的先关闭,先获得的后关闭
         * */
        statement.close();
        connection.close();
    }
}