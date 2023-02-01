package com.ceshiren.jiekou;

/**
 * @Auther: zhaoss
 * @Date: 2023/1/28 - 01 - 28 - 16:04
 * @Description: com.ceshiren.jiekou
 * @version: 1.0
 */
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

public class TestRestAssuredPost01 {
    @Test
    void testPost(){
        given()
                // 可以设置测试预设
                .param("username", "Hogwarts")  // 设置查询参数
                .when()
                // 发起 POST 请求
                .post("https://httpbin.ceshiren.com/post")
                .then()
                // 解析结果
                .log().all()  // 打印完整响应信息
                .statusCode(200);  // 响应断言
    }
}