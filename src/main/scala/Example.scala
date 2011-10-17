package com.example

import unfiltered.request._
import unfiltered.response._

object App extends unfiltered.filter.Plan {
  def intent = traitors orElse {
    case req @ Path(Seg("hello" :: name :: Nil)) => req match {
      case GET(_) => ResponseString("Got "+name)
      case PUT(_) => ResponseString("Put "+name)
    }
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
