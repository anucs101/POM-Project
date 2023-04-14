package utilities;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility 
{
	 
		public static final long IMPLICIT_WAIT = 10;
		public static final long PAGE_LOAD_WAIT = 20;
		public static final long EXPLICIT_WAIT = 50;
		public static final long FLUENT_WAIT = 30;
		public static final long POLLING_WAIT = 5;
		

		public static void implicitWait(WebDriver driver)
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));
		}
		public static void waitForElement(WebDriver driver, WebElement target) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
			wait.until(ExpectedConditions.visibilityOf(target));
		}

		public static void waitForElement(WebDriver driver, By target) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
			wait.until(ExpectedConditions.visibilityOfElementLocated(target));
		}

		public static void waitForElementClickable(WebDriver driver, WebElement target) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
			wait.until(ExpectedConditions.elementToBeClickable(target));
		}

		public static void waitForElementClickable(WebDriver driver, By target) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
			wait.until(ExpectedConditions.elementToBeClickable(target));
		}

		/*public static void waitForElementSelected(WebDriver driver, By target) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
			wait.until(ExpectedConditions.elementToBeClickable(target));
		}*/

		public static void waitFortextToBePresentInElement(WebDriver driver, By target) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
			wait.until(ExpectedConditions.textToBePresentInElementLocated(target, null));
		}
		
		public static void waitFortextToBePresentInElement(WebDriver driver, WebElement target) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
			wait.until(ExpectedConditions.textToBePresentInElement(target, null));
		}
		
		public static void waitFortextToBePresentInElementValue(WebDriver driver, By target) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
			wait.until(ExpectedConditions.textToBePresentInElementValue(target, null));
		}
		
		public static void waitForElementIsPresent(WebDriver driver, By target) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
			wait.until(ExpectedConditions.presenceOfElementLocated(target));
			}
		
		public static void waitForElementIsPresent(WebDriver driver, WebElement target) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
			wait.until(ExpectedConditions.visibilityOf(target));
		}

		public static void waitForAlterIsPresent(WebDriver driver, By target) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
			wait.until(ExpectedConditions.alertIsPresent());
		}

		public static void waitForFrameToBeAvailableAndSwitchToIt(WebDriver driver, By target) {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(EXPLICIT_WAIT));
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(target));
		}

		public static void waitForInvisibilityOfElementLocated(WebDriver driver, By target) {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(EXPLICIT_WAIT));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(target));
		}

		public static void waitForPresenceOfAllElementsLocated(WebDriver driver, By target) {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(EXPLICIT_WAIT));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(target));
		}

		public static void waitForPresenceOfElementsLocatedBy(WebDriver driver, By target) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
			wait.until(ExpectedConditions.presenceOfElementLocated(target));
		}

		public static void waitForPresenceOfElementsLocated(WebDriver driver, By target) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
			wait.until(ExpectedConditions.presenceOfElementLocated(target));
		}

		public static void waitForTextToBePresentInElementLocated(WebDriver driver, By target) {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(EXPLICIT_WAIT));
			wait.until(ExpectedConditions.textToBePresentInElementLocated(target,null));
		}

		public static void waitForAttributeToBe(WebDriver driver, By target) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
			wait.until(ExpectedConditions.attributeToBe(target, null, null));
		}
		
		public static void waitForElementSelectionStateToBe(WebDriver driver,By target,boolean selected) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
			wait.until(ExpectedConditions.elementSelectionStateToBe(target, selected));
		}
		
		public static void waitForElementSelectionStateToBe(WebDriver driver,WebElement target,boolean selected) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
			wait.until(ExpectedConditions.elementSelectionStateToBe(target, selected));
		}
		
		public static void waitForelementToBeSelected(WebDriver driver,By target) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
			wait.until(ExpectedConditions.elementToBeSelected(target));
		}
		
		public static void waitForelementToBeSelected(WebDriver driver,WebElement target) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
			wait.until(ExpectedConditions.elementToBeSelected(target));
		}
		
		public static void waitForinvisibilityOfElementLocated(WebDriver driver,By target) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(target));
		}
		
		public static void waitForTitleContains(WebDriver driver) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
			wait.until(ExpectedConditions.titleContains(null));
		}
		
		public static void waitForvisibilityOfAllElements(WebDriver driver,List<WebElement> elements) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
			wait.until(ExpectedConditions.visibilityOfAllElements(elements));
		}
		
		
		
		
		public static void fluentWait(WebDriver driver, By target) {
			Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(FLUENT_WAIT))
			.pollingEvery(Duration.ofSeconds(POLLING_WAIT))
			.ignoring(NoSuchElementException.class);
			WebElement foo=fluentWait.until(ExpectedConditions.visibilityOfElementLocated(target));
		}
		
		public static void pageLoadWait(WebDriver driver) {
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAGE_LOAD_WAIT));
		}

	}



