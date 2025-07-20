public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        pagesPrinted = 0;

        if (tonerLevel > 100 || tonerLevel < 0) {
            this.tonerLevel = -1;
        } else {
            this.tonerLevel = tonerLevel;
        }
        this.duplex = duplex;
    }

    public int addToner(int tonnerAmount) {
        if (tonnerAmount > 100 || tonnerAmount < 0) {
            return -1;
        }
        this.tonerLevel += tonnerAmount;

        return this.tonerLevel;
    }

    public int printPages(int pagesToPrint) {
        if (duplex) {
            System.out.println("Printing in duplex mode");
            int jobPages = (pagesToPrint / 2) + (pagesToPrint % 2);
            pagesPrinted += jobPages;
            return jobPages;
        } else {
            pagesPrinted += pagesToPrint;
            return pagesToPrint;
        }

    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}

