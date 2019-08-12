name := "ScalaSample"

version := "0.1"

scalaVersion := "2.13.0"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8"
libraryDependencies += "org.seleniumhq.selenium" % "selenium-java" % "3.141.59"
libraryDependencies += "org.pegdown" % "pegdown" % "1.6.0"
testOptions in Test += Tests.Argument(TestFrameworks.ScalaTest, "-h", "target/test-reports")


