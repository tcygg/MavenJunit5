package com.msb.oop.jiekou01;

import org.yaml.snakeyaml.Yaml;

/**
 * @Auther: TcYgg
 * @Date: 2023/8/30 - 08 - 30 - 20:27
 * @Description: com.msb.oop.jiekou01
 * @version: 1.0
 */
public class daying01 {

    public static void main(String[] args) {
        System.out.println("SELECT `datetime_yg` as \"datetime_yg\",`create_time` as \"create_time\",`year_yg` as \"year_yg\",`a_bool` as \"a_bool\",`ceshi_time` as \"ceshi_time\",`varchar_yg` as \"varchar_yg\",`ovar` as \"ovar\",`time_yg` as \"time_yg\",`ygg_name` as \"ygg_name\",`timestamp_yg` as \"timestamp_yg\",`update_time` as \"update_time\",`obool` as \"obool\",`ovar测试2` as \"ovar测试2\",`date_yg` as \"date_yg\",`bool_yg` as \"bool_yg\",`char_yg` as \"char_yg\",`cus_fun_285430_0` as \"odouble\",`cus_fun_407161_0` as \"ygg_height\",`cus_fun_361756_0` as \"double_yg\",`cus_fun_915314_0` as \"int_yg\",`cus_fun_968944_0` as \"ofield\",`cus_fun_225817_0` as \"ygg_age\",`cus_fun_403171_0` as \"oint\",`cus_fun_327905_0` as \"alarm_id\" FROM( SELECT `datetime_yg` as \"datetime_yg\",`create_time` as \"create_time\",`year_yg` as \"year_yg\",`a_bool` as \"a_bool\",`ceshi_time` as \"ceshi_time\",`varchar_yg` as \"varchar_yg\",`ovar` as \"ovar\",`time_yg` as \"time_yg\",`ygg_name` as \"ygg_name\",`timestamp_yg` as \"timestamp_yg\",`update_time` as \"update_time\",`obool` as \"obool\",`ovar测试2` as \"ovar测试2\",`date_yg` as \"date_yg\",`bool_yg` as \"bool_yg\",`char_yg` as \"char_yg\",CAST(`odouble` AS DECIMAL(18,8)) as cus_fun_285430_0,CAST(`ygg_height` AS DECIMAL(18,8)) as cus_fun_407161_0,CAST(`double_yg` AS DECIMAL(18,8)) as cus_fun_361756_0,CAST(`int_yg` AS SIGNED) as cus_fun_915314_0,CAST(`ofield` AS SIGNED) as cus_fun_968944_0,CAST(`ygg_age` AS SIGNED) as cus_fun_225817_0,CAST(`oint` AS SIGNED) as cus_fun_403171_0,CAST(`alarm_id` AS SIGNED) as cus_fun_327905_0 , case ygg_name when '周杰伦' then 0 when '张三' then 1 when '吴彦祖' then 2 when '张无极' then 3 when '10' then 4 when '33' then 5 else 2147483647 end as cus_seq_186026_0 FROM (select * from ygg_gaojing_01) as SQL_MODEL WHERE 1=1 ) od759793 ORDER BY od759793.cus_seq_186026_0 LIMIT 1000 ");


        System.out.println("");

        Yaml yaml = new Yaml();
    }

}
