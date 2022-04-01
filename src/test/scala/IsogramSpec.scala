import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class IsogramSpec extends AnyFlatSpec with should.Matchers {

  "Isogram" should "check if a word or phrase without a repeating letter, " +
                   "however spaces and hyphens are allowed to appear multiple times." in {
    import Isogram._
    isIsogram("abcde") shouldBe true
    isIsogram("abcdeabc") shouldBe false
    isIsogram("a-b-c-d") shouldBe true
    isIsogram("ab-cd-e zx rt") shouldBe true

  }

}
