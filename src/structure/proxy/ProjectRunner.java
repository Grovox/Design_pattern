package structure.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://www.github.com/Design_pattern/src/structure/proxy");

        project.run();
    }
}
