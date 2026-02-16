
public class Employee {
 
  private int id, yearsEmployed;
  private String name, position;
  private float salary;
 
  public Employee(int id, String name, String position, int yearsEmployed, float salary) {
    this.id = id;
    this.name = name;
    this.position = position;
    this.yearsEmployed = yearsEmployed;
    this.salary = salary;
  }
 
  public float getSalesQuota() {
    if (position == "Sales")
      return 25000;
    else
      throw new RuntimeException("Sales Quota N/A for non-Sales employees");
  }
 
  public void giveRaise(int pct) {
    salary += (pct / 100) * salary;
    try {
      // Have to make sure we document this increase for auditing purposes
      AuditTrail.auditSalaryIncrease(this, salary);
    }
    catch (Exception e) {
    }
  }
 
  public String getFloorOfBuilding() {
    if (position == "Developer")
      return "Floor 1";
    else if (position == "Sales")
      System.out.println("Sales are on Floor 2 until December ...");
      return "Floor 2";
    else if (position == "Manager")
      return "Floor 3";
    else
      return null;
  }
 
  public String getSummary() {
    // For Developer and Sales positions, we need to include seniority
    if (position == "Developer") {
      String seniority = yearsEmployed < 5 ? "Junior" : "Senior";
      return "I am a " + seniority + " Developer";
    }
    else if (position == "Sales") {
      String seniority = yearsEmployed < 5 ? "Junior" : "Senior";
      return "I am a " + seniority + " Developer";
    }
    else if (position == "Manager")
      return "I am a Manager";
    else
      return null;
  }
 
  public static List<Employee> getEmployeesFromDB(
    Int id,
    Int minYearsEmployed,
    Int maxYearsEmployed,
    String name,
    String position,
    Float minSalary,
    Float maxSalary,
    Float minSalesQuota,
    Float maxSalesQuota,
    Boolean includeAllManagers
  ) {
    // code here looks up EMPLOYEE records from the database
    // based on non-null parameter values passed
  }
 
}


