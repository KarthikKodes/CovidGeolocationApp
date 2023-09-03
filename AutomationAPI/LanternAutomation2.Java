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

        delay(8);
        MobileElement el2 = (MobileElement) ad.findElementById("com.janacorporation.lantern.mobile.core.enbridge:id/mapservice_card_holder");
        el2.click();

        delay(5);
        MobileElement el3 = (MobileElement) ad.findElementByAccessibilityId("Open navigation drawer");
        el3.click();

        delay(4);
        MobileElement el4 = (MobileElement) ad.findElementById("com.janacorporation.lantern.mobile.core.enbridge:id/filtering_spinner");
        el4.click();

        delay(13);
        MobileElement el5 = (MobileElement) ad.findElementById("com.janacorporation.lantern.mobile.core.enbridge:id/edit_button");
        el5.click();

        delay(6);
        MobileElement el6 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");
        el6.click();

        delay(10);
        MobileElement el7 = (MobileElement) ad.findElementById("com.janacorporation.lantern.mobile.core.enbridge:id/show_gps_button");
        el7.click();

        delay(7);
        MobileElement el8 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.EditText");
        el8.click();

        delay(7);
        el8.sendKeys("randomAddressValue");

        delay(7);
        MobileElement el9 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.FrameLayout/android.widget.EditText");
        el9.click();

        delay(7);
        el9.sendKeys("randomAddressValue2");

        delay(7);
        MobileElement el10 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.FrameLayout/android.widget.EditText");
        el10.click();

        delay(7);
        el10.sendKeys("1234567");

        delay(7);
        MobileElement el11 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.FrameLayout/android.widget.Spinner/android.widget.CheckedTextView");
        el11.click();

        delay(7);
        MobileElement el12 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]");
        el12.click();

        delay(7);
        MobileElement el13 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/android.widget.FrameLayout/android.widget.Spinner/android.widget.CheckedTextView");
        el13.click();

        delay(7);
        MobileElement el14 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[7]");
        el14.click();

        delay(7);
        MobileElement el15 = (MobileElement) ad.findElementById("com.janacorporation.lantern.mobile.core.enbridge:id/save_button");
        el15.click();

        delay(7);
        MobileElement el16 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[6]/android.widget.FrameLayout/android.widget.EditText");
        el16.click();

        delay(7);
        el16.sendKeys("Here we can automate very long and descriptive comments that are related to the test case. ");

        delay(7);
        MobileElement el17 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.FrameLayout/android.widget.EditText");
        el17.click();

        delay(7);
        MobileElement el18 = (MobileElement) ad.findElementById("com.janacorporation.lantern.mobile.core.enbridge:id/save_button");
        el18.click();

        delay(7);
        MobileElement el19 = (MobileElement) ad.findElementById("com.janacorporation.lantern.mobile.core.enbridge:id/save_button");
        el19.click();

        delay(7);
        MobileElement el20 = (MobileElement) ad.findElementById("com.janacorporation.lantern.mobile.core.enbridge:id/app_bar_search");
        el20.click();

        delay(7);
        MobileElement el21 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Spinner[1]/android.widget.CheckedTextView");
        el21.click();

        delay(7);
        MobileElement el22 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[15]");
        el22.click();

        delay(7);
        MobileElement el23 = (MobileElement) ad.findElementById("com.janacorporation.lantern.mobile.core.enbridge:id/button_query_fragment_search");
        el23.click();

        delay(7);
        MobileElement el24 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]");
        el24.click();

        delay(7);
        MobileElement el25 = (MobileElement) ad.findElementById("com.janacorporation.lantern.mobile.core.enbridge:id/zoom_btn");
        el25.click();

        Assert.assertEquals(ad.findElementById("com.janacorporation.lantern.mobile.core.enbridge:id/tv_spinner_dropdown_item").getText(),"Survey");
        
        identify text
        var text = ad.findElement(by.tagName("h1"));
        obtain color in rgba
        String s = text.getCssValue("color");
        convert rgba to hex
        String c = Color.fromString(s).asHex();

    }
}
