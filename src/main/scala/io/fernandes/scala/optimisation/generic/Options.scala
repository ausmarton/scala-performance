package io.fernandes.scala.optimisation.generic

import scala.util.Random

case class ID(passportNumber: Option[Int] = None,
              citizenCardNumber: Option[Int] = None,
              drivingLicenceNumber: Option[Int] = None)

object Options {
  def main(args: Array[String]): Unit = {
    val numberOfDocs = 1000000
    val ids = List.fill(numberOfDocs)(ID(passportNumber = Some(Random.nextInt))) :::
      List.fill(numberOfDocs)(ID(citizenCardNumber = Some(Random.nextInt))) :::
      List.fill(numberOfDocs)(ID(drivingLicenceNumber = Some(Random.nextInt)))

    println(ids.length)
  }
}
