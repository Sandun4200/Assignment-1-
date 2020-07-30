object Question2
{
  class rationalNum(n:Int,d:Int)
  {
  	require(d>0,"DENOMINATOR SHOULD BE GREATER THAN ZERO");
      private var gd = gcd(n,d);
	if(gd<0) gd = -gd;
  	  def num=n/gd;
      def den=d/gd;
      def this(n:Int)=this(n,1);
      private def gcd(a:Int,b:Int):Int = if(b==0) a else gcd(b,a%b);
      def +(r:rationalNum)=new rationalNum(this.num*r.den + this.den*r.num,this.den*r.den);
      def neg=new rationalNum(-this.num,this.den);
      def -(r:rationalNum)=this+r.neg;
      override def toString= num.toString+"/"+den.toString;
  }  
	def main(args:Array[String]):Unit =
	{
  		val a1=new rationalNum(3,4);
  		val a2=new rationalNum(5,8);
  		val a3=new rationalNum(2,7);
  		val a4=a1-a2-a3;
  		println("x-y-z = "+a4);
	}
}
