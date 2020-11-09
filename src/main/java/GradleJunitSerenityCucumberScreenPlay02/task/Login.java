package GradleJunitSerenityCucumberScreenPlay02.task;

import GradleJunitSerenityCucumberScreenPlay02.userinterface.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task{
	private String user;
	private String password;

	public Login(String user, String password) {
		this.user = user;
		this.password = password;
	}

	
	public static Login WithUser(String user, String password) {
		return Tasks.instrumented(Login.class,user,password);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(
				
				Click.on(LoginPage.LOGIN_BUTTON),
				Enter.theValue(user).into(LoginPage.INPUT_USER_NAME),
				Enter.theValue(password).into(LoginPage.INPUT_PASSWORD),
				Click.on(LoginPage.SIGN_IN_BUTTON)
				);

	}

}
