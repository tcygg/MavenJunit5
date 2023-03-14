package com.ceshiren.jiekou.xiaomi;

/**
 * @Auther: zhaoss
 * @Date: 2023/3/14 - 03 - 14 - 13:23
 * @Description: com.ceshiren.jiekou.xiaomi
 * @version: 1.0

public class ContainerPost01 {
    @Test
    void ContainerPost001(){

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
                .post("https://iwms.test.mi.com/wms/restful/container/queryContainerPage")
                .then()
                // 解析结果
                .log().body()  // 打印完整响应信息
                .statusCode(200)
                .body("origin", equalTo("36.112.24.20"))
                .body("json.username", equalTo("Hogwarts"))

        ;
        System.out.println(jsonobj.toString());
}
 */