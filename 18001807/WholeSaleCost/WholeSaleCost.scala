object WholeSaleCost {
  def main(args : Array[String])={
    var Shippingcost : Double = 0
    var books_Price = discount(24.95,40)*60
    Shippingcost = shippingCost(60)
		printf("Wholesale cost = "+(Shippingcost + books_Price))
	}
  
  def discount(unitPrice : Double, discount : Double ): Double = {
    return unitPrice*(100-discount)/100
  }
  
  def shippingCost(units : Int) : Double = {
    var cost : Double =0
    if (units>50) {
      cost = 3.0 + (units-50)*0.75
    }else {
      cost = 3.0
    }
    return cost
  }
}