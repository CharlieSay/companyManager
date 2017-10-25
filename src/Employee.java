import java.util.Iterator;
import java.util.Map;

public class Employee {

    private employeeType eT;
    private String name;
    private Double payRate;
    private int uniqueEMPLOYEEIDENTIFIER;

    public Employee(employeeType ePassed, String namePassed) {
        this.eT = ePassed;
        this.name = namePassed;
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

    public String getName(){
        return name;
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
