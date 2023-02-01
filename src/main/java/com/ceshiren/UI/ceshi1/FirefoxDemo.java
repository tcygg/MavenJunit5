package com.ceshiren.UI.ceshi1;

/**
 * @Auther: zhaoss
 * @Date: 2023/1/28 - 01 - 28 - 15:38
 * @Description: com.ceshiren
 * @version: 1.0
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FirefoxDemo {
    public static void main(String[] args) {
        // 创建一个 Geckodriver 的实例。Firefox()会从环境变量中寻找浏览器驱动
        WebDriver driver = new FirefoxDriver();
        // 打开网页
        driver.get("https://www.baidu.com/s?tn=68018901_20_oem_dg&ie=utf-8&wd=%E7%A7%AF%E5%88%86%E5%8F%B7%E8%BD%AF%E4%BB%B6%E8%B4%B9%E5%9B%9E%E5%A8%98%E5%AE%B6");
        // 关闭driver进程
        driver.quit();
    }
}