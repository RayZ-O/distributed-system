jarName in assembly := "project2.jar"

name := "GossipSimulator"

version := "1.0"

scalaVersion := "2.11.7"

scalacOptions ++= Seq("-feature")

libraryDependencies ++= Seq(
    "com.typesafe.akka" %% "akka-actor" % "2.3.14",
    "com.typesafe.akka" %% "akka-remote" % "2.3.14"
)







