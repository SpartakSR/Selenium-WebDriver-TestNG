
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

public class CreditCal {
	private WebDriver driver;
      @BeforeClass
	  public void setUp() {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("--remote-allow-origins=*");
	      driver = new ChromeDriver(options);
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        }
	  
	  @AfterClass
	  public void tearDown() {
	    driver.quit();
	  }
	 
	  /* Сумма кредита = 100 000 - 1 */
	  @Test
	  public void Test1() {
		  driver.get("https://www.vtb.ru/personal/kredit/kalkulyator/");
		    driver.manage().window().setSize(new Dimension(945, 1020));
		    driver.findElement(By.cssSelector(".calculator-creditstyles__CalculatorRangeCredit-calculator-credit__sc-1egkfry-2:nth-child(1) .jEFSaq")).click();
		    {
		      WebElement element = driver.findElement(By.cssSelector(".calculator-rangestyles__CalculatorInput-foundation-kit__sc-1h5somy-4"));
		      Actions builder = new Actions(driver);
		      builder.doubleClick(element).perform();
		    }
		    driver.findElement(By.cssSelector(".calculator-rangestyles__CalculatorInput-foundation-kit__sc-1h5somy-4")).sendKeys("99000");
		    driver.findElement(By.cssSelector(".calculator-rangestyles__CalculatorInput-foundation-kit__sc-1h5somy-4")).sendKeys(Keys.ENTER);
		    assertEquals(driver.findElement(By.cssSelector(".calculator-creditstyles__CalculatorRangeCredit-calculator-credit__sc-1egkfry-2:nth-child(1) .jEFSaq")).getText(), ("100 000 ₽"));
	  }
	 
	  /* Сумма кредита = 100 000 */
	  @Test
	  public void Test2() {
		  driver.get("https://www.vtb.ru/personal/kredit/kalkulyator/");
		    driver.manage().window().setSize(new Dimension(945, 1020));
		    driver.findElement(By.cssSelector(".calculator-creditstyles__CalculatorRangeCredit-calculator-credit__sc-1egkfry-2:nth-child(1) .jEFSaq")).click();
		    {
		      WebElement element = driver.findElement(By.cssSelector(".calculator-rangestyles__CalculatorInput-foundation-kit__sc-1h5somy-4"));
		      Actions builder = new Actions(driver);
		      builder.doubleClick(element).perform();
		    }
		    driver.findElement(By.cssSelector(".calculator-rangestyles__CalculatorInput-foundation-kit__sc-1h5somy-4")).sendKeys("100000");
		    driver.findElement(By.cssSelector(".calculator-rangestyles__CalculatorInput-foundation-kit__sc-1h5somy-4")).sendKeys(Keys.ENTER);
		    assertEquals(driver.findElement(By.cssSelector(".calculator-creditstyles__CalculatorRangeCredit-calculator-credit__sc-1egkfry-2:nth-child(1) .jEFSaq")).getText(), ("100 000 ₽"));
	  }
	  
	  /* Сумма кредита = 100 000 + 1 */
	  @Test
	  public void Test3() {
		  driver.get("https://www.vtb.ru/personal/kredit/kalkulyator/");
		    driver.manage().window().setSize(new Dimension(945, 1020));
		    driver.findElement(By.cssSelector(".calculator-creditstyles__CalculatorRangeCredit-calculator-credit__sc-1egkfry-2:nth-child(1) .jEFSaq")).click();
		    {
		      WebElement element = driver.findElement(By.cssSelector(".calculator-rangestyles__CalculatorInput-foundation-kit__sc-1h5somy-4"));
		      Actions builder = new Actions(driver);
		      builder.doubleClick(element).perform();
		    }
		    driver.findElement(By.cssSelector(".calculator-rangestyles__CalculatorInput-foundation-kit__sc-1h5somy-4")).sendKeys("101000");
		    driver.findElement(By.cssSelector(".calculator-rangestyles__CalculatorInput-foundation-kit__sc-1h5somy-4")).sendKeys(Keys.ENTER);
		    assertEquals(driver.findElement(By.cssSelector(".calculator-creditstyles__CalculatorRangeCredit-calculator-credit__sc-1egkfry-2:nth-child(1) .jEFSaq")).getText(), ("101 000 ₽"));
	  }
	  
	  /* 100 000 < Сумма кредита < 30 000 000 */
	  @Test
	  public void Test4() {
		  driver.get("https://www.vtb.ru/personal/kredit/kalkulyator/");
		    driver.manage().window().setSize(new Dimension(945, 1020));
		    driver.findElement(By.cssSelector(".calculator-creditstyles__CalculatorRangeCredit-calculator-credit__sc-1egkfry-2:nth-child(1) .jEFSaq")).click();
		    {
		      WebElement element = driver.findElement(By.cssSelector(".calculator-rangestyles__CalculatorInput-foundation-kit__sc-1h5somy-4"));
		      Actions builder = new Actions(driver);
		      builder.doubleClick(element).perform();
		    }
		    driver.findElement(By.cssSelector(".calculator-rangestyles__CalculatorInput-foundation-kit__sc-1h5somy-4")).sendKeys("200000");
		    driver.findElement(By.cssSelector(".calculator-rangestyles__CalculatorInput-foundation-kit__sc-1h5somy-4")).sendKeys(Keys.ENTER);
		    assertEquals(driver.findElement(By.cssSelector(".calculator-creditstyles__CalculatorRangeCredit-calculator-credit__sc-1egkfry-2:nth-child(1) .jEFSaq")).getText(), ("200 000 ₽"));
	  }
	 
	  /* Сумма кредита = 30 000 000 */
	  @Test
	  public void Test5() {
		  driver.get("https://www.vtb.ru/personal/kredit/kalkulyator/");
		    driver.manage().window().setSize(new Dimension(945, 1020));
		    driver.findElement(By.cssSelector(".calculator-creditstyles__CalculatorRangeCredit-calculator-credit__sc-1egkfry-2:nth-child(1) .jEFSaq")).click();
		    {
		      WebElement element = driver.findElement(By.cssSelector(".calculator-rangestyles__CalculatorInput-foundation-kit__sc-1h5somy-4"));
		      Actions builder = new Actions(driver);
		      builder.doubleClick(element).perform();
		    }
		    driver.findElement(By.cssSelector(".calculator-rangestyles__CalculatorInput-foundation-kit__sc-1h5somy-4")).sendKeys("30000000");
		    driver.findElement(By.cssSelector(".calculator-rangestyles__CalculatorInput-foundation-kit__sc-1h5somy-4")).sendKeys(Keys.ENTER);
		    assertEquals(driver.findElement(By.cssSelector(".calculator-creditstyles__CalculatorRangeCredit-calculator-credit__sc-1egkfry-2:nth-child(1) .jEFSaq")).getText(), ("30 000 000 ₽"));
	  }
	  
	  /* Сумма кредита = 30 000 000 + 1 */
	  @Test
	  public void Test6() {
		  driver.get("https://www.vtb.ru/personal/kredit/kalkulyator/");
		    driver.manage().window().setSize(new Dimension(945, 1020));
		    driver.findElement(By.cssSelector(".calculator-creditstyles__CalculatorRangeCredit-calculator-credit__sc-1egkfry-2:nth-child(1) .jEFSaq")).click();
		    {
		      WebElement element = driver.findElement(By.cssSelector(".calculator-rangestyles__CalculatorInput-foundation-kit__sc-1h5somy-4"));
		      Actions builder = new Actions(driver);
		      builder.doubleClick(element).perform();
		    }
		    driver.findElement(By.cssSelector(".calculator-rangestyles__CalculatorInput-foundation-kit__sc-1h5somy-4")).sendKeys("30000001");
		    driver.findElement(By.cssSelector(".calculator-rangestyles__CalculatorInput-foundation-kit__sc-1h5somy-4")).sendKeys(Keys.ENTER);
		    assertEquals(driver.findElement(By.cssSelector(".calculator-creditstyles__CalculatorRangeCredit-calculator-credit__sc-1egkfry-2:nth-child(1) .jEFSaq")).getText(), ("30 000 000 ₽"));
	  }
	  
	  /* Сумма кредита = 30 000 000 - 1 */
	  @Test
	  public void Test7() {
		  driver.get("https://www.vtb.ru/personal/kredit/kalkulyator/");
		    driver.manage().window().setSize(new Dimension(945, 1020));
		    driver.findElement(By.cssSelector(".calculator-creditstyles__CalculatorRangeCredit-calculator-credit__sc-1egkfry-2:nth-child(1) .jEFSaq")).click();
		    {
		      WebElement element = driver.findElement(By.cssSelector(".calculator-rangestyles__CalculatorInput-foundation-kit__sc-1h5somy-4"));
		      Actions builder = new Actions(driver);
		      builder.doubleClick(element).perform();
		    }
		    driver.findElement(By.cssSelector(".calculator-rangestyles__CalculatorInput-foundation-kit__sc-1h5somy-4")).sendKeys("29999999");
		    driver.findElement(By.cssSelector(".calculator-rangestyles__CalculatorInput-foundation-kit__sc-1h5somy-4")).sendKeys(Keys.ENTER);
		    assertEquals(driver.findElement(By.cssSelector(".calculator-creditstyles__CalculatorRangeCredit-calculator-credit__sc-1egkfry-2:nth-child(1) .jEFSaq")).getText(), ("29 999 999 ₽"));
	  }
	  
}
