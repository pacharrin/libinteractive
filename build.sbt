name := "libinteractive"

version := "0.1"

organization := "omegaup"

scalaVersion := "2.10.3"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")

exportJars := true

packageOptions in (Compile, packageBin) +=
    Package.ManifestAttributes( java.util.jar.Attributes.Name.MAIN_CLASS -> "com.omegaup.libinteractive.Main" )

libraryDependencies ++= Seq(
	"org.scalatest" %% "scalatest" % "2.2.1" % "test"
)
