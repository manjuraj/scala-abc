lazy val root = Project(id = "abc", base = file("."))
  .settings(
    name := "abc",
    version := "1.0.0",
    organization := "com.example",
    scalaVersion := "2.11.11",
    libraryDependencies ++= List(
      "com.typesafe" % "config" % versions.config,
      "com.twitter" %% "util-core" % versions.util,
      "com.twitter" %% "util-app" % versions.util,
      "com.twitter" %% "util-logging" % versions.util,
      "com.twitter" %% "finagle-core" % versions.finagle,
      "org.scalaz" %% "scalaz-core" % versions.scalaz
    ),
    resolvers ++= {
      val typesafeUrl = "http://repo.typesafe.com/typesafe"
      List(
        Resolver.mavenLocal,
        "Typesafe Releases" at s"$typesafeUrl/releases/",
        "Typesafe Snapshots" at s"$typesafeUrl/snapshots/"
      )
    },
    scalacOptions ++= List(
      "-deprecation",
      "-encoding", "UTF-8",
      "-feature",
      "-language:existentials",
      "-language:higherKinds",
      "-language:implicitConversions",
      "-unchecked",
      "-Xfatal-warnings",
      //"-Xlint",
      //"-Yno-adapted-args",
      "-Ywarn-dead-code",
      //"-Ywarn-value-discard",
      "-Xfuture"
      //"-Yno-predef"
      //"-Yno-imports"
    )
  )

lazy val versions = new {
  val config = "1.3.2"
  val util = "17.11.0"
  val scalaz = "7.2.17"
  val finagle = "17.11.0"
}
