package com.example

import org.scalatest.matchers.ShouldMatchers
import org.scalatest._

class AppSpec extends FlatSpec with ShouldMatchers {
  "A test" should "just work" in {
    val persona = new Apodo("Tomás", "Lázaro", "Tom")
    persona.nombre should equal ("Tomás")
    persona.getApellido should equal ("Lázaro")
    persona.apodo should equal ("Tom")
  }
  
  it should "catch exceptions" in {
    intercept[IndexOutOfBoundsException] {
      val list = List(1,2,3,4,5)
      val head = list(-1)
    }
  }
  
  it should "fail" in {
    fail("I don't want to work.")
  }
}