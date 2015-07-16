enablePlugins(ScalaJSPlugin)

name := "Scala.js Tutorial"

scalaVersion := "2.11.7" // or any other Scala version >= 2.10.2

// Bruker JQuery istedenfor DOM direkte
libraryDependencies += "be.doeraene" %%% "scalajs-jquery" % "0.8.0"

libraryDependencies += "com.lihaoyi" %%% "utest" % "0.3.0" % "test"
testFrameworks += new TestFramework("utest.runner.Framework")

// The Scala.js sbt plugin provides a mechanism for libraries to declare the plain JavaScript libraries they depend on
// and bundle them in a single file. All you have to do is activate this and then include the file in the HTML.
// After reloading and rerunning fastOptJS, this will create scala-js-tutorial-jsdeps.js containing all JavaScript
// libraries next to the main JavaScript file. We can then simply include this file and don't need to worry about
// JavaScript libraries anymore.
skip in packageJSDependencies := false

// To make the DOM available when running from command line or running tests
jsDependencies += RuntimeDOM

// Since the sbt plugin is able to detect the JSApp object of the application, there is no need to call themain method
// in the HTML file. If you add the following setting to your build.sbt, sbt will create a scala-js-tutorial-launcher.js
// file which calls the main method. If we rename our JSApp object, we need not change our HTML at all anymore
persistLauncher in Compile := true
persistLauncher in Test := false