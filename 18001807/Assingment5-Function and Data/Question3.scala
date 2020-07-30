object Question3
{
  class account(id:String,Number:Int,balance:Double)
  {
  	var nic=id;
  	var AccountNumber=Number;
  	var Balance=balance;
  	def withdraw(amount:Double)=if(Balance>amount) Balance=Balance-amount else println("Account balnce is not sufficient.");
  	def deposit(amount:Double)=Balance=Balance+amount;
  	def transfer(acc:List[account],amount:Double)=
  	{
  		if(Balance>amount)
  		{
  			Balance=Balance-amount;
  			acc.head.Balance=acc.head.Balance+amount;
  		}
  		else
  		{
  			println("Account balnce is not sufficient.");
  		}
  	}	
  }
	def main(args:Array[String]):Unit =
	{
		var acc1=new account("S123",1,15000);
		var acc2=new account("S124",2,60000);
		var acc3=new account("S125",3,30000);
		val bank:List[account]=List(acc1,acc2,acc3);
		
		val x=find(2,bank);
		acc1.transfer(x,10000);

		println("Sender's account balance : "+acc1.Balance);
		println("Receiver's account balance  : "+x.head.Balance);

	}

	val find=(AccountNumber:Int,list:List[account])=>list.filter(x=>x.AccountNumber.equals(AccountNumber));

}
