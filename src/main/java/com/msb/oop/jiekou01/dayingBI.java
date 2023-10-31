package com.msb.oop.jiekou01;

/**
 * @Auther: TcYgg
 * @Date: 2023/8/30 - 08 - 30 - 20:27
 * @Description: com.msb.oop.jiekou01
 * @version: 1.0
 */
public class dayingBI {

    public static void main(String[] args) {


//查看字符的asic码
 /*       char ch = '大';
        byte byteAscii = (byte) ch;
        System.out.println(byteAscii);

// 方法二：将char直接转化为int，其值就是字符的ascii
        int byteAscii1 = (int) ch;
        System.out.println(byteAscii1);*/


        System.out.println("SELECT \"province\" as \"province\",cus_fun_497243_0 as \"SUM(`int_value_zs`)\",cus_fun_758997_0 as \"SUM(`zzt_float`)\" FROM( SELECT \"province\" as \"province\",SUM(CAST(\"int_value_zs\"::numeric AS BIGINT)) as cus_fun_497243_0,SUM(\"zzt_float\"::NUMERIC) as cus_fun_758997_0 FROM (SELECT \"id\", \"int_value_zs\", \"zzt_float\", \"production_line\", \"zzt_date\", \"bool_value\", \"int_value_fs\", \"float_value_percent\", \"float_value_neg\", \"dic_line\", \"factory\", \"yyyy\", \"yyyymm\", \"yyyy_mm\", \"yyyymmdd\", \"yyyy_mm_dd\", \"yyyy_mm_dd_hh\", \"y_m_d_h_mm\", \"y_m_d_h_m_ss\", \"cr_time_y_m_d\", \"yg_int\", \"province\", \"city\", \"area\" FROM ygg_matrix_02) as t_1c46f3f38dff7b1c WHERE 1=1 GROUP BY province ) od_171567 ORDER BY od_171567.province ASC LIMIT 50 "
        );
        System.out.println("SELECT\n      \"ygg_test_02\".province \"ygg_test_02__province_id\", \"ygg_test_02\".city \"ygg_test_02__city_id\", \"ygg_test_02\".area \"ygg_test_02__area_id\", \"ygg_test_02\".factory \"ygg_test_02__factory_id\", sum(\"ygg_test_02\".int_value_zs) \"ygg_test_02__int_value_zs_id_sum\", sum(\"ygg_test_02\".zzt_float) \"ygg_test_02__zzt_float_id_sum\"\n    FROM\n      ygg_matrix_02 AS \"ygg_test_02\"  GROUP BY 1, 2, 3, 4 ORDER BY 1 ASC LIMIT 1000"
        );
        System.out.println("SELECT\n      \"lxk_test6\".factory \"lxk_test6__factory\", min(\"lxk_test6\".num3) \"lxk_test6__min_num3\", sum(\"lxk_test6\".num1) \"lxk_test6__sum_num1\"\n    FROM\n      (select * from lxk_test1_0927 where 1 = 1) AS \"lxk_test6\"  GROUP BY 1 HAVING (min(\"lxk_test6\".num3) IN ('29120', '10620')) ORDER BY 2 DESC LIMIT 50"
        );


    }

}

