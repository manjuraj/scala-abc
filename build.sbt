name := "abc"

version := "1.0.0"

organization := "com.example"

scalaVersion := "2.10.5"

val configVersion = "1.2.1"

val scalazVersion = "7.1.3"

val utilVersion = "6.24.0"

val finagleVersion = "6.25.0"

libraryDependencies ++= Seq(
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

resolvers ++= Seq(
  "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/",
  "Typesafe Snapshots" at "http://repo.typesafe.com/typesafe/snapshots/",
  "Twitter" at "http://maven.twttr.com",
  Resolver.mavenLocal
)

scalacOptions ++= Seq(
  "-deprecation",
  "-feature",
  "-unchecked"
)
