package Util;
import Steps.Basestep;
import org.junit.runner.notification.Failure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import ru.yandex.qatools.allure.annotations.Attachment;
public class AllureListener extends ru.yandex.qatools.allure.junit.AllureRunListener {
    @Override
    public void testFailure(Failure failure){
        takeScreeShot();
        super.testFailure(failure);
    }

    @Attachment(type = "image/png",value = "Скриншот ошибки")
    public byte[] takeScreeShot(){
        return  ((TakesScreenshot) Basestep.getDriver()).getScreenshotAs(OutputType.BYTES);
    }
}
