package creating.abstractFactory.teams.banking;

import creating.abstractFactory.teamFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode(){
        System.out.println("Java developer writes java code...");
    }
}
