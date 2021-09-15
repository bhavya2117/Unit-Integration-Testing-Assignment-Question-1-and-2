package CheckEmailID

import org.scalatest.funsuite.AnyFunSuite

class CheckEmailTest extends AnyFunSuite{

  val email = new CheckEmail
  test("Check Recipient's Name that it does not contain special characters"){

    val expectedValue = true
    val result = email.recipientName("bhavyagarg1228@gmail.com")
    assert(result == expectedValue)
  }

  test("Recipient's Name with Special Characters throw Illegal Argument Exception"){

    intercept[IllegalArgumentException]{
      email.recipientName("bhavya288?@gmail.com")
    }
  }


  test("Check '@' Symbol is present in the Email ID"){

    val expectedValue= true
    val result = email.checkAtTheRate("bhavyagarg1228@gmail.com")
    assert(result == expectedValue)
  }


  test("Email ID without '@' throws Illegal Argument Exception"){

    intercept[IllegalArgumentException]{
      email.checkAtTheRate("bhavyagarg1228gmail.com")
    }
  }


  test("Check that Domain Name does not contain special characters"){

    val expectedValue= true
    val result = email.domainName("bhavyagarg1228@gmail.com")
    assert(result == expectedValue)
  }


  test("Domain Name with Special Characters throws Illegal Argument Exception"){

    intercept[IllegalArgumentException]{
      email.domainName("bhavyagarg1228@gmail#23333.com")
    }
  }


  test("Check Top Level Domains are .com/.net/.org"){

    val expectedValue= true
    val result = email.topLevelDomain("bhavyagarg1228@gmail.com")
    assert(result == expectedValue)
  }

  test("If Top Level Domain is not .net/.org/.com it throws Illegal Argument Exception"){

    intercept[IllegalArgumentException]{
      email.topLevelDomain("bhavyagarg1228@gmail.co.in")
    }
  }
}
