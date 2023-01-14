package creating.builder.siteBuilder;

public abstract class WebsiteBuilder {
    Website website;

    public void createWebsite(){
        website = new Website();
    }

    abstract void buildName();
    abstract void buildCms();
    abstract void buildPrice();

    Website getWebsite(){
        return website;
    }

}
