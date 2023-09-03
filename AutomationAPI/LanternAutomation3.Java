import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.Color;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.net.URL;

public class automationTest {
    public static void delay(int sec){
        try{
            int convertDelay = sec*1000;
            Thread.sleep(convertDelay);
        } catch (InterruptedException e){
            System.out.println("error");
        }
    }

    public static void main(String args[]) throws MalformedURLException, InterruptedException {

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("skipDeviceInitialization", true);
        dc.setCapability("skipServerInstallation", true);
        dc.setCapability("fullReset", false);
        dc.setCapability("noReset", true);

        dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
        dc.setCapability("platformName","android");
        dc.setCapability("appPackage","com.janacorporation.lantern.mobile.core.enbridge");
        dc.setCapability("appActivity", "com.janacorporation.lantern.core.activities.SplashActivity");

        AndroidDriver<AndroidElement> ad = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);


        identify text
        var text = ad.findElement(by.tagName("h1"));
        obtain color in rgba
        String s = text.getCssValue("color");
        convert rgba to hex
        String c = Color.fromString(s).asHex();

        delay(9);
        MobileElement el4 = (MobileElement) ad.findElementById("com.janacorporation.lantern.mobile.core.enbridge:id/mapservice_card_holder");
        el4.click();

        delay(4);
        MobileElement el5 = (MobileElement) ad.findElementByAccessibilityId("Open navigation drawer");
        el5.click();

        delay(2);
        MobileElement el6 = (MobileElement) ad.findElementById("com.janacorporation.lantern.mobile.core.enbridge:id/fragment_survey_rv_survey_jobs");
        el6.click();

        delay(2);
        MobileElement el7 = (MobileElement) ad.findElementById("com.janacorporation.lantern.mobile.core.enbridge:id/et_configure_survey_position_capture_frequency");
        el7.click();

        delay(2);
        el7.clear();

        delay(2);
        el7.sendKeys("30");

        delay(2);
        MobileElement el8 = (MobileElement) ad.findElementById("com.janacorporation.lantern.mobile.core.enbridge:id/et_configure_survey_maximum_time_limit");
        el8.click();

        delay(2);
        el8.clear();

        delay(2);
        el8.sendKeys("45");

        delay(2);
        MobileElement el9 = (MobileElement) ad.findElementById("com.janacorporation.lantern.mobile.core.enbridge:id/et_configure_survey_maximum_acceptable_pdop");
        el9.click();

        delay(2);
        el9.clear();

        delay(2);
        el9.sendKeys("4");

        delay(2);
        MobileElement el10 = (MobileElement) ad.findElementById("com.janacorporation.lantern.mobile.core.enbridge:id/button_save");
        el10.click();

        delay(2);
        MobileElement el11 = (MobileElement) ad.findElementById("com.janacorporation.lantern.mobile.core.enbridge:id/et_configure_survey_maximum_acceptable_std_dev");
        el11.click();

        delay(2);
        el11.clear();

        delay(2);
        el11.sendKeys("9");

        delay(2);
        MobileElement el12 = (MobileElement) ad.findElementById("com.janacorporation.lantern.mobile.core.enbridge:id/et_configure_survey_maximum_acceptable_pdop");
        el12.click();

        delay(2);
        MobileElement el13 = (MobileElement) ad.findElementById("com.janacorporation.lantern.mobile.core.enbridge:id/button_save");
        el13.click();

        delay(2);
        ad.navigate().back();

        delay(2);
        MobileElement el14 = (MobileElement) ad.findElementById("com.janacorporation.lantern.mobile.core.enbridge:id/button_save");
        el14.click();

        delay(2);
        MobileElement el15 = (MobileElement) ad.findElementByAccessibilityId("Open navigation drawer");
        el15.click();

        delay(2);
        MobileElement el16 = (MobileElement) ad.findElementById("com.janacorporation.lantern.mobile.core.enbridge:id/fragment_survey_rv_survey_jobs");
        el16.click();

        //delay(2);
        //MobileElement el17 = (MobileElement) ad.findElementById("com.janacorporation.lantern.mobile.core.enbridge:id/cancel_label");
        //el17.click();

        Assert.assertEquals(ad.findElementById("com.janacorporation.lantern.mobile.core.enbridge:id/et_configure_survey_position_capture_frequency").getText(), "30");
        Assert.assertEquals(ad.findElementById("com.janacorporation.lantern.mobile.core.enbridge:id/et_configure_survey_maximum_time_limit").getText(), "45");
        Assert.assertEquals(ad.findElementById("com.janacorporation.lantern.mobile.core.enbridge:id/et_configure_survey_maximum_acceptable_pdop").getText(), "4.0");
        Assert.assertEquals(ad.findElementById("com.janacorporation.lantern.mobile.core.enbridge:id/et_configure_survey_maximum_acceptable_std_dev").getText(), "9.0");

    }
}
