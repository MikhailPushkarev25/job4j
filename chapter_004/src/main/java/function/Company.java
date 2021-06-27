package function;

/**
 * @author Mikhail Pushkarev
 * @since 26.06.2021
 * @version 2.2
 *
 * В данном классе у нас сожный обьект с множеством колличества переменных
 * я использовал шаблон строитель для сокращения кода и более читабельности
 * создал внутренний класс
 * создал методы в классе с параметром
 * создал метод для инициализации обьектов
 * вывел результат
 */
public class Company {

    private byte numEmployees;
    private String post;
    private String department;
    private byte guide;
    private int averageSalary;
    private int profit;
    private int expenses;

    @Override
    public String toString() {
        return "Company{" + "numEmployees=" + numEmployees + ", post='" + post + '\''
                + ", department='" + department + '\'' + ", guide=" + guide + ", averageSalary="
                + averageSalary + ", profit=" + profit + ", expenses=" + expenses + '}';
    }

    static class Builder {

        private byte numEmployees;
        private String post;
        private String department;
        private byte guide;
        private int averageSalary;
        private int profit;
        private int expenses;

        Builder buildNumEmployees(byte numEmployees) {
            this.numEmployees = numEmployees;
            return this;
        }

        Builder buildPost(String post) {
            this.post = post;
            return this;
        }

        Builder buildDepartment(String department) {
            this.department = department;
            return this;
        }

        Builder buildGuide(byte guide) {
            this.guide = guide;
            return this;
        }

        Builder buildAverageSalary(int averageSalary) {
            this.averageSalary = averageSalary;
            return this;
        }

        Builder builderProfit(int profit) {
            this.profit = profit;
            return this;
        }

        Builder buildExpenses(int expenses) {
            this.expenses = expenses;
            return this;
        }

        Company build() {
            Company company = new Company();
            company.numEmployees = numEmployees;
            company.post = post;
            company.department = department;
            company.guide = guide;
            company.averageSalary = averageSalary;
            company.profit = profit;
            company.expenses = expenses;
            return company;
        }



    }

    public static void main(String[] args) {
        Company comp = new Builder().buildNumEmployees((byte) 50)
                .buildPost("Engineer")
                .buildDepartment("developments")
                .buildGuide((byte) 5)
                .buildAverageSalary(50_000)
                .builderProfit(20_000_000)
                .buildExpenses(1_000_000)
                .build();
        System.out.println(comp);
    }
}
