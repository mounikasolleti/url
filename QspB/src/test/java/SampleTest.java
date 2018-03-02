import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest 
{
	@Test
	public void create()
	{
		String b=System.getProperty("browser");
		System.out.println(b);
	}
}
