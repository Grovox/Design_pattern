package creating.abstractFactory.teams.website;

import creating.abstractFactory.teamFactory.Developer;
import creating.abstractFactory.teamFactory.ProjectManager;
import creating.abstractFactory.teamFactory.ProjectTeamFactory;
import creating.abstractFactory.teamFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
