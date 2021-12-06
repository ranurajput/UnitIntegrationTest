package com.knoldus.db

import com.knoldus.models.Company

import scala.collection.immutable.HashMap

class CompanyReadDto {

  val knoldusCompany: Company = Company("Knoldus", "knoldus@gmail.com", "Noida")
  val infosysCompany: Company = Company("Infosys", "infosys123@gmail.com", "Noida")
  val companies: HashMap[String, Company] = HashMap("Knoldus" -> knoldusCompany, "Infosys" -> infosysCompany)

  def getCompanyByName(name: String): Option[Company] = companies.get(name)

}
