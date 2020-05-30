object q4{
   def main(args : Array[String])={
    printf("Enter number = ")
   val a=scala.io.StdIn.readInt()
   if(isEven(a)==true){
      printf("Even")
   }else{
     printf("Odd")
   }
   
  
    
   }
   
   def isEven(n : Int) : Boolean = n match{
     case 0 => true
     case _ => isOdd(n-1)
   }
   def isOdd(n : Int) : Boolean = !(isEven(n))
}