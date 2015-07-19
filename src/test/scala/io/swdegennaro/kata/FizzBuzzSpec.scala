package io.swdegennaro.kata

import org.scalatest.{Matchers, FlatSpec}

class FizzBuzzSpec extends FlatSpec with Matchers {

	"FizzBuzz" should "return fizz if the number is devisible by 3" in {
		FizzBuzz.getResult(3) should be ("fizz")
		FizzBuzz.getResult(6) should be ("fizz")		
	}

	it should "return buzz if the number is devisible by 5" in {
		FizzBuzz.getResult(5) should be ("buzz")
		FizzBuzz.getResult(10) should be ("buzz")
	}

	it should "return fizzbuzz if the number is devisible by 5 and 3" in {
		FizzBuzz.getResult(15) should be ("fizzbuzz")	
		FizzBuzz.getResult(30) should be ("fizzbuzz")	
	}

	it should "return the number if there is no match" in {
		FizzBuzz.getResult(7) should be ("7")
	}
}
