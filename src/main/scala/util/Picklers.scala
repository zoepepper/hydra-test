package util

import java.time.Instant

import boopickle.Default._
import boopickle.DefaultBasic.PicklerGenerator
import entities.SomeEntity

object Picklers {
  implicit val instantPickler = transformPickler[Instant, (Long, Int)](
    t => Instant.ofEpochSecond(t._1, t._2)
  )(
    i => (i.getEpochSecond, i.getNano)
  )

  implicit val entityPickler = PicklerGenerator.generatePickler[SomeEntity]
}
