object caesarcipher extends App{

  val alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	// encryption function
  val encrypt=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)
	// decryption function
  val decrypt=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)-key+a.size)%a.size)
 	//cipher function
  val cipher=(algo:(Char,Int,String)=>Char,size:String,key:Int,a:String)=>size.map(algo(_,key,a))

  val t=cipher(encrypt,"ab",1,alphabet)
  val p=cipher(decrypt,"xyz",3,alphabet)

  println(t)
  println(p)

}