package galaxyraiders.core.game

import galaxyraiders.core.physics.Point2D
import galaxyraiders.core.physics.Vector2D

class Explosion(
  initialPosition: Point2D,
  radius: Double,
  val lifespan: Int,
) :
  SpaceObject("Explosion", 'x', initialPosition, Vector2D(0.0, 0.0), radius, 0.0) {
  var is_triggered: Boolean = false
  var count: Int = 0

  fun updateExplosion() {
    count++
    if (this.lifespan < count) {
      is_triggered = true
    }
  }
}
