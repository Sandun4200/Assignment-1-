object Question1
{
	class rationalNum(n:Int,d:Int)
{
	  require(d>0,"d SHOULD BE GREATER THAN ZERO");
	  private def gcd(a:Int,b:Int):Int = if(b==0) a else gcd(b,a%b);
	  var gd = gcd(n,d);
	 if(gd<0) gd = -gd;
	
    def num=n/gd;
    def den=d/gd;
    def this(n:Int)=this(n,1);
    def neg=new rationalNum(-this.num,this.den);
    override def toString= num.toString+"/"+den.toString;
}
	def main(args:Array[String]):Unit =
	{
		val in=new rationalNum(6,8);
		val out=in.neg
		println("Num   : "+in.toString);
		println("Negetion of Num: "+out.toString);
	}

}
