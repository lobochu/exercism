object SpaceAge {
  val SecondsInYearOnEarth = 31557600

  val Mercury = 0.2408467f
  val Venus = 0.61519726f
  val Earth = 1.0
  val Mars = 1.8808158
  val Jupiter = 11.862615
  val Saturn = 29.447498
  val Uranus = 84.016846
  val Neptune = 164.79132

  def calcAge(orbitalPeriod: Double) (ageOnEarch: Double): Double = {
    ageOnEarch / (orbitalPeriod * SecondsInYearOnEarth)
  }

  val onMercury: Double => Double  = calcAge(Mercury)
  val onEarth: Double => Double  = calcAge(Earth)
  val onVenus: Double => Double  = calcAge(Venus)
  val onMars: Double => Double  = calcAge(Mars)
  val onJupiter: Double => Double  = calcAge(Jupiter)
  val onUranus: Double => Double  = calcAge(Uranus)
  val onNeptune: Double => Double  = calcAge(Neptune)
  val onSaturn: Double => Double  = calcAge(Saturn)
}

