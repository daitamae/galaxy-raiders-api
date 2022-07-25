package galaxyraiders.core.game

import galaxyraiders.core.physics.Point2D
import galaxyraiders.core.physics.Vector2D

class Explosion(
  initialPosition: Point2D,
  radius: Double,
  lifespan: Int,
) :
  SpaceObject("Explosion", 'x', initialPosition, Vector2D(0.0, 0.0), radius, 0.0)
  {
    init{
      is_triggered : Boolean = false
      count : Int = 0
    }

    fun updateExplosion()
    {
      this.count++;
      if(lifespan<this.count)
      {
        this.is_triggered = true
      }
    }
  }
