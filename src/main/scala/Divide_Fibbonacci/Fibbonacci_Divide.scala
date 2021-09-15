package Divide_Fibbonacci

import scala.collection.mutable.ListBuffer

class Fibbonacci_Divide extends Divide with Fibbonacci {

  @Override
  override def divide(divisor: Int, dividend: Int) = divisor / dividend

  @Override
  override def fibbonacci(numberOfTerms: Int): ListBuffer[Int] = {

    if (numberOfTerms < 0) throw new IllegalArgumentException("Negative number of Terms are not Allowed ")

    var first_number: Int = 0
    var second_number: Int = 1
    var sum: Int = 0
    val fibbonacciSeries = new ListBuffer[Int]
    if (numberOfTerms == 1) return (fibbonacciSeries += first_number)

    fibbonacciSeries += (first_number, second_number)
    if (numberOfTerms == 2) return fibbonacciSeries
    for (i <- 3 to numberOfTerms) {

      sum = first_number + second_number
      fibbonacciSeries.append(sum)
      first_number = second_number
      second_number = sum
    }

    fibbonacciSeries
  }


}

