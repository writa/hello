lazy val root = (project in file(".")).settings(
  name := "hello",
  version := "0.1.0",
  scalaVersion := "2.11.7"
)

libraryDependencies += "io.spray" %% "spray-routing" % "1.3.3"
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.11"
libraryDependencies += "io.spray" %% "spray-can" % "1.3.3"
