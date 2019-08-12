import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.{WebDriver, WebElement}
import org.scalatest.FlatSpec
import org.scalatest.selenium.WebBrowser

class ReusableMethods extends FlatSpec with WebBrowser {

  /*implicit val webDriver: WebDriver = new ChromeDriver()

  def launchURL(url:String) : Unit={
    goTo(url)
  }

  def launchBrowse() : WebDriver = {

    return webDriver
  }

  def clickElementXpath(value:String) : Unit = {

    click on xpath(value)
  }
*/
}
