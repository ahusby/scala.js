package tutorial.webapp

import org.scalajs.jquery.jQuery

import scala.scalajs.js.JSApp

object TutorialApp extends JSApp {
  def main(): Unit = {
    jQuery(setupUI _)
  }

  def setupUI(): Unit = {
    jQuery("body").append("<p>Hello World</p>")

    jQuery("""<p><a href="http://localhost:8080/ping">ping</a></p>""")
      .appendTo(jQuery("body"))

    jQuery("""<button type="button">Click me</button>""")
      .click(addClickedMessage _)
      .appendTo(jQuery("body"))

  }

  def addClickedMessage(): Unit = {
    jQuery("body").append("<p>Button was clicked</p>")
  }
}
