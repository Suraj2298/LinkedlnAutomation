public class LinkedlnTest {

    public static void main(String[] args) {

                WebDriver driver = new ChromeDriver();
                WebDriverWait wait = new WebDriverWait(driver, 10);

                driver.get("https://www.linkedin.com");

                WebElement emailField = driver.findElement(By.id("suraj.nagarale2@gmail.com"));
                WebElement passwordField = driver.findElement(By.id("Suraj@123456"));
                emailField.sendKeys("suraj.nagarale2@gmail.com");
                passwordField.sendKeys("Suraj@123456");

                WebElement signInButton = driver.findElement(By.cssSelector("button[type='submit']"));
                signInButton.click();

                WebElement otpField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("otp")));

                try {
                    Thread.sleep(40000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                otpField.sendKeys("456789");

                WebElement otpSubmitButton = driver.findElement(By.cssSelector("button[type='submit']"));
                otpSubmitButton.click();

                driver.get("https://www.linkedin.com/mynetwork/");

                List<WebElement> messageButtons = driver.findElements(By.xpath("//button[contains(@aria-label,'Message')]"));
                for (WebElement messageButton : messageButtons) {
                    messageButton.click();

                    WebElement messageInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[contains(@aria-label,'Write a message')]")));

                    messageInput.sendKeys("Hello");

                    WebElement sendButton = driver.findElement(By.xpath("//button[contains(@aria-label,'Send now')]"));
                    sendButton.click();


                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                driver.quit();
            }
        }
