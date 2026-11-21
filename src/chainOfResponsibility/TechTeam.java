package chainOfResponsibility;

public class TechTeam implements CustomerSupportHandler {
    @Override
    public void handleRequest(Issue issue) {
        if (issue.getPriority().equals("LEVEL3")) {
            System.out.println("Tech Team is handling the issue");
            issue.setStatus("Resolved");
            System.out.println("Tech Team has resolved the issue !!!");
        } else {
            System.out.println("Tech Team cannot handle the issue !!!");
            issue.setStatus("Failed");
        }
    }
}
