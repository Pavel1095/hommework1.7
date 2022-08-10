public class Main {
    public static void main(String[] args) {
        int year = 2022;
        Main main = new Main ();
        main.isLeapYearAndPrint(year);

        int ckientOs = 0;
        main.checkAndPrintSuitableVersionOs(ckientOs, year);
    }

    public void isLeapYearAndPrint(int year) {
        if (year % 4== 0 && year % 100!= 0 || year % 400 == 0) {
            System.out.printf("%s год високосный \n", year);
        } else {
            System.out.printf("%s год не високосный \n", year);
        }
    }

    public void checkAndPrintSuitableVersionOs ( int clientOs, int year) {
        if (clientOs == 0 && year == 2022) {
            System.out.println("Вам нужна современная версия для IOS");
        }else if (clientOs == 0 && year < 2022) {
            System.out.println("Вам нужна lite-версия для IOS");
        }else if (clientOs == 1 && year == 2022) {
            System.out.println("Вам нужна современная версия для Android");
        }else if (clientOs == 1 && year < 2022) {
            System.out.println("Вам нужна lite-версия для Android");
        }else{
            System.out.println("Ваша ОС не обслуживвается");
        }
    }
}