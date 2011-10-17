package com.example

import unfiltered.request._
import unfiltered.response._

object App extends unfiltered.filter.Plan {
  def intent = traitors orElse {
    case Path(Seg("hello" :: name :: Nil)) => ResponseString("Hello, "+name)
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
