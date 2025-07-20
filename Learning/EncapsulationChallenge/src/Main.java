public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50,true);
        System.out.println(printer.getPagesPrinted() + " pages printed");

        int printerTotal = printer.printPages(5);
        System.out.printf("Current Job Pages: %d%nPrinter total: %d%n", printerTotal, printer.getPagesPrinted());
        printerTotal = printer.printPages(10);
        System.out.printf("Current Job Pages: %d%nPrinter total: %d%n", printerTotal, printer.getPagesPrinted());
    }
}