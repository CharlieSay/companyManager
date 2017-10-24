import java.util.Arrays;
import java.util.HashMap;

public class Company {

    public static HashMap<String,Employee> EmployeeTable = new HashMap<String,Employee>();

    public void newEmployee(employeeType e, String name){
        EmployeeTable.put(name,new Employee(e,name));
    }

    public boolean fireEmployee(String name){
        try {
            EmployeeTable.remove(name);
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public void getEmployeeTable(){
        System.out.println(Arrays.asList(EmployeeTable));
    }

    public Employee getSpecificEmployee(String name){
        return EmployeeTable.get(name);
    }

    public void getFormattedEmployee(String name){
        Employee e = EmployeeTable.get(name);
        System.out.println("========================");
        System.out.format("%10s - %10S","Employee",e.getName()+"\n");
        System.out.format("%10s - %10S","Pay Rate",e.getPayRate()+"\n");
        System.out.format("%10s - %8S","Level",e.getEmployeeType()+"\n");
        System.out.println("========================");
    }

    public boolean raiseEmployee(Employee e, employeeType eT){
        if (e.getEmployeeType() == eT){
            return false;
        }else if (!(e.getEmployeeType() == eT)){
            if (eT.getLevel(eT)<e.getEmployeeType().getLevel(e.getEmployeeType())){
                e.setLevel(eT);
                return true;
            }else{
                return false;
            }

        }else{
            return false;
        }
    }

}
