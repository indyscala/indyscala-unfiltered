organization := "com.rossabaker.indyscala"

name := "unfiltered-demo"

version := "2011.10"

scalaVersion := "2.9.1"

libraryDependencies ++= Seq(
   "net.databinder" %% "unfiltered" % "0.5.1",
   "net.databinder" %% "unfiltered-filter" % "0.5.1",
   "net.databinder" %% "unfiltered-jetty" % "0.5.1",
   "org.clapper" %% "avsl" % "0.3.6"
)

resolvers ++= Seq(
  "java m2" at "http://download.java.net/maven/2"
)
