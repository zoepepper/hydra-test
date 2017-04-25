package entities

import java.time.Instant
import enumeratum._

sealed trait Resource extends EnumEntry
object Resource extends Enum[Resource] {
  val values = findValues

  case object SomeResource extends Resource
}

case class ResourceStatus(requested: Instant = Instant.now, granted: Option[Instant] = None)
