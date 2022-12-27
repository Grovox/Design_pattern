package creating.abstractFactory;

import creating.abstractFactory.teamFactory.Developer;
import creating.abstractFactory.teamFactory.ProjectManager;
import creating.abstractFactory.teamFactory.ProjectTeamFactory;
import creating.abstractFactory.teamFactory.Tester;
import creating.abstractFactory.teams.banking.BankingTeamFactory;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();;

        System.out.println("Creating banking system...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
