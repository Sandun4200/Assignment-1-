object XYZ{
   def main(args : Array[String])={
    
     printf("Take home salary of an Employee = "+ takeHome(40,20))
	}
   
   def wage(hours : Double) : Double = hours*150
   def ot(hours : Double) : Double = hours*75
   def income(x : Double , y : Double) = wage(x) + ot(y)
   def tax(Income : Double) : Double = Income*0.1
   def takeHome(x : Double, y : Double) : Double = income(x,y)-tax(income(x,y))
}
