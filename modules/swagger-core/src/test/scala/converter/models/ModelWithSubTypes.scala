package converter.models

import com.wordnik.swagger.annotations.ApiModel

@ApiModel(value="a model with subtypes", subTypes = Array(classOf[DomesticAnimal], classOf[WildAnimal]))
case class Animal (
  name: String,
  date: java.util.Date)

case class DomesticAnimal (
  name: String,
  safeForChildren: Boolean,
  date: java.util.Date)

case class WildAnimal (
  name: String,
  foundInLocation: String,
  date: java.util.Date)