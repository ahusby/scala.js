package tutorial.webapp

import org.scalajs.jquery.jQuery

import scala.scalajs.js.JSApp

object TutorialApp extends JSApp {
  def main(): Unit = {
    jQuery(setupUI _)
  }

  def setupUI(): Unit = {
    jQuery("#click-me-button").click(addClickedMessage _)
    jQuery("body").append("<p>Hello World</p>")
  }

  def addClickedMessage(): Unit = {
    jQuery("body").append("<p>Button was clicked</p>")
  }
}
