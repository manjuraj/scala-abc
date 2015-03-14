name := "abc"

version := "1.0.0"

organization := "com.example"

scalaVersion := "2.10.4"

val scalazVersion = "7.1.1"

val configVersion = "1.2.1"

val utilVersion = "6.23.0"

libraryDependencies ++= Seq(
  // typesafe config
  "com.typesafe" % "config" % configVersion,
  // twitter util-*
  "com.twitter" % "util-core_2.10" % utilVersion,
  "com.twitter" % "util-app_2.10" % utilVersion,
  "com.twitter" % "util-logging_2.10" % utilVersion,
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
