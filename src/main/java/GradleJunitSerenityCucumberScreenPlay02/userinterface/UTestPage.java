package GradleJunitSerenityCucumberScreenPlay02.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.utest.com/")
public class UTestPage extends PageObject{
	public static final Target JOIN_BUTTON=Target.the("Button that lets us enter creation page").
			located(By.className("unauthenticated-nav-bar__sign-up"));

}
