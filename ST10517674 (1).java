import java.util.Scanner;

interface IConsoles {
    String getConsoleType();
    String getStore();
    int getTotalSales();
}

abstract class Console implements IConsoles {

    private String consoleType;
    private String store;
    private int totalSales;

    public Console(String consoleType, String store, int totalSales) {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }

    public String getConsoleType() {
        return consoleType;
    }

    public String getStore() {
        return store;
    }

    public int getTotalSales() {
        return totalSales;
    }
}

class ConsoleSales extends Console {

    public ConsoleSales(String consoleType, String store, int totalSales) {
        super(consoleType, store, totalSales);
    }

    public void printReport() {
        System.out.println("\nCONSOLE SALES REPORT");
        System.out.println("-------------------------");
        System.out.println("Console Type: " + getConsoleType());
        System.out.println("Store Name: " + getStore());
        System.out.println("Total Sales: R" + getTotalSales());
    }
}

public class ST10517674 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter console type: ");
        String console = input.nextLine();

        System.out.print("Enter store name: ");
        String store = input.nextLine();

        System.out.print("Enter total sales: ");
        int sales = input.nextInt();

        ConsoleSales report = new ConsoleSales(console, store, sales);

        report.printReport();

        input.close();
    }
}
