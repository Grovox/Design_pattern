package creating.builder;

import creating.builder.siteBuilder.Director;
import creating.builder.siteBuilder.EnterpriseWebsiteBuilder;
import creating.builder.siteBuilder.VisitCardWebsiteBuilder;
import creating.builder.siteBuilder.Website;

public class BuilderWebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new VisitCardWebsiteBuilder());
        Website website = director.buildWebsite();

        System.out.println(website);

        director.setBuilder(new EnterpriseWebsiteBuilder());
        website = director.buildWebsite();

        System.out.println(website);
    }
}
