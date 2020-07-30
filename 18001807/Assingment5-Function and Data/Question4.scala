object Question4
{
    class account(id:String,Number:Int,balance:Double)
  {
  	var nic=id;
  	var AccountNumber=Number;
  	var Balance=balance;
  }
	def main(args:Array[String]):Unit =
	{
		var acc1=new account("12300",1,75000);
		var acc2=new account("12400",2,-16000);
		var acc3=new account("12500",3,530000);
		var acc4=new account("12600",4,-41000);
		var acc5=new account("12700",5,0);
		var acc6=new account("12800",6,-10000);
		val bank:List[account]=List(acc1,acc2,acc3,acc4,acc5,acc6);
		
		print("Negative account numbers: ");
		var OverdraftList=overdraft(bank);
		OverdraftList.foreach(x=>print(x.AccountNumber.toString+" "));

		var TotalBalance=balance(bank);
		print("\nTotal account balance:"+TotalBalance.Balance.toString);

		print("\nAccount balances + interest\n")
		var interestList=interest(bank);
		interestList.foreach(x=>print(x.toString+" \n"));
	}
	val overdraft=(list:List[account])=>list.filter(x=>x.Balance<=0);
	val balance=(list:List[account])=>list.reduce((x,y)=>new account("99999",1000,x.Balance+y.Balance));
	val interest=(list:List[account])=>list.map(x=>(if(x.Balance>0) x.Balance*1.05d else x.Balance*1.01d));
}
