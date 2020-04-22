package TestFire;

//import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static junit.framework.TestCase.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppFactoryTest {
    private WebDriver driver;
    testfireLogin objLogin;

    @Before
    public void setUp() throws Exception {
        // 如果你的 FireFox 没有安装在默认目录，那么必须在程序中设置
        System.setProperty("webdriver.firefox.bin", "D:\\360downloads\\firefox.exe");
        System.setProperty("webdriver.gecko.driver", "D:\\idea-2018\\geckodriver.exe");
        // 创建一个 FireFox 的浏览器实例
        driver = new FirefoxDriver();
        // 让浏览器访问 Baidu
        driver.get("http://www.testfire.net");
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        objLogin = new testfireLogin(driver);
        objLogin.loginTo("admin", "admin");
        String expect = objLogin.getLoginTitle();
        String actual = "Congratulations!";
        assertEquals(expect, actual);
    }
}