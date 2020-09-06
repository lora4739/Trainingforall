package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
	
	@RunWith(Cucumber.class)
	public class stepDefination{

		    @Given("^User is in on Landing page$")
		    public void user_is_in_on_landing_page() throws Throwable {
		    	
		    	//code to navigate the url
		        
		    }

		    @When("^use login the application with username and password$")
		    public void use_login_the_application_with_username_and_password() throws Throwable {
		    	//code to login
		    	System.out.println("successfully logged into the application");
		       
		    }

		    @Then("^Home page is populated$")
		    public void home_page_is_populated() throws Throwable {
		       //Home page validations
		    	
		    	System.out.println("Landed in the homepage");
		    }

		    @And("^cards are displayed$")
		    public void cards_are_displayed() throws Throwable {
		    	
		    	//card validation
		    	
		    	System.out.println("card information is displayed");
		        
		    }

		
		
		
		

	}


