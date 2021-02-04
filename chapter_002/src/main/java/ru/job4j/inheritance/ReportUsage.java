package ru.job4j.inheritance;

/**
 * В классе есть метод main - для демонстрации примера
 */
public class ReportUsage {
    public static void main(String[] args) {
        TextReport textReport = new TextReport();
        String text = textReport.generate("Report's name ", "Report's body");
        System.out.println(text);
        HtmlReport htmlReport = new HtmlReport();
        String html = htmlReport.generate("Report's name ", "Report's body");
        System.out.println(html);
        JSONReport jsonReport = new JSONReport();
        String str = jsonReport.generate("name", "body");
        System.out.println(str);
    }
}
