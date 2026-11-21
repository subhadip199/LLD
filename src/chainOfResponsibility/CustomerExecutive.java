package chainOfResponsibility;

public class CustomerExecutive implements CustomerSupportHandler {
    private CustomerSupportHandler nextHandler;

    public CustomerExecutive(CustomerSupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Issue issue) {
        if (issue.getPriority().equals("LEVEL2")) {
            System.out.println("Customer Executive resolved the issue");
            issue.setStatus("Resolved");
        } else {
            System.out.println("Customer Executive cannot resolve the issue. Passing to next handler.");
            issue.setStatus("Pending");
            nextHandler.handleRequest(issue);

        }
    }
}
