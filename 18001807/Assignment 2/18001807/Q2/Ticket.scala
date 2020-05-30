object Ticket{
   def main(args : Array[String])={
   printf("Best ticket Price = "+bestPrice())
	}
   
   def attendees(price : Double) : Double = 120 + (15-price)/5*20
   def revenue(price : Double) : Double = attendees(price)*price
   def cost(price : Double) : Double = attendees(price)*3+500
   def profit (price : Double) : Double = revenue(price)-cost(price)
   def bestPrice() : Double ={
     var max,price,temp : Double = 0
     while (attendees(price)!=0){
       if (max< profit(price)){
         max = profit(price)
         temp = price
         price = price + 5
       }else{
         price = price + 5
       }
     }
     return temp
    
       
   }
   
     
}