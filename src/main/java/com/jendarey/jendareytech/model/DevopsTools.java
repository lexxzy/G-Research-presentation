package com.jendarey.jendareytech.model;

public enum DevopsTools {


    Linux("LINUX"),
    Git("GIT"),
    Maven("MAVEN"),
    SonarQube("SONAR_QUBE"),
    Nexus("NEXUS"),
    Jenkins("JENKINS"),

    Tomcat("Tomcat"),

    Nginx("Nginx"),

    Docker("docker"),

    Kubernetes("kubernetes"),

    Prometheus("Prometheus"),
    Grafana("GRANFANA"),

    Ansible("Ansible"),
    Terraform("Terraform"),
    Amazon("Amazon"),
    Azure("AZURE"),

    Google_Cloud("GOOGLE_CLOUD"),
    Oracle("ORACLE");





    private final String tools;

    DevopsTools(String tools) {
        this.tools = tools;
    }

    public String getTools() {
        return tools;
    }
}
