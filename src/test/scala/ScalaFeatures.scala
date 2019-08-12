import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.scalatest.selenium.WebBrowser
import org.scalatest.{BeforeAndAfterAll, FeatureSpec, FlatSpec, GivenWhenThen, Matchers}

import scala.io.Source
import scala.reflect.io.File

class ScalaFeatures extends FeatureSpec with Matchers with WebBrowser with GivenWhenThen with BeforeAndAfterAll{

  implicit val webDriver: WebDriver = new ChromeDriver()

  val host = "https://www.wikipedia.org/"

  //protected val resultFile = "target/test-reports/index.html"

  info("Wiki Search")

  feature("Login to Wikipedia") {

    scenario("Valid Page Launch - Apple") {
      val text1:String = "Apple"
      Given("User is on Wiki Page")
      goTo(host)
      When("User Checks for the valid Page title")
      val textvalue = xpath("//strong[@class='jsl10n localized-slogan']").element.text
      println("the value is: " + textvalue)
      //value should be ("The Free Encyclopedia")
      Then("Enters A  Value")
      click on xpath("//input[@id='searchInput']")
      enter(text1)
    }

  //feature("Login to Wikipedia"){

    scenario("Valid Page Launch - Mango") {
      val text2:String = "Mango"
      Given("User is on Wiki Page")
      goTo(host)
      When("User Checks for the valid Page title")
      val textvalue = xpath("//strong[@class='jsl10n localized-slogan']").element.text
      println("the value is: " + textvalue)
      //value should be ("The Free Encyclopedia")
      Then("Enters A  Value")
      click on xpath("//input[@id='searchInput']")
      enter(text2)
    }
  }
  override def afterAll(): Unit ={
    close();
    quit();
    }
  }

