package com.ceshiren.jiekou;

/**
 * @Auther: zhaoss
 * @Date: 2023/1/28 - 01 - 28 - 16:04
 * @Description: com.ceshiren.jiekou
 * @version: 1.0
 */
import static io.restassured.RestAssured.given;
import org.junit.jupiter.api.Test;

public class TestRestAssuredGet01 {
    @Test
    void testGet(){
        given()
                // 可以设置测试预设
                .param("username", "Hogwarts")  // 设置查询参数
                .when()
                // 发起 GET 请求
                .get("https://httpbin.ceshiren.com/get")
                .then()
                // 解析结果
                .log().all()  // 打印完整响应信息
                .statusCode(200)
                .extract()
                .response();  // 响应断言
    }
}