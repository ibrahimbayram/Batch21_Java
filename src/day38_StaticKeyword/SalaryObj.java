package day38_StaticKeyword;

public class SalaryObj {
    public static void main(String[] args) {

        SalaryCalculator salary1 = new SalaryCalculator();

        salary1.setInfo(55, 40, 0.08, 22);
        System.out.println(salary1);

        SalaryCalculator salary2 = new SalaryCalculator();
        salary2.setInfo(55, 40, 0.08, 22);

        System.out.println(salary1.equals(salary2));

    }
}