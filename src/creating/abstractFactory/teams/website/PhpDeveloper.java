package creating.abstractFactory.teams.website;

import creating.abstractFactory.teamFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code...");
    }
}
