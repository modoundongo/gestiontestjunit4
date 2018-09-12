package sn.objis.gestiontestjunit;

public class Division extends Operations{
	
	public long division(long a, long b){
		if(b == 0){
			throw new IllegalArgumentException("La division par b = 0 est impossible");
		}else{
			return a/b;
		}
		
	}

}
