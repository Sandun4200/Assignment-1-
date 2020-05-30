object q6{
   def main(args : Array[String])={
    printf("Enter number = ")
   val a=scala.io.StdIn.readInt()
   fibbSeq(a)
   
  
    
   }
   
   def fibb(n : Int) : Int =n match{
     case 0 => 0
     case x if x==1 => 1
     case _ => fibb(n-1) + fibb(n-2)
   }
   
   def fibbSeq(n : Int) : Unit={
     if(n>0)
       fibbSeq(n-1)
       printf(" "+ fibb(n))
   }
 
}
