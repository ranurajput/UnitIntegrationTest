import org.scalatest.funsuite.AnyFunSuite
import emailValidation.EmailValidation
class EmailValidationTest extends AnyFunSuite {
  var emailobj = new EmailValidation

  test("Without name of Recipient.."){
    assert(!emailobj.emailIsValid("@gmail.com"))}

    test("Without @ in the email.."){
      assert(!emailobj.emailIsValid("ranu.rajput.gmail.com"))
    }

    test("Without domain name.."){
      assert(!emailobj.emailIsValid("ranu.rajput@"))
    }

    test("Other domain name than .com|.net|.org .. "){
      assert(!emailobj.emailIsValid("ranu.rajput@yahoo.in"))
    }

    test("Correct one uppercase.."){
      assert(emailobj.emailIsValid("RANU.RAJPUT@YAHOO.COM"))
    }

    test("Correct one lowercase"){
      assert(emailobj.emailIsValid("ranu.rajput@yahoo.com"))
    }


  }
