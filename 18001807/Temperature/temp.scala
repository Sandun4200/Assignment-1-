object temp {
  def main(args : Array[String])={
		println("35 Celsius in Fahrenheit = "+convert(35)+ "F")
	}

	def convert(c : Double):Double={	
		return c*1.8000+32.00
	}
}