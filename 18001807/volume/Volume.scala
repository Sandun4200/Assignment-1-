object Volume{
  def main(Args : Array[String])={
		printf("Volume of the sphere (radius=5) = "+sphereVolume(5))
	}

	def sphereVolume(r : Double):Double={	
		var t : Double = 4.0/3.0*math.Pi*r*r*r 
	  return t
	}
}