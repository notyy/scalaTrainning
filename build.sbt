lazy val root = (project in file("."))
  .settings(
    name := "scalaTrainning",
    scalaVersion := "2.12.2",
    organization := "com.github.notyy",
    version := "0.1.0-SNAPSHOT"
  )

libraryDependencies ++= Seq(
  "org.scalacheck" %% "scalacheck" % "1.13.4" % "test",
  "org.pegdown" % "pegdown" % "1.6.0" % "test", //used in html report
  "org.scalatest" %% "scalatest" % "3.0.1" % "test",
  "org.slf4j" % "slf4j-api" % "1.7.25",
  "com.storm-enroute" %% "scalameter" % "0.8.2" % "test",
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "com.typesafe.scala-logging" %% "scala-logging-slf4j" % "2.1.2",
  "com.h2database" % "h2" % "1.4.196",
  "com.typesafe.akka" %% "akka-actor" % "2.5.3",
  "com.typesafe.akka" %% "akka-agent" % "2.5.3",
  "com.typesafe.akka" %% "akka-camel" % "2.5.3",
  "com.typesafe.akka" %% "akka-cluster" % "2.5.3",
  "com.typesafe.akka" %% "akka-cluster-metrics" % "2.5.3",
  "com.typesafe.akka" %% "akka-cluster-sharding" % "2.5.3",
  "com.typesafe.akka" %% "akka-cluster-tools" % "2.5.3",
  "com.typesafe.akka" %% "akka-distributed-data" % "2.5.3",
  "com.typesafe.akka" %% "akka-multi-node-testkit" % "2.5.3",
  "com.typesafe.akka" %% "akka-osgi" % "2.5.3",
  "com.typesafe.akka" %% "akka-persistence" % "2.5.3",
  "com.typesafe.akka" %% "akka-persistence-query" % "2.5.3",
  "com.typesafe.akka" %% "akka-persistence-tck" % "2.5.3",
  "com.typesafe.akka" %% "akka-remote" % "2.5.3",
  "com.typesafe.akka" %% "akka-slf4j" % "2.5.3",
  "com.typesafe.akka" %% "akka-stream" % "2.5.3",
  "com.typesafe.akka" %% "akka-stream-testkit" % "2.5.3",
  "com.typesafe.akka" %% "akka-testkit" % "2.5.3",
  "com.typesafe.akka" %% "akka-typed" % "2.5.3",
  "com.typesafe.akka" %% "akka-contrib" % "2.5.3"
)