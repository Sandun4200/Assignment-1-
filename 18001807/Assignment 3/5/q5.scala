object q5{
   def main(args : Array[String])={
    printf("Enter number = ")
   val a=scala.io.StdIn.readInt()
   printf("sum =" + sum(a))
   
  }
   
   def isEven(n : Int) : Boolean = n match{
     case 0 => true
     case _ => isOdd(n-1)
   }
   def isOdd(n : Int) : Boolean = !(isEven(n))
   
   def sum(n : Int) : Int ={
     if(n>0){
       if(isEven(n)==true ){
       return n + sum(n-1)
     }else{
         sum(n-1)
     }
       
     }else{
       return 0
     }
     
   }
 
}
