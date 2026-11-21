package chainOfResponsibility;

public class Chatbot implements CustomerSupportHandler {
    private CustomerSupportHandler nextHandler;

    public Chatbot(CustomerSupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Issue issue) {
        if (issue.getPriority().equals("LEVEL1")) {
            System.out.println("Chatbot resolved the issue");
            issue.setStatus("Resolved");
        } else {
            System.out.println("Chatbot cannot resolve the issue. Passing issue to the next handler.");
            issue.setStatus("Pending");
            nextHandler.handleRequest(issue);

        }
    }
}
