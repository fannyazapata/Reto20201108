package GradleJunitSerenityCucumberScreenPlay02.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {



	public static String variable="//*[contains(text(),'a1@gmail.com')]";
	
	public static final Target LOGIN_BUTTON=Target.the("Button that lets us pass to location page").
			located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[1]/a"));

	public static final Target INPUT_USER_NAME=Target.the("Where do we write the first name").
			located(By.id("username"));
	public static final Target INPUT_PASSWORD=Target.the("Where do we write the first name").
			located(By.id("password"));
	public static final Target SIGN_IN_BUTTON=Target.the("Button that lets us log in").
			located(By.name("login"));
	public static final Target ACTUAL_TEXT=Target.the("Let us know the actual test").
			located(By.xpath(variable));
			//located(By.xpath("//*[@id=\"kc-form-wrapper\"]/div/section/div[1]/span')]"));--unable
			//located(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/section/div[1]/span')]"));	

	
	
	public class FindAJobPage extends PageObject {

	    WebElementFacade LOGIN_BUTTON;

	    public boolean searchButtonIsVisible() {
	        return LOGIN_BUTTON.isVisible();
	    }
	    
	}
}
