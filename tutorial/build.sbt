enablePlugins(ScalaJSPlugin)

name := "Scala.js Tutorial"

scalaVersion := "2.11.7" // or any other Scala version >= 2.10.2

// Bruker JQuery istedenfor DOM direkte
libraryDependencies += "be.doeraene" %%% "scalajs-jquery" % "0.8.0"

// The Scala.js sbt plugin provides a mechanism for libraries to declare the plain JavaScript libraries they depend on
// and bundle them in a single file. All you have to do is activate this and then include the file in the HTML.
// After reloading and rerunning fastOptJS, this will create scala-js-tutorial-jsdeps.js containing all JavaScript
// libraries next to the main JavaScript file. We can then simply include this file and don't need to worry about
// JavaScript libraries anymore.
skip in packageJSDependencies := false