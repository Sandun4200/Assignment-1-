object q1{
   def main(args : Array[String])={
     printf("Enter number = ")
   val a=scala.io.StdIn.readInt()
   printf("Is "+ a + " prime ="+prime(a))
  
   }
   
   def prime(n : Int, i : Int = 2) : Boolean ={
     if (n <= 2) {
       if (n==2){
         return true
       }else{
         return false
       }
     } 
        
    if (n % i == 0) 
        return false
    if (i * i > n) 
        return true
        
    return prime(n, i + 1);
   }
   
     
}