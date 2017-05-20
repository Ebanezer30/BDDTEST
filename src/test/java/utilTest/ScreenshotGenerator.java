package utilTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotGenerator 
{ 
	public static void generateScreenshot(WebDriver wd)
	{
		File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		InputStream stream=new FileInputStream(src);
		s.embed(IOUtils.toByteArray(stream), "image/jpeg");
	}
}
