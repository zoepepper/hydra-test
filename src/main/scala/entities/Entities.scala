package entities

import java.util.UUID

trait Entity {
  self =>

  val id: UUID
  override def hashCode(): Int = id.hashCode
  override def equals(obj: scala.Any): Boolean =
    obj != null && obj.getClass == self.getClass && obj.asInstanceOf[SomeEntity].id == id
}

case class SomeEntity(id: UUID, resources: Map[Resource, ResourceStatus] = Map()) extends Entity
