package GradleJunitSerenityCucumberScreenPlay02.task;
import GradleJunitSerenityCucumberScreenPlay02.userinterface.JoinPage;
import GradleJunitSerenityCucumberScreenPlay02.userinterface.UTestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
public class Join implements Task {
	private String firstName;
	private String lastName;
	private String email;
	private String month;
	private String day;
	private String year;
	//private String city;
	private String post;
	private String password;
	private String confirm;
	

	public Join(String firstName, String lastName, String email, String month, String day, String year, //String city,
			String post, String password, String confirm) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.month = month;
		this.day = day;
		this.year = year;
		//this.city = city;
		this.post = post;
		this.password = password;
		this.confirm = confirm;
	}

	public static Join theUser(String firstName, String lastName, String email, String month, String day, String year, //String city,
			String post, String password, String confirm) {
		return Tasks.instrumented(Join.class, firstName, lastName, email, month, day, year, //city, 
				post, password, confirm);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(UTestPage.JOIN_BUTTON),
				Enter.theValue(firstName).into(JoinPage.INPUT_FIRST_NAME),
				Enter.theValue(lastName).into(JoinPage.INPUT_lAST_NAME),
				Enter.theValue(email).into(JoinPage.INPUT_EMAIL),
				SelectFromOptions.byVisibleText(month).from(JoinPage.INPUT_MONTH_BIRTH),
				SelectFromOptions.byVisibleText(day).from(JoinPage.INPUT_DAY_BIRTH),
				SelectFromOptions.byVisibleText(year).from(JoinPage.INPUT_YEAR_BIRTH),
				Click.on(JoinPage.LOCATION_BUTTON),
				//Enter.theValue(city).into(JoinPage.INPUT_CITY),
				Enter.theValue(post).into(JoinPage.INPUT_POSTAL_CODE),
				Click.on(JoinPage.DEVICES_BUTTON),
				Click.on(JoinPage.OS_BUTTON),
				Click.on(JoinPage.lAST_STEP_BUTTON),
				Enter.theValue(password).into(JoinPage.INPUT_PASSWORD),
				Enter.theValue(confirm).into(JoinPage.INPUT_CONFIRM),
				Click.on(JoinPage.CHECK_CONDUCT),
				Click.on(JoinPage.CHECK_PRIVACY),
				Click.on(JoinPage.COMPLETE_BUTTON)
	);
		
	}



}
