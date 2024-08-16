package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.DriverConfig;

public class TreeSteps {

	private final WebDriver driver = DriverConfig.getDriver();

	@When("user clicks on get started button in tree module")
	public void user_clicks_on_get_started_button_in_tree_module() {
		driver.findElement(By.xpath("//a[@href='tree']")).click();
	}

	@Then("user is navigated to tree homepage")
	public void user_is_navigated_to_tree_homepage() {
		Assert.assertEquals(driver.getTitle(), "Tree");

	}

	@When("user clicks on Overview of Trees link")
	public void user_clicks_on_overview_of_trees_link() {
		driver.findElement(By.linkText("Overview of Trees")).click();

	}

	@Then("user is on Overview of Trees homepage")
	public void user_is_on_overview_of_trees_homepage() {
		Assert.assertEquals(driver.getTitle(), "Overview of Trees");

	}

	@When("user clicks on Terminologies link")
	public void user_clicks_on_terminologies_link() {
		driver.findElement(By.linkText("Terminologies")).click();

	}

	@Then("user is on Terminologies homepage")
	public void user_is_on_terminologies_homepage() {
		Assert.assertEquals(driver.getTitle(), "Terminologies");

	}

	@When("user clicks on Types of Trees link")
	public void user_clicks_on_types_of_trees_link() {
		driver.findElement(By.linkText("Types of Trees")).click();
	}

	@Then("user is on Types of Trees homepage")
	public void user_is_on_types_of_trees_homepage() {
		Assert.assertEquals(driver.getTitle(), "Types of Trees");

	}

	@When("user clicks on Tree Traversals link")
	public void user_clicks_on_tree_traversals_link() {
		driver.findElement(By.linkText("Tree Traversals")).click();

	}

	@Then("user is on Tree Traversals homepage")
	public void user_is_on_tree_traversals_homepage() {
		Assert.assertEquals(driver.getTitle(), "Tree Traversals");
	}

	@When("user clicks on Traversals-Illustration link")
	public void user_clicks_on_traversals_illustration_link() {
		driver.findElement(By.linkText("Traversals-Illustration")).click();

	}

	@Then("user is on Traversals-Illustration homepage")
	public void user_is_on_traversals_illustration_homepage() {
		Assert.assertEquals(driver.getTitle(), "Traversals-Illustration");
	}

	@When("user clicks on Binary Trees link")
	public void user_clicks_on_binary_trees_link() {
		driver.findElement(By.linkText("Binary Trees")).click();
	}

	@Then("user is on Binary Trees homepage")
	public void user_is_on_binary_trees_homepage() {
		Assert.assertEquals(driver.getTitle(), "Binary Trees");
	}

	@When("user clicks on Types of Binary Trees link")
	public void user_clicks_on_types_of_binary_trees_link() {
		driver.findElement(By.linkText("Types of Binary Trees")).click();

	}

	@Then("user is on Types of Binary Trees homepage")
	public void user_is_on_types_of_binary_trees_homepage() {
		Assert.assertEquals(driver.getTitle(), "Types of Binary Trees");
	}

	@When("user clicks on Implementation in Python link")
	public void user_clicks_on_implementation_in_python_link() {
		driver.findElement(By.linkText("Implementation in Python")).click();

	}

	@Then("user is on Implementation in Python homepage")
	public void user_is_on_implementation_in_python_homepage() {
		Assert.assertEquals(driver.getTitle(), "Implementation in Python");

	}

	@When("user clicks on Binary Tree Traversals link")
	public void user_clicks_on_binary_tree_traversals_link() {
		driver.findElement(By.linkText("Binary Tree Traversals")).click();
	}

	@Then("user is on Binary Tree Traversals homepage")
	public void user_is_on_binary_tree_traversals_homepage() {
		Assert.assertEquals(driver.getTitle(), "Binary Tree Traversals");

	}

	@When("user clicks on Implementation of Binary Trees link")
	public void user_clicks_on_implementation_of_binary_trees_link() {
		driver.findElement(By.linkText("Implementation of Binary Trees")).click();
	}

	@Then("user is on Implementation of Binary Trees homepage")
	public void user_is_on_implementation_of_binary_trees_homepage() {
		Assert.assertEquals(driver.getTitle(), "Implementation of Binary Trees");

	}

	@When("user clicks on Applications of Binary trees link")
	public void user_clicks_on_applications_of_binary_trees_link() {
		driver.findElement(By.linkText("Applications of Binary trees")).click();
	}

	@Then("user is on Applications of Binary trees homepage")
	public void user_is_on_applications_of_binary_trees_homepage() {
		Assert.assertEquals(driver.getTitle(), "Applications of Binary trees");
	}

	@When("user clicks on Binary Search Trees link")
	public void user_clicks_on_binary_search_trees_link() {
		driver.findElement(By.linkText("Binary Search Trees")).click();
	}

	@Then("user is on Binary Search Trees homepage")
	public void user_is_on_binary_search_trees_homepage() {
		Assert.assertEquals(driver.getTitle(), "Binary Search Trees");
	}

	@When("user clicks on Implementation Of BST link")
	public void user_clicks_on_implementation_of_bst_link() {
		driver.findElement(By.linkText("Implementation Of BST")).click();
	}

	@Then("user is on Implementation Of BST homepage")
	public void user_is_on_implementation_of_bst_homepage() {
		Assert.assertEquals(driver.getTitle(), "Implementation Of BST");
	}

}
