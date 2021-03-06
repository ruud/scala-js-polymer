// Turn this project into a Scala.js project by importing these settings
enablePlugins(ScalaJSPlugin)

name := "ScalaJSPolymer"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.8"

persistLauncher in Compile := true

persistLauncher in Test := false

testFrameworks += new TestFramework("utest.runner.Framework")

resolvers += Resolver.sonatypeRepo("releases")

libraryDependencies ++= Seq(
    "org.scala-js" %%% "scalajs-dom" % "0.9.1",
    "com.lihaoyi" %%% "utest" % "0.4.3" % "test",
    "com.softwaremill.macwire" %% "macros" % "2.2.3",
    "eu.unicredit" %%% "akkajsactor" % "0.2.4.10",
    "com.lihaoyi" %%% "scalatags" % "0.6.0"
)
