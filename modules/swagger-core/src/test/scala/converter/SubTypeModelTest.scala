package converter

import converter.models._
import com.wordnik.swagger.converter._

import com.wordnik.swagger.core.util._
import com.wordnik.swagger.annotations.ApiModelProperty

import java.util.Date

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

import scala.reflect.BeanProperty

@RunWith(classOf[JUnitRunner])
class SubTypeModelTest extends FlatSpec with ShouldMatchers {
  it should "read a model with subTypes" in {
    val model = ModelConverters.read(classOf[Animal]).getOrElse(fail("no model found"))
    model.subTypes.size should be (2)
  }
}