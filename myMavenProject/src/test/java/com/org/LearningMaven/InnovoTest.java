package com.org.LearningMaven;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Finder;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class InnovoTest {
        
    WebDriver driver;
    WebDriverWait wait;
    
    
    @BeforeTest
    public void beforeTest()
    {
        System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
        driver = new FirefoxDriver();
        //gWait = new FluentWait<WebDriver>(driver).withTimeout(100, TimeUnit.SECONDS)
        //        .pollingEvery(600, TimeUnit.MILLISECONDS).ignoring(StaleElementReferenceException.class);
        wait = new WebDriverWait(driver, 120);
        driver.get("https://demo.inovvo.com/MemberLogin.aspx?ReturnUrl=%2fanalytix.aspx");
        driver.findElement(By.xpath("//*[@placeholder='Enter your user ID']")).sendKeys("nnamperumal");
        driver.findElement(By.xpath("//*[@placeholder='Enter your password']")).sendKeys("Namsveen@1234");
        driver.findElement(By.xpath("//*[@value='SIGN IN']")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        WebElement we = driver.findElement(By.xpath("//span[contains(text(),'Marketing Analytix - Data Usage Analysis')]/parent::div/parent::div/parent::div//li[1]"));
        we.click();
    
    }

    /*        
    //    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        List<WebElement> loading = driver.findElements(By.xpath("//*[contains(text(),'Loading')]"));

        System.out.println(loading.size());
        if (driver.findElements(By.xpath("//*[contains(text(),'Loading')]"))!=null)
        {
            System.out.println("Loading");
        }
        else
            System.out.println("No Loading");

         WebElement rxBtn = driver.findElement(By.xpath("//*[contains(text(),'Loading')]"));
        Assert.assertEquals(true, rxBtn.isDisplayed());

        driver.findElement(By.)*/

    /* while (true)
         {
             try{
              if (driver.findElement(By.xpath(".//*[contains(text(),'Loading')]")).isDisplayed())

                  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
              else      
                  break;
             }catch(StaleElementException e)
             {
             }*/

    //WebDriverWait wait = new WebDriverWait(driver, 5000L);
    // wait.until(ExpectedConditions.visibilityOf(loader)); // wait for loader to appear
    // wait.until(ExpectedConditions.invisibilityOf(rxBtn)); // wait for loader to disappear


    /*@Test
    public void testSamplePod()
    {
    
        WebElement podlink;

        podlink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main-page-container']/div[2]//span[contains(text(),'Data Services Consumption')]/ancestor::div[@class='portlet light']/div[2]/div[1]/div[5]/div[1]//*[contains(text(),'Total Data Volume (MB)')]")));

        List<WebElement> list = driver.findElements(By.name("data-original-title"));
        for (WebElement e:list)
        {
            System.out.println(e.getText());
        }

        if (podlink.isDisplayed())
        {
            System.out.println("Podlink Displayed");
        }
    }*/

    @Test
    public void testDataServicesConsumption()
    {

        WebElement pod1;
        pod1 = driver.findElement(By.xpath("//div[@id='main-page-container']/div[2]//span[contains(text(),'Data Services Consumption')]/ancestor::div[@class='portlet light']/div[2]/div[1]/div[5]/div[1]//*[contains(text(),'Total Data Volume (MB)')]"));
        pod1= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main-page-container']/div[2]//span[contains(text(),'Data Services Consumption')]/ancestor::div[@class='portlet light']/div[2]/div[1]/div[5]/div[1]//*[contains(text(),'Total Data Volume (MB)')]")));
        System.out.println("Verifying");
                   
        if (pod1.isDisplayed())
        {
            System.out.println("Data Services Consumption Displayed");
        }
        else 
            System.out.println("Data Services Consumption not Displayed");
        
        Assert.assertEquals(pod1.isDisplayed(),true,"Data Services Consumption pod Displayed");
    
    }
    

    @Test
    public void testDistributionbyDeviceType()
    {

        WebElement pod2;
       // pod2 = driver.findElement(By.xpath("//div[@id='main-page-container']/div[2]//span[contains(text(),'Distribution by Device Type')]/ancestor::div[@class='portlet light']/div[2]/div[1]/div[5]/div[1]//*[contains(text(),'Total Data Volume (MB)')]"));

        pod2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main-page-container']/div[2]//span[contains(text(),'Distribution by Device Type')]/ancestor::div[@class='portlet light']/div[2]/div[1]/div[5]/div[1]//*[contains(text(),'Total Data Volume (MB)')]")));

        
        if (pod2.isDisplayed())
        {
            System.out.println("Distribution by Device Type Displayed");
        }
        else 
            System.out.println("Distribution by Device Type not Displayed");

    }
    
    @Test
    public void testVolumeDistribution()
    {
        WebElement pod3;
        //pod3 = driver.findElement(By.xpath("//div[@id='main-page-container']/div[2]//span[contains(text(),'Volume Distribution')]/ancestor::div[@class='portlet light']/div[2]/div[1]/div[5]/div[1]//*[contains(text(),'Num Unique Active Users')]"));
        pod3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main-page-container']/div[2]//span[contains(text(),'Volume Distribution')]/ancestor::div[@class='portlet light']/div[2]/div[1]/div[5]/div[1]//*[contains(text(),'Num Unique Active Users')]")));

        if (pod3.isDisplayed())
        {
            System.out.println("Volume Distribution Displayed");
        }
        else 
        {
            System.out.println("Volume Distribution not Displayed");
        }
    }
    

    @Test
    public void testTopProviders()
    {
        WebElement pod4;
        //pod4 = driver.findElement(By.xpath("//div[@id='main-page-container']/div[2]//span[contains(text(),'Top Providers')]/ancestor::div[@class='portlet light']/div[2]/div[1]/div[3]/div//th//a[contains(text(),'Providers')]"));

        pod4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main-page-container']/div[2]//span[contains(text(),'Top Providers')]/ancestor::div[@class='portlet light']/div[2]/div[1]/div[3]/div//th//a[contains(text(),'Providers')]")));

        
        if (pod4.isDisplayed())
        {
            System.out.println("Top Providers Displayed");
        }
        
        else
            System.out.println("Top Providers not Displayed");
    }
    
    @Test
    public void testTopTariffPlans()
    {
        WebElement pod5;
       // pod5 = driver.findElement(By.xpath("//div[@id='main-page-container']/div[2]//span[contains(text(),'Top Tariff Plans')]/ancestor::div[@class='portlet light']/div[2]/div[1]/div[3]//th/a[contains(text(),'Tariff Plan')]"));

        pod5 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main-page-container']/div[2]//span[contains(text(),'Top Tariff Plans')]/ancestor::div[@class='portlet light']/div[2]/div[1]/div[3]//th/a[contains(text(),'Tariff Plan')]")));


        if (pod5.isDisplayed())
        {
            System.out.println("Top Tariff Plans Displayed");
        }
        else
            System.out.println("Top Tariff Plans not Displayed");
        
    }
    
    @Test
    public void testTopOptions()
    {
        WebElement pod6; 
       // pod6 = driver.findElement(By.xpath("//div[@id='main-page-container']/div[2]//span[contains(text(),'Top Options')]/ancestor::div[@class='portlet light']/div[2]/div[1]/div[3]//th/a[contains(text(),'Option Name')]"));

        pod6 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main-page-container']/div[2]//span[contains(text(),'Top Options')]/ancestor::div[@class='portlet light']/div[2]/div[1]/div[3]//th/a[contains(text(),'Option Name')]")));

        if (pod6.isDisplayed())
        {
            System.out.println("Top Options Displayed");
        }
        else
        System.out.println("Top Options not Displayed");
    }
    
    @Test
    public void sikuliTest() throws Exception
    {
    	Screen screen = new Screen();
    	  
    	Pattern pattern = new Pattern("D:\\CreateNew.PNG");
    	screen.click(pattern);
    	Thread.sleep(5000);
    	Finder f= new Finder("D:\\CreateNew.PNG");
    	f.find(pattern);
    	while (f.hasNext())
    	{
    		System.out.println("found: "+f.next());
    	}
    }
    
    @AfterTest
    public void afterTest()
    {
        driver.quit();
    }

}
