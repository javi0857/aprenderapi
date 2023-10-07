package tfg.javi.aprenderapi

import org.scalatest._
import org.scalatest.Matchers._

final class AprenderapiTest extends WordSpec with GivenWhenThen {
  "Aprenderapi" should {
    "greet" in {
      Given("a Aprenderapi")

      val aprenderapi = new Aprenderapi

      When("we ask him to greet someone")

      val nameToGreet = "CodelyTV"
      val greeting = aprenderapi.greet(nameToGreet)

      Then("it should say hello to someone")

      greeting shouldBe "Hello " + nameToGreet
    }
  }
}
