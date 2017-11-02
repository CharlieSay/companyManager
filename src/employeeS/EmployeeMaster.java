package employeeS;

import Main.Company;

import java.util.Iterator;
import java.util.Map;

public abstract class EmployeeMaster {
    String nameBuilder();
    void setType();
    void startDate();

    int setUniqueID(){
        Map mp = Company.EmployeeTable;
        Iterator it = mp.entrySet().iterator();
        int x = 0;
        if (mp.size() == 0){
            return 1;
        }else{
            while (it.hasNext()) {
                x++;
                it.next();
                if (mp.size() == x && mp.size() >= 1) {
                    return (x+1);
                }
            }
        }
    }

    enum employeeType{
        EXECUTIVE,
        MANAGER,
        SENIOR,
        JUNIOR;
    }

    enum employeeRata{
        HOURLY,
        SALARIED
    }
}
