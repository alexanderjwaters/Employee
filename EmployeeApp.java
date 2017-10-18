/**
	Alex Waters id# 23598844
   Project CSC 210 - 1701
   Comp. Prog. II 5:20PM - 7:35PM
   Fiterman Hall 906 
   Instructor: Alam Miah
   Chapter 10 #01 EmployeeApp
*/

public class EmployeeApp
{
	public static void main(String[] args)
	{
		// Create Production Worker object and
		// assign constructor values.
		ProductionWorker worker =
							new ProductionWorker("Jennifer Hayes",
														"2673-C", 2017,
														0, 27.56);

		// Set shift and hourly pay rate.
		worker.getShift(2);
		worker.getHourlyPay(27.44);

		// Display Production worker.
		System.out.println(worker);
		System.out.println(worker.getNightDayShift());

		if (worker instanceof ProductionWorker )
			System.out.println("Yes it is ProductionWorker");
		else
			System.out.println("NO it is not ProductionWorker");
	}
}