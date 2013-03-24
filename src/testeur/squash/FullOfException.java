package testeur.squash;

import java.io.NotActiveException;

public class FullOfException {
	
	public static void main(String[] args) throws NotActiveException {
		
		if( 1 == 1 ){
			throw new NotActiveException();
		}
		
	}

}
