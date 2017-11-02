package employeeS;


import Main.Company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

public class ExecutiveEmployee extends EmployeeMaster{
    String firstName = "";
    String secondName = "";
    String startDate = "";
    String fullName = "";
    employeeType emplyoyeeType = null;
    employeeRata employeeRata = null;
    Double hoursContracted = 0.0;
    Integer uniqueStaffIdentifier;

    public ExecutiveEmployee(String firstName, String secondName, employeeType emplyoyeeType, EmployeeMaster.employeeRata employeeRata, Integer hoursContracted) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.emplyoyeeType = emplyoyeeType;
        this.employeeRata = employeeRata;
        if (employeeRata.equals(EmployeeMaster.employeeRata.SALARIED)){this.hoursContracted = 37.5;}
        else if (employeeRata.equals(EmployeeMaster.employeeRata.HOURLY)){

        }
    }

    @Override
    int setUniqueID() {
        uniqueStaffIdentifier = super.setUniqueID();
    }
}
