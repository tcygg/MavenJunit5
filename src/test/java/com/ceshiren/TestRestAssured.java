package com.ceshiren;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * @Auther: zhaoss
 * @Date: 2022/12/8 - 12 - 08 - 13:18
 * @Description: com.ceshiren
 * @version: 1.0
 */
public class TestRestAssured {

    @Test
    void fun(){

        String haha=given()
                // given 设置测试预设（请求头、请求参数、请求体等等）
                .header("Hello", "Hogwarts")
                .when()
                // when 所要执行的请求动作
                .get("https://httpbin.ceshiren.com/get")
                .then()
                // then 解析结果、断言
                .log().all()
                .extract().response().asString();// 打印全部响应信息（响应头、响应体、状态等等）
    }

    @Test
    void funTianqi(){

        given()
                // given 设置测试预设（请求头、请求参数、请求体等等）
                .header("Hello", "Hogwarts")
                .param("city","上海")
                .param("key","331eab8f3481f37868378fcdc76cb7cd")
                .log().all()
                .when()
                // when 所要执行的请求动作
                .get("http://apis.juhe.cn/simpleWeather/query")
                .then()
                // then 解析结果、断言
                .statusCode(200)
                .body("reason",equalTo("查询成功!"))
                .log().all();  // 打印全部响应信息（响应头、响应体、状态等等）
    }




}
