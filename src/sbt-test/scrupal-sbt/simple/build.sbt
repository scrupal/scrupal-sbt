import scrupal.sbt.ScrupalPlugin.autoImport._

name := "hello-test"

version := "0.1"

scalaVersion := "2.11.6"

enablePlugins(ScrupalPlugin)

codePackage := "scrupal.sbt"

copyrightHolder := "Reactific Software LLC"

copyrightYears := Seq(2014,2015)

developerUrl := new URL("https://github.com/reid-spencer")

titleForDocs := "Scrupal SBT Test For Projects"

