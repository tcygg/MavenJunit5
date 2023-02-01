package com.ceshiren.jiekou;

/**
 * @Auther: zhaoss
 * @Date: 2023/1/28 - 01 - 28 - 15:56
 * @Description: com.ceshiren.jiekou
 * @version: 1.0
 */
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;


public class TestRestAssured {

    @Test
    void fun(){

        given()
                // given 设置测试预设（请求头、请求参数、请求体等等）
                .header("Hello", "Hogwarts")
                .when()
                // when 所要执行的请求动作
                .get("https://httpbin.ceshiren.com/get")
                .then()
                // then 解析结果、断言
                .log().all();  // 打印全部响应信息（响应头、响应体、状态等等）
    }
}

/**
 * given()：可以设置测试预设
 * param()：URL 查询参数
 * when()：所要执行的操作
 * get()：GET 请求
 * post()：POST 请求
 * then()：可以解析结果、断言
 * statusCode()：响应状态码断言
 */