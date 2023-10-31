package com.dal.bi.work;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;

import java.util.HashMap;

/**
 * @Auther: TcYgg
 * @Date: 2023/10/30 - 10 - 30 - 15:52
 * @Description: com.dal.bi.work
 * @version: 1.0
 */
public class Bi_ApiX5_sign {
    public static void main(String[] args) {
            String appId = "smartbi_api_7d9d4e60fb70c629";
            String appSecret = "b045b02377d0427ab112bf8512068502";
//请求参数
            HashMap<String, String> param = new HashMap<>();
            String body = JSON.toJSONString(param);
            String sign = DigestUtils.md5Hex(appId + body + appSecret).toUpperCase();
//封装请求参数
            JSONObject jsonObject = new JSONObject();
            JSONObject header = new JSONObject();
            header.put("appid", appId);
            header.put("sign", sign);
            jsonObject.put("header", header);
            jsonObject.put("body", body);
//        String data = Base64Utils.encodeToString(jsonObject.toString().getBytes());
            Base64 base64 = new Base64();
            String data = base64.encodeToString(jsonObject.toString().getBytes()
            );

//打印
            System.out.println("sign:" + sign +"\n"+ "data:" + data);
//            System.out.println(body);

    }

}
