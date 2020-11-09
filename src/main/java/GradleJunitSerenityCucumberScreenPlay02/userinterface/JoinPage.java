package GradleJunitSerenityCucumberScreenPlay02.userinterface;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class JoinPage extends PageObject{
	public static final Target INPUT_FIRST_NAME=Target.the("Where do we write the first name").
			located(By.id("firstName"));
	public static final Target INPUT_lAST_NAME=Target.the("Where do we write the last name ").
			located(By.id("lastName"));
	public static final Target INPUT_EMAIL=Target.the("Where do we write the email").
			located(By.id("email"));
	public static final Target INPUT_MONTH_BIRTH=Target.the("Where do we select the month of birth ").
			located(By.id("birthMonth"));
	public static final Target INPUT_DAY_BIRTH=Target.the("Where do we select the day of birth").
			located(By.id("birthDay"));
	public static final Target INPUT_YEAR_BIRTH=Target.the("Where do we select the year of birth").
			located(By.id("birthYear"));
	public static final Target LOCATION_BUTTON=Target.the("Button that lets us pass to location page").
			located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a/span"));
	public static final Target INPUT_CITY=Target.the("Where do we write the city").
			located(By.id("city"));
	public static final Target INPUT_POSTAL_CODE=Target.the("Where do we write the postal code").
			located(By.id("zip"));
	public static final Target DEVICES_BUTTON=Target.the("Button that lets us pass to devices page").
			located(By.xpath("//*[contains(text(),'Next: Devices')]"));
	public static final Target OS_BUTTON=Target.the("Button that lets us pass to devices page").
			located(By.name("osId"));
	public static final Target lAST_STEP_BUTTON=Target.the("Button that lets us pass to last step page").
			located(By.xpath("//*[contains(text(),'Last Step')]"));
	public static final Target INPUT_PASSWORD=Target.the("Where do we write the password").
			located(By.id("password"));
	public static final Target INPUT_CONFIRM=Target.the("Where do we confirm the password").
			located(By.id("confirmPassword"));
	public static final Target CHECK_CONDUCT=Target.the("Where do we acept the conduct code").
			located(By.xpath("//*[@class='checkmark signup-consent__checkbox error']"));
	public static final Target CHECK_PRIVACY=Target.the("Where do we acept the privacy terms").
			located(By.xpath("//*[@class='checkmark signup-consent__checkbox error']"));
	public static final Target COMPLETE_BUTTON=Target.the("Button that lets us pass to last step page").
			located(By.xpath("//*[contains(text(),'Complete Setup')]"));


    


}


