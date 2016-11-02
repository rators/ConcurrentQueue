name := """ConcurrentTrains"""

version := "1.0"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.11",
  "com.typesafe.akka" %% "akka-testkit" % "2.3.11",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test",
  "junit" % "junit" % "4.12" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test"
)

libraryDependencies += "org.scalafx" %% "scalafx" % "8.0.0-R4"

addCompilerPlugin("org.scalamacros" % "paradise" % "2.0.1" cross CrossVersion.full)

libraryDependencies += "org.scalafx" %% "scalafxml-core-sfx8" % "0.2.2"
libraryDependencies += "commons-io" % "commons-io" % "2.4"
enablePlugins(JmhPlugin)
testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")


