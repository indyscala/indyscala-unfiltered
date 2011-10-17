package com.example

import unfiltered.request._
import unfiltered.response._

object App extends unfiltered.filter.Plan {
  def intent = traitors orElse {
    case Path("/hello/Ross") => ResponseString("Hello, Ross!")
    case Path("/hello/Patrick") => ResponseString("Hello, Patrick!")
    case Path("/hello/Cody") => ResponseString("Hello, Cody!")
    case Path("/hello/Michael") => ResponseString("Hello, Michael!")
    case Path("/hello/Dan") => ResponseString("Hello, Dan!")
  }

  def traitors: unfiltered.filter.Plan.Intent = {
    case Path("/hello/JR") => ResponseString("TRAITOR!")
  }
}

object Server {
  def main(args: Array[String]) {
    unfiltered.jetty.Http(8080).filter(App).run()
  }
}
