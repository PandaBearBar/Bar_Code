package I_Lime.part5;

public class test {
    public static void main(String[] args) throws CompanySystemException, InterruptedException {
//        Company.getInstance().storeEmployeeData();
        Company.getInstance().getThread().join();
        System.out.println("");
        Helper.report();
    }
}
