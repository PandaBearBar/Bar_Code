package I_Lime.part5;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Company {
    private static Company Instance = new Company();
    private List<Employee> list = new LinkedList<>();
    private final Thread thread ;

    private Company() {
        try {
            loadEmployeeData();
        }catch (Exception e){
            e.getMessage();
        }
        thread = new Thread(new SalaryUpdate());
        thread.start();
    }

    public static Company getInstance() {
        return Instance;
    }

    public Thread getThread() {
        return thread;
    }

    public List<Employee> getList() {
        return list;
    }

    public void addEmployees(Employee employee) throws CompanySystemException {
        for (Employee e: list) {
            if (e.equals(employee)) throw new CompanySystemException(Error.EPLOYEE_ALREADY_EXIST.getMessage());
        }
        list.add(employee);
    }

    public void removeEmployee(Employee employee) throws CompanySystemException {
        boolean isExist = false;
        for (Employee e: list) {
            if (e.equals(employee)) {
                isExist = true;
                break;
            }
        }
        if (!isExist) throw new CompanySystemException(Error.EMPLOYEE_NOT_FOUND.getMessage());
        list.remove(employee);
    }

    public void display() {
        Collections.sort(list);
        for (Employee employee: list) System.out.println(employee);
    }

    private void emptyCheck() throws CompanySystemException {
        if (list.isEmpty()) throw new CompanySystemException(Error.NULL_OR_EMPTY.getMessage());
    }

    public double getAverageSalary() throws CompanySystemException {
        emptyCheck();
        return getMonthlyPayment() / getTotalNumOfEmployees();
    }

    public double getAverageManagementSalary() throws CompanySystemException {
        emptyCheck();
        return getMonthlyPayment() / getTotalNunOfManagers();
    }

    public double getMonthlyPayment() throws CompanySystemException {
        emptyCheck();
        double sum = 0;
        for (Employee e: list) sum += e.getSalary();
        return sum;
    }

    public double getYearlyPayment() throws CompanySystemException {
        return 12 * getMonthlyPayment();
    }

    public double getTotalNumOfEmployees() throws CompanySystemException {
        emptyCheck();
        return list.size();
    }

    public double getTotalNunOfManagers() throws CompanySystemException {
        emptyCheck();
        int managers = 0;
        for (Employee e: list) if (e.getClass().equals(Manager.class)) managers++;
        return managers;
    }

    //C:\Users\BarSa\OneDrive\שולחן העבודה\JavaMaterials
    public void storeEmployeeData() throws CompanySystemException{
        try {
            FileOutputStream outFile = new FileOutputStream("emp.data");
            ObjectOutputStream out = new ObjectOutputStream(outFile);
            out.writeObject(FactoryUtils.initEmployees());
            out.close();
        }catch (Exception e){
            e.getMessage();
        }
    }
    private void loadEmployeeData()throws CompanySystemException{
        try {
            File file = new File("emp.data");
            if (!file.exists())this.list.add(null);
            else {
                FileInputStream inFile = new FileInputStream("emp.data");
                ObjectInputStream in = new ObjectInputStream(inFile);
                this.list = (List<Employee>) in.readObject();
            }
        }catch (Exception e){
            Error.FILE_WRITE_PROBLEM.getMessage();
        }
    }
}
