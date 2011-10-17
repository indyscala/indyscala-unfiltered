organization := "com.rossabaker.indyscala"

name := "unfiltered-demo"

version := "2011.10"

libraryDependencies ++= Seq(
   "net.databinder" %% "unfiltered-filter" % "0.5.0",
   "net.databinder" %% "unfiltered-jetty" % "0.5.0",
   "org.clapper" %% "avsl" % "0.3.1"
)

resolvers ++= Seq(
  "java m2" at "http://download.java.net/maven/2"
)
