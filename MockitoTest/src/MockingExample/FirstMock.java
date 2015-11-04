package MockingExample;
import java.util.Calendar;  
  
import static org.mockito.Mockito.*;  


public class FirstMock {
	 public static void main(String[] args)  
	    {  
	        Calendar mockedCalendar = mock(Calendar.class);  
	        when(mockedCalendar.get(Calendar.YEAR)).thenReturn(2020); 
	        System.out.println(mockedCalendar.get(Calendar.YEAR));  
	    }  
}
