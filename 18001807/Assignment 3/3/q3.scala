object q3{
   def main(args : Array[String])={
    printf("Enter number = ")
   val a=scala.io.StdIn.readInt()
   printf("sum ="+sum(a))
   
  
    
   }
   
   def sum(n: Int): Int={
     if(n>0)
       return n + sum(n-1)
     else 
       return 0
   }
 
}