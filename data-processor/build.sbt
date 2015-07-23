
name := """data-processor"""

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.apache.spark"  %% "spark-core"    % "1.4.1"
)

resolvers += "Akka Repository" at "http://repo.akka.io/releases/"


fork in run := true
