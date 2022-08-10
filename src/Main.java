public class Main {
    public static void main(String[] args) {
        int year = 2022;
        Main main = new Main ();
        main.isLeapYearAndPrint(year);
    }

    public void isLeapYearAndPrint(int year) {
        if (year % 4== 0 && year % 100!= 0 || year % 400 == 0) {
            System.out.printf("%s год високосный \n", year);
        } else {
            System.out.printf("%s год не високосный \n", year);
        }
    }
}