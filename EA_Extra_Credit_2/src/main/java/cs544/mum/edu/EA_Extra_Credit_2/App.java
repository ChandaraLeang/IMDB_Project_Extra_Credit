package cs544.mum.edu.EA_Extra_Credit_2;

/**
 * Name: CHANDARA LEANG
 * ID: 108619
 * Task: Extra Credit 2
 * Class: App
 */

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
	private static EntityManagerFactory emf;

	static {
		try {
			emf = Persistence.createEntityManagerFactory("cs544");
		} catch (Throwable ex) {
			ex.printStackTrace();
			throw new ExceptionInInitializerError(ex);
		}
	}
	
    public static void main( String[] args )
    {
        
    }
}