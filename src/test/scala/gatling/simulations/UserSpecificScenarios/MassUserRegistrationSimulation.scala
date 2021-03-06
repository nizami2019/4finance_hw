package gatling.simulations.UserSpecificScenarios

import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder
import io.gatling.http.Predef._
import net.liftweb.json.Serialization.write
import net.liftweb.json._

import scala.concurrent.duration._
import scala.language.postfixOps
import scala.util.Random

object MassUserRegistrationSimulation extends Simulation {

  val testTimeSecs = 5
  val minWaitMs: FiniteDuration = 100 milliseconds
  val maxWaitMs: FiniteDuration = 300 milliseconds

  val baseName = "loanapi-user-registration"
  val requestName: String = baseName + "-request"
  val scenarioName: String = baseName + "-scenario"
  val URI = "/api/v1/user"

  case class User(firstname: String, lastname: String, address: String, email: String, phone: String)
  implicit val formats: DefaultFormats.type = DefaultFormats
  val r: Random.type = scala.util.Random
  val randNum = System.currentTimeMillis().toString + r.nextInt()

  val userAsJson: String = write(User("George", "Bush", "Washington street 1", "george.bush." + randNum + "@gmail.com", "123123123"))

  val registrationScn: ScenarioBuilder = scenario(scenarioName)
    .during(testTimeSecs) {
      exec(
        http(requestName)
          .post(URI)
          .body(StringBody(userAsJson.stripMargin))
          .check(status.is(201))
      ).pause(minWaitMs, maxWaitMs)
    }
}
