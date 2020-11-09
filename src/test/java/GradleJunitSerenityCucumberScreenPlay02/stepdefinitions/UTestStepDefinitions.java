package GradleJunitSerenityCucumberScreenPlay02.stepdefinitions;

import java.util.List;

import GradleJunitSerenityCucumberScreenPlay02.model.UTestData;
import GradleJunitSerenityCucumberScreenPlay02.questions.Answer;
import GradleJunitSerenityCucumberScreenPlay02.task.Join;
import GradleJunitSerenityCucumberScreenPlay02.task.Login;
import GradleJunitSerenityCucumberScreenPlay02.task.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class UTestStepDefinitions {
	
	@Before
	public void setStage() {
		OnStage.setTheStage(new OnlineCast());
	}
	@Given("^than Fanny wants to join to UTest$")
	public void thanFannyWantsToJoinToUTest() {
		OnStage.theActorCalled("Fanny").wasAbleTo(OpenUp.thePage());
	}
	
	@When("^she creates a new user on the UTest platform$")
	public void sheCreatesANewUserOnTheUTestPlatform(List<UTestData> uTestData) throws InterruptedException {
		OnStage.theActorCalled("Fanny").wasAbleTo(Join.theUser(
				uTestData.get(0).getFirstName(),
				uTestData.get(0).getLastName(),
				uTestData.get(0).getEmail(),
				uTestData.get(0).getMonth(),
				uTestData.get(0).getDay(),
				uTestData.get(0).getYear(),
				//uTestData.get(0).getCity(),
				uTestData.get(0).getPost(),
				uTestData.get(0).getPassword(),
				uTestData.get(0).getConfirm()				
				));
		Thread.sleep(100000);
	}
	@Then("^she finish$")
	public void shefinish() {
		
	}
	
	@Then("^she login with the new user$")
	public void sheLoginWithTheNewUser(List<UTestData> uTestData) throws InterruptedException {
		OnStage.theActorCalled("Fanny").wasAbleTo(Login.
				WithUser(uTestData.get(0).getUser(),uTestData.get(0).getPassword()));
	

	}
	
	@And("^she confirms successful creation of the new user$")
	public void sheConfirmsSuccessfulCreation(List<UTestData> uTestData) {
		OnStage.theActorInTheSpotlight().should(GivenWhenThen.
				seeThat(Answer.toThe(uTestData.get(0).getUser())));
	}

}
