package com.ceshiren.jiekou;

/**
 * @Auther: zhaoss
 * @Date: 2023/1/28 - 01 - 28 - 16:04
 * @Description: com.ceshiren.jiekou
 * @version: 1.0
 */

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class TestRestAssuredPost01 {
    @Test
    void testPost(){

        HashMap<String,String> jsonobj=new HashMap<String, String>();
        jsonobj.put("username","Hogwarts");
        jsonobj.put("username1","Hogwarts1");
        given()
                // 可以设置测试预设
                .contentType("application/json")
                .body(jsonobj)
                .log().body()
                .log().headers()
                .when()
                // 发起 POST 请求
                .post("https://httpbin.ceshiren.com/post")
                .then()
                // 解析结果
                .log().body()  // 打印完整响应信息
                .statusCode(200)
                .body("origin", equalTo("36.112.24.20"))
                .body("json.username", equalTo("Hogwarts"))

        ;
        System.out.println(jsonobj.toString());

    }
}