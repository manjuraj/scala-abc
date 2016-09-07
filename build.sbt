name := "abc"

version := "1.0.0"

organization := "com.example"

scalaVersion := "2.10.6"

val configVersion = "1.2.1"

val utilVersion = "6.34.0"

val finagleVersion = "6.35.0"

val scalazVersion = "7.2.5"

libraryDependencies ++= List(
  // typesafe config
  "com.typesafe" % "config" % configVersion,
  // twitter util-*
  "com.twitter" %% "util-core" % utilVersion,
  "com.twitter" %% "util-app" % utilVersion,
  "com.twitter" %% "util-logging" % utilVersion,
  // finagle
  "com.twitter" %% "finagle-core" % finagleVersion,
  // scalaz
  "org.scalaz" %% "scalaz-core" % scalazVersion
)

resolvers ++= List(
  "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/",
  "Typesafe Snapshots" at "http://repo.typesafe.com/typesafe/snapshots/",
  "Twitter" at "http://maven.twttr.com",
  Resolver.mavenLocal
)

scalacOptions ++= List(
  "-deprecation",
  "-feature",
  "-unchecked"
)
