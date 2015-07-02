import akka.actor.ActorSystem
import spray.routing.SimpleRoutingApp

object Boot extends App with SimpleRoutingApp {
  implicit val system = ActorSystem("hello-system")

  startServer(interface = "localhost", port = 8080) {
    path("hello") {
      get {
        complete {
          "Hello Spray!!"
        }
      }
    }
  }
}
