package JavaBasicProgram;

public class LoginPage {
	    private WebDriver driver;

	    @FindBy(id = "username")
	    private WebElement usernameField;

	    @FindBy(id = "password")
	    private WebElement passwordField;

	    @FindBy(id = "loginButton")
	    private WebElement loginButton;

	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public void enterUsername(String username) {
	        usernameField.sendKeys(username);
	    }

	    public void enterPassword(String password) {
	        passwordField.sendKeys(password);
	    }

	    public void clickLogin() {
	        loginButton.click();
	    }
	}

}
