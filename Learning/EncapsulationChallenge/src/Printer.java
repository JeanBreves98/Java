public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this(tonerLevel, 0, duplex);
    }

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int addToner(int tonnerAmount) {
        if (this.tonerLevel > 100 || this.tonerLevel < 0) {
            return -1;
        }
        this.tonerLevel += tonnerAmount;

        return this.tonerLevel;
    }

    public int printPages(int pagesToPrint) {
        if (duplex) {
            System.out.println("It's a duplex printer");
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

