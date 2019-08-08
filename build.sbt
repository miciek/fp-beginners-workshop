lazy val root = (project in file("."))
  .settings(
    name := "fp-beginners-workshop",
    organization := "Michał Płachta",
    version := "1.0",
    scalaVersion := "2.13.0",
    scalacOptions ++= List(
      "-unchecked",
      "-Xfatal-warnings",
      "-language:higherKinds",
      "-Xlint"
    ),
    fork in run := true,
    javaOptions in run += "-ea",
    compile in Compile := (compile in Compile).dependsOn(scalafmt in Compile).dependsOn(scalafmtSbt in Compile).value
  )
