package creating.abstractFactory.teams.banking;

import creating.abstractFactory.teamFactory.Developer;
import creating.abstractFactory.teamFactory.ProjectManager;
import creating.abstractFactory.teamFactory.ProjectTeamFactory;
import creating.abstractFactory.teamFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
