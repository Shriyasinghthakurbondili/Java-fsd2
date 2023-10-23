package steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DataTableDemo {
	WebDriver driver;

@Given("User is on Create Account Page")
public void user_is_on_create_account_page() {
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%3ASign+up&returntoquery=centralAuthAutologinTried%3D1%26centralAuthError%3DNot%2Bcentrally%2Blogged%2Bin");
}

@Then("User enters following details")
public void user_enters_following_details(io.cucumber.datatable.DataTable dataTable) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
    
	//fetch the data from the table
	List<List<String>> userList = dataTable.asLists(String.class);
	
	for(List<String> e : userList)
	{
		driver.findElement(By.xpath("(//div[@class='cdx-text-input'])[1]/descendant::input")).clear();
		driver.findElement(By.xpath("(//div[@class='cdx-text-input'])[1]/descendant::input")).sendKeys(e.get(0));
		driver.findElement(By.xpath("(//div[@class='cdx-text-input'])[2]/descendant::input")).clear();
		driver.findElement(By.xpath("(//div[@class='cdx-text-input'])[2]/descendant::input")).sendKeys(e.get(1));
		driver.findElement(By.xpath("(//div[@class='cdx-text-input'])[3]/descendant::input")).clear();
		driver.findElement(By.xpath("(//div[@class='cdx-text-input'])[3]/descendant::input")).sendKeys(e.get(2));
		driver.findElement(By.xpath("(//div[@class='cdx-text-input'])[4]/descendant::input")).clear();
		driver.findElement(By.xpath("(//div[@class='cdx-text-input'])[4]/descendant::input")).sendKeys(e.get(3));
	}
}

@Then("Account creation is successfull")
public void account_creation_is_successfull() {
    driver.close();
}

@Then("User enters following details using column name")
public void datatabledemoMaps(DataTable dataTable) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
   //fetch the entire data table
	List<Map<String, String>> userList = dataTable.asMaps(String.class, String.class);
	
	for(Map<String, String> e : userList)
	{
		driver.findElement(By.xpath("(//div[@class='cdx-text-input'])[1]/descendant::input")).clear();
		driver.findElement(By.xpath("(//div[@class='cdx-text-input'])[1]/descendant::input")).sendKeys(e.get("Username"));
		driver.findElement(By.xpath("(//div[@class='cdx-text-input'])[2]/descendant::input")).clear();
		driver.findElement(By.xpath("(//div[@class='cdx-text-input'])[2]/descendant::input")).sendKeys(e.get("Password"));
		driver.findElement(By.xpath("(//div[@class='cdx-text-input'])[3]/descendant::input")).clear();
		driver.findElement(By.xpath("(//div[@class='cdx-text-input'])[3]/descendant::input")).sendKeys(e.get("Retype"));
		driver.findElement(By.xpath("(//div[@class='cdx-text-input'])[4]/descendant::input")).clear();
		driver.findElement(By.xpath("(//div[@class='cdx-text-input'])[4]/descendant::input")).sendKeys(e.get("Email ID"));
	}
	
	
	

}
}
