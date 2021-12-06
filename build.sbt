ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.2"

lazy val root = (project in file("."))
  .settings(
    name := "UnitIntegrationTest"
  )
libraryDependencies +="org.scalatest" %% "scalatest" % "3.2.9"% Test
libraryDependencies += "org.mockito" %% "mockito-scala" % "1.16.46" % Test
