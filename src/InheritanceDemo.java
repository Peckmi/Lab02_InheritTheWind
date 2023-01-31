import java.util.ArrayList;

class InheritanceDemo {
    public static void main(String[] args) {
        //Create Workers
        Worker worker1 = new Worker("Simon", 18, 2004, 10.00);
        Worker worker2 = new Worker("Melanie", 20, 2002, 12.00);
        Worker worker3 = new Worker("Gabriel", 36, 1987, 14.00);

        SalaryWorker salaryWorker1 = new SalaryWorker("George", 19, 2003, 2000.00);
        SalaryWorker salaryWorker2 = new SalaryWorker("Toby", 60, 1963, 2500.00);
        SalaryWorker salaryWorker3 = new SalaryWorker("Gina", 26, 1997, 3000.00);

        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);
        workers.add(salaryWorker1);
        workers.add(salaryWorker2);
        workers.add(salaryWorker3);

        System.out.println("Weekly Pay Per Worker");
        System.out.println("------------------------------------");
        System.out.println("Name\tWeek 1\tWeek 2\tWeek 3");
        System.out.println("------------------------------------");

        for (Worker w : workers) {
            System.out.println(w.getName() + "\t" + w.calculateWeeklyPay(40) + "\t" + w.calculateWeeklyPay(50) + "\t" + w.calculateWeeklyPay(40));
        }
    }
}