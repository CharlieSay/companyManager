package Main;

import java.util.Iterator;
import java.util.Map;

public class Employee {

    private employeeType eT;
    private String firstName;
    private String secondName;
    private Double payRate;
    private int uniqueEMPLOYEEIDENTIFIER;

    public Employee(employeeType ePassed, String firstNamePassed, String secondNamePassed) {
        this.eT = ePassed;
        this.firstName = firstNamePassed;
        this.secondName = secondNamePassed;
        switch (ePassed){
            case HOURLY_EMPLOYEE:
                payRate = 8.20;
                break;
            case SALARIED_EMPLOYEE:
                payRate = 25.00;
                break;
            case MANAGER:
                payRate = 50.12;
                break;
            case EXECUTIVE:
                payRate = 110.21;
                break;
        }
        setUniqueEMPLOYEEIDENTIFIER();
    }

    public void setUniqueEMPLOYEEIDENTIFIER() {
        Map mp = Company.EmployeeTable;
        Iterator it = mp.entrySet().iterator();
        int x = 0;
        if (mp.size() == 0){
            this.uniqueEMPLOYEEIDENTIFIER=1;
        }else{
            while (it.hasNext()) {
                x++;
                it.next();
                if (mp.size() == x && mp.size() >= 1) {
                    this.uniqueEMPLOYEEIDENTIFIER = (x+1);
                }
            }
        }
    }

    public int getUniqueEMPLOYEEIDENTIFIER() {
        return uniqueEMPLOYEEIDENTIFIER;
    }

    public employeeType getEmployeeType() {
        return eT;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getSecondName(){
        return secondName;
    }

    public String getFullName(){
        return firstName + " " + secondName;
    }
    public Double getPayRate(){
        return payRate;
    }

    public void setLevel(employeeType eT){
        this.eT = eT;
    }

    public Employee EmployeeReturn(){
        return this;
    }
}
