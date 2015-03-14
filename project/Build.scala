import sbt._
import Keys._
import sbtbuildinfo.Plugin._
import net.virtualvoid.sbt.graph.Plugin._
import java.text.{DateFormat, SimpleDateFormat}
import java.util.{Date, TimeZone};

object Abc extends Build {
  lazy val root = Project(
    id = "abc",
    base = file("."),
    settings = Defaults.defaultSettings ++
      buildInfoSettings ++
      Seq(
        sourceGenerators in Compile <+= buildInfo,
        buildInfoKeys := Seq[BuildInfoKey](
          name,
          version,
          BuildInfoKey.action("builtOn") {
            val d = new Date
            val df = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss z")
            df.setTimeZone(TimeZone.getTimeZone("UTC"))
            df.format(d)
          }
        ),
        buildInfoPackage := "com.example"
      ) ++
      graphSettings
  )
}
