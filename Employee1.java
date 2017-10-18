/**
	Alex Waters id# 23598844
   Project CSC 210 - 1701
   Comp. Prog. II 5:20PM - 7:35PM
   Fiterman Hall 906 
   Instructor: Alam Miah
   Chapter 10 #01 Employee
*/

public abstract class Employee1
{
	// Fields
	private String empName;		// Employee Name
	private String empId;		// Employee ID
	private int hireDate;	// Employee hire date

	/**
		Constructor
		@param empName Employee's name.
		@param empNum Employee's Id number.
		@param hireDate Employee's hire date.
	*/

	public Employee1(String empName, String empId,
						  int hireDate)
	{
		this.empName = empName;
		this.empId = empId;
		this.hireDate = hireDate;
	}

	/**
		Copy constructor
		@param object2 Makes copy of self.
	*/

	public Employee1(Employee1 object2)
	{
		this.empName = object2.empName;
		this.empId = object2.empId;
		this.hireDate = object2.hireDate;
	}

	/**
		The setEmpName method stores name
		of Employee1.
		@param empName Employee1's name.
	*/

	public final void setEmpName(String empName)
	{
		this.empName = empName;
	}

	/**
		The setEmpId method stores Employee1's
		id number.
		@param empId Employee1's id.
	*/

	public final void setEmpId(String empId)
	{
		this.empId = empId;
	}

	/**
		The setHireDate method stores Employee1's 
		date of hire.
		@param hireDate Employee1's start date.
	*/

	public final void setHireDate(int hireDate)
	{
		this.hireDate = hireDate;
	}

	/**
		The getEmpName method returns employee's
		name.
		@return empName.
	*/

	public String getEmpName()
	{
		return empName;
	}

	/**
		The getEmpId method returns employee's 
		identifacation number.
		@return empId Employee's id number.
	*/

	public String getEmpId()
	{
		return empId;
	}

	/**
		The getHireDate method returns employee's 
		date of hire.
		@return hireDate.
	*/

	public int getHireDate()
	{
		return hireDate;
	}

	/**
		The equals method checks fields
		of object to make sure they match
		Employee's fields.
		@param object2 Employee object.
		@return true if match.
	*/

	public boolean equals(Employee1 object2)
	{
		boolean status;		// Flag variable

		if(this.getEmpName() == object2.getEmpName() &&
			this.getEmpId() == object2.getEmpId() &&
			this.getHireDate() == object2.getHireDate())
			status = true;
		else
			status = false;

		return status;

	}

	/**
		The toString method returns a snap
		shot of fields.
		@return str Fields.
	*/

	public String toString()
	{
		String str = "Employee Name: " + empName +
						 "\nEmployee ID: " + empId +
						 "\nHire Date: " + hireDate;

		return str;
	}

	// Find out shift and hourly rate for workers.
	public abstract int getShift(int shift);
	public abstract double getHourlyPay(double hourlyPay);

}