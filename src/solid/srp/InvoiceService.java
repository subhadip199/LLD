package solid.srp;

public class InvoiceService {
    public void generateInvoice() {
        System.out.println("Generating invoice");
    }

    public void printInvoice(Long invoiceId) {
        System.out.println("Printing invoice: " + invoiceId);
    }

    public void downloadInvoice(Long invoiceId) {
        System.out.println("Downloading invoice: " + invoiceId);
    }

    public void cancelInvoice(Long invoiceId) {
        System.out.println("Cancelling invoice: " + invoiceId);
    }

    public String getInvoiceById(Long invoiceId) {
        System.out.println("Fetching invoice: " + invoiceId);
        return "Invoice-" + invoiceId;
    }
}
