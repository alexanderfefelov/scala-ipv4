name := "scala-ipv4"

organization := "be.jvb.scala-ipv4"

scalaVersion := "2.10.6"

logLevel := Level.Info

parallelExecution in Test := true

libraryDependencies ++= Seq(
	"org.scalatest" %% "scalatest" % "2.2.4" % "test",
	"org.scalacheck" %% "scalacheck" % "1.12.5" % "test",
	"junit" % "junit" % "4.6" % "test"
)

//publishTo <<= (version) { version: String =>
//  val cse  = "http://192.168.128.191:8081/artifactory/"
//  if (version.trim.endsWith("SNAPSHOT")) Some("snapshots" at cse + "libs-snapshot-local/") 
//  else                                   Some("releases"  at cse + "libs-release-local/")
//}

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")

// disable publishing the main doc jar
//publishArtifact in (Compile, packageDoc) := false

// disable publishing the main sources jar
//publishArtifact in (Compile, packageSrc) := false

