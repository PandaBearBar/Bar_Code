package I_Lime.part4;

public class SalaryUpdate implements Runnable {
    private void displaySTATS(double averageSal) throws CompanySystemException {
        System.out.println("Average sal : " + String.format("%.2f",averageSal));
        Company.getInstance().display();
        System.out.println("");
    }

    @Override
    public void run() {
        try {
            while (Company.getInstance().getAverageSalary() <= 15_000) {
                System.out.println("Average sal : " + String.format("%.2f",Company.getInstance().getAverageSalary()));
                Company.getInstance().display();
                System.out.println("");
                for (int i = 0; i < Company.getInstance().getList().size(); i++) {
                    double lastSal = Company.getInstance().getList().get(i).getSalary();
                    Company.getInstance().getList().get(i).setSalary(lastSal* 1.02);
                }
                Thread.sleep(10 * 2);
            }
            displaySTATS(Company.getInstance().getAverageSalary());
            System.out.println("EVERYBODY HAPPY NOW !?");
        } catch (Exception e) {
            e.getMessage();
        }

    }

}

