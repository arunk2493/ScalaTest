import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.scalatest.{BeforeAndAfterAll, FeatureSpec, GivenWhenThen, Matchers}
import org.scalatest.selenium.WebBrowser

class ScalaFeatures2 extends FeatureSpec with Matchers with WebBrowser with GivenWhenThen with BeforeAndAfterAll {

  implicit val webDriver: WebDriver = new ChromeDriver()

  val host = "https://github.com"

  info("Git Hub")

  feature("Git Hub Credentials") {

    scenario("Login To Git Hub") {
      val userName: String = "arunk2493"
      val passWord: String = "Welcome@24-93"
      Given("User is on GitHub Login Page")
      goTo(host)
      When("User clicks on sign in")
      click on partialLinkText("Sign in")
      When("User enters the username and password")
      click on id("login_field")
      enter(userName)
      click on id("password")
      enter(passWord)
      Then("Clicks on Sign In Button")
      click on name("commit")
      Then("Verify the user Login")
      val txtUser = xpath("//*[@class='public source ']/div/a/span").element.text
      println(txtUser)
      txtUser.shouldBe("arunk2493")
    }
  }
  override def afterAll(): Unit ={
    close();
    quit();
  }
}
