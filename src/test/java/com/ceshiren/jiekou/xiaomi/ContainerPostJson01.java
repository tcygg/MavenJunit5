package com.ceshiren.jiekou.xiaomi;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

/**
 * @Auther: zhaoss
 * @Date: 2023/3/14 - 03 - 14 - 13:33
 * @Description: com.ceshiren.jiekou.xiaomi
 * @version: 1.0
 */
public class ContainerPostJson01 {

    @Test
    void testContainerJson() {


        String jsonstr = "{\n" +
                "    \"pageNum\": 1,\n" +
                "    \"pageSize\": 10,\n" +
                "    \"containerCode\": \"P510542233D0000G\",\n" +
                "    \"containerTypeCodeList\": [249],\n" +
                "    \"purposeTypeCodeList\": [\"GENERAL\"],\n" +
                "    \"isUse\": 1,\n" +
                "    \"structTypeCodeList\": [\"PALLET\"],\n" +
                "    \"containerStatus\": 0,\n" +
                "    \"occupyTaskTypeList\": [],\n" +
                "    \"occupyTask\": \"\"\n" +
                "}";

        given()
                // 可以设置测试预设
                .contentType("application/json")
                .header("Cookie", "CAS_TOKEN=1106-d5556c81-b53b-4b54-abfb-df5a692bf3ae; _aegis_cas=eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJuYmYiOjE2Nzg2NzQyMDMsImlzcyI6Ik1JLUlORk9TRUMiLCJhdWQiOiJpd21zLnRlc3QubWkuY29tIiwiYyI6MCwiZXhwIjoxNjc4OTM3MDAzLCJkIjoiQ0FTX0RFVklDRUlORk9fQVBJX0VSUk9SIiwidHlwIjoiY2FzIiwic3ViIjoicC16aGFuZ3hpbjc1IiwiZGV0YWlsIjoim81KuM9cdTAwMTCqJkxO2vRcdTAwMWPV1lxc8YshLEKr8faXk1x1MDAwMzlAufOxg-SVz3nWijCA74DcMUFDXHUwMDdmXCKhq1wvJZr8MXORnlxyKk837GxcdTAwMDdfXC_Z67034zjh-ufdlDRoQ_xLY1x1MDAxMVx1MDAxZPpaIVT6ykrhI0x5trW4jlx1MDAxN9U_XHUwMDA1XHUwMDFmXHUwMDA28IopY4VgSVx1MDAwNa32PivpNEawnHMmsitcdTAwMGUn-FFcL2zylEE3XGb4oNn0kK2xkPZelchGXHUwMDFhXHUwMDdmXciUJVx1MDAwNVY9XHUwMDAzyoPIKtBNrVx1MDAwNM1JxpzMmM1bXHUwMDFj7duOyC4gOFx1MDAwNMVbjVxyXHUwMDFhSkdpqiZiqa155vDjkeh4Ob6eoCM8zzK-Q9x64WJcdTAwMTRUycfSTmNX1tJuacswp1CTeURcdTAwMTTU-rQ5XHUwMDFjde9cdTAwMTWnwFxigv_FuaBcIlx1MDA3ZjhcdTAwMWPWXHUwMDAwmVx1MDAwMPT_8p94NVrLtWtgvlx1MDAxZDXNxa5cdTAwMWLcdYmtgpRkj_M1Y8HHxFowl1x1MDAwNYGNoLZWoH2k61A53p2_IVMqM1x1MDAxYrjgqM5-q14o7jRcdTAwN2Z0JFtk49TvXHUwMDFmgV9uUmJcdFx1MDAwYs5cXG23mlWcsCE1LFx1MDAwYlxiumTJQH43g3VcdTAwMWJnXHUwMDE1NOohU6qJXHUwMDBi55g8XHUwMDdm2Vx1MDAxMKN5bizkXHUwMDEwXHUwMDdmgpRhfEROz8qkOKgw2c0pgvTXI4Jf-FSXkfabp1wvu5-C_vxcIrao-1wiTy2NvOzKPfFcdTAwMTKA3lwvI1GEPGLYmFEpIZmHP0tTXHUwMDA1yOEuUJc6m8K6wlHTWJgnk60mhYkqee2aXHUwMDAyqKeHfe9cclx1MDAxM_He85WWrizuKEDFXCKKhFx1MDAwYlx1MDAxYTFi27F1i4ZcdTAwMDNccoIxh6_wz1x1MDAxN8uuZVx1MDAwNpbHlsjwXHUwMDE3IUUhMzO9WrbhUP60yO7U829pWVx1MDAxZnW9XFz3NYw9o1X2mtrjXC9shFx1MDAwZmPMg73JLoh1KdhcdTAwMTaF9-jWw1xivI0lV5hKdr2V5nJcdTAwMDf2OWfUSlx1MDAxYdH73lx1MDAwZiqFalx1MDAxOLlIXHUwMDE1frHHKVx1MDAxYfKVuZoifQ.jeHCaKM23vSlEZWwIpjSDgo44ne3KEF8mqWzeNTYLrfeB-X3PL_3SDA99k2j8LzaqrsEJ4xNz6mDDh3l3dJkEQ; factory=1; language=zh-CN; userId=1106; versionCode=3.0.0; warehouseId=1342865")
                .header("Connection", "keep-alive")
                .body(jsonstr)
                .log().body()
                .log().headers()
                .when()
                // 发起 POST 请求
                .post("https://iwms.test.mi.com/wms/restful/container/queryContainerPage")
                .then()
                // 解析结果
                .log().body()  // 打印完整响应信息
                .statusCode(200)
               // .body("origin", equalTo("36.112.24.20"))
                //.body("json.username", equalTo("Hogwarts"))

        ;
        System.out.println(jsonstr.toString());
    }


}

