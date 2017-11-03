package Main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Company {


    

   // public static HashMap<String,Main.Employee> EmployeeTable = new HashMap<String,Main.Employee>();
    public static HashMap<Integer,Employee> EmployeeTable = new HashMap<Integer,Employee>();

    public void newEmployee(employeeType e,String firstNAMEPASSED, String secondNAMEPASSED){
        Employee newEmployee = new Employee(e,firstNAMEPASSED,secondNAMEPASSED);
        EmployeeTable.put(newEmployee.getUniqueEMPLOYEEIDENTIFIER(),newEmployee);
    }

    public boolean fireEmployee(String firstName, String secondName){
        try {
            EmployeeTable.remove(getSpecificEmployee(firstName,secondName).getUniqueEMPLOYEEIDENTIFIER());
            return true;
        }catch(Exception e){
            //EmployeeDoesntExist
            e.printStackTrace();
            return false;
        }
    }

    public void getEmployeeTable(){
        System.out.println(Arrays.asList(EmployeeTable));
    }

    public Employee getSpecificEmployee(String firstName,String secondName){
        Map mp = Company.EmployeeTable;
        Iterator it = mp.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry pair = (Map.Entry)it.next();
            if((Employee.class.cast(pair.getValue()).getFirstName().contentEquals(firstName))&&(Employee.class.cast(pair.getValue()).getSecondName().contentEquals(secondName))){
                return Employee.class.cast(pair.getValue());
            }
        }
        return null;
    }

    public void getFormattedEmployee(String firstName, String secondName){
        Employee e = getSpecificEmployee(firstName,secondName);
        System.out.println("========================");
        System.out.format("%10s - %10S","Main.Employee",e.getFullName()+"\n");
        System.out.format("%10s - %10S","Emp ID",e.getUniqueEMPLOYEEIDENTIFIER()+"\n");
        System.out.format("%10s - %10S","Pay Rate",e.getPayRate()+"\n");
        String employeeTypeFormat = (""+e.getEmployeeType());
        employeeTypeFormat = employeeTypeFormat.replaceAll("[^a-zA-Z0-9]", " ");
        System.out.format("%10s - %8S","Level",employeeTypeFormat+"\n");
        System.out.println("========================");
    }

    public boolean raiseEmployee(Employee e, employeeType eT){
        if (e.getEmployeeType() == eT){
            return false;
        }else if (!(e.getEmployeeType() == eT)){
            if (eT.getLevel(e.getEmployeeType())< eT.getLevel(eT)){
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
