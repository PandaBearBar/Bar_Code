package I_Lime.part4;

public class test {
    public static void main(String[] args) throws CompanySystemException, InterruptedException {
        Company.getInstance().getThread().join();
        System.out.println("");
        Helper.report();
    }
}
