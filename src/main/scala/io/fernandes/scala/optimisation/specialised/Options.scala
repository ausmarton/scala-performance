package io.fernandes.scala.optimisation.specialised

import scala.util.Random

sealed trait ID

case class Passport(passportNumber: Int) extends ID
case class CitizenCard(citizenCardNumber: Int) extends ID
case class DrivingLicence(drivingLicenceNumber: Int) extends ID

object Options {
  def main(args: Array[String]): Unit = {
    val numberOfDocs = 1000000
    val ids = List.fill(numberOfDocs)(Passport(passportNumber = Random.nextInt)) :::
      List.fill(numberOfDocs)(CitizenCard(citizenCardNumber = Random.nextInt)) :::
      List.fill(numberOfDocs)(DrivingLicence(drivingLicenceNumber = Random.nextInt))


    println(ids.length)
  }
}
