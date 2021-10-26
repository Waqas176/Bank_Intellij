import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;


public class checkingbanktest1 
{
	
	private static CheckingAccount cobj1 = new CheckingAccount() ;
	@BeforeClass
	public static void init() 
	{
		cobj1.inputdetails("Ahmad", 1111, 0312, "multan",1000 );
	}
	
	@Test
	public void passingtests() 
	{
		assertEquals(1,cobj1.inputdetails("Waqas", 2222, 0313, "sahiwal", 2000));
		assertEquals(1500,cobj1.withdraw(2222, 500));
		assertEquals( 1,cobj1.delete(1111));
		assertEquals( 2000 , cobj1.deposit( 2222,500 ));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void failtest() 
	{
		cobj1.withdraw(4444, 111);	
	}
}
