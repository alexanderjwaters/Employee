/**
	Alex Waters id# 23598844
   Project CSC 210 - 1701
   Comp. Prog. II 5:20PM - 7:35PM
   Fiterman Hall 906 
   Instructor: Alam Miah
   Chapter 10 #01 ProductionWorker
*/

public class ProductionWorker extends Employee1
{
	// Fields
	private final int DAY_SHIFT = 1;		// Day shift
	private final int NIGHT_SHIFT = 2;	// Night shift
	private int shift;						// Employee's shift
	private double hourlyPay;				// Employee's hourly pay rate

	/**
		Constructor
		@param shift Employee's shift number.
		@param hourlyPay Employee's hourly pay rate.
	*/

	public ProductionWorker(String empName, String empId, 
									int hireDate, int shift, 
									double hourlyPay)
	{
		// Pass to Employee constructor.
		super(empName, empId, hireDate);

		// Assign fields with parameter 
		// arguments.
		this.shift = shift;
		this.hourlyPay = hourlyPay;
		
	}

	/**
		Copy constructor
		@param object2 Copies self.
	*/

	public ProductionWorker(ProductionWorker object2)
	{
		super(object2);
		
		this.shift = object2.shift;
		this.hourlyPay = object2.hourlyPay;
	}



	/**
		The getShift method returns shift number.
		@return One for day and two for night.
	*/

	@Override
	public int getShift(int shift)
	{
		this.shift = shift;
		return shift;
	}

	/**
		The getHourlyPay returns pay rate
		of .
		@return hourlyPay of employemployeeee.
	*/

	@Override
	public double getHourlyPay(double hourlyPay)
	{
		this.hourlyPay = hourlyPay;

		return hourlyPay;
	}

	/**
		The getNightDayShift method
		@return String of Day or night
				  shift.
	*/

	public String getNightDayShift()
	{
		String day = "Day Shift";
		String night = "Night Shift";
		String work = "";


		if (shift == DAY_SHIFT)
			work = day;
		else
		if(shift == NIGHT_SHIFT)
			work = night;

		return work;
	}

	/**
		The equals method checks to see 
		if objects match.
		@param object2 
		@return true if match.
	*/

	public boolean equals(ProductionWorker object2)
	{
		boolean status;	// Flag variable
		
		// Check super class equals 
		// method for match.
		if(super.equals(object2) &&
			this.shift == object2.shift &&
			this.hourlyPay == object2.hourlyPay)
			status = true;
		else
			status = false;

		return status;

	}

	/**
		The toString method returns a snap 
		shot of fields.
		@return str.
	*/

	@Override
	public String toString()
	{
		String str = super.toString() +
						"\nShift: " + shift +
						"\nhourly Pay Rate: " + hourlyPay;

		return str;
	}
}