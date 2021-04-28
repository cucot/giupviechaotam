package com.haotam.giupviec.resourceholder;

public class DatasourceHolder {

    private String url;
    private String username;
    private String password;
    private String javaHome;
    private String systemPath;
    private String jmsUsername;
    private String haotamAddress;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJavaHome() {
        return this.javaHome;
    }

    public void setJavaHome(String javaHome) {
        this.javaHome = javaHome;
    }

    public String getSystemPath() {
        return systemPath;
    }

    public void setSystemPath(String systemPath) {
        this.systemPath = systemPath;
    }

    public String getJmsUsername() {
        return jmsUsername;
    }

    public void setJmsUsername(String jmsUsername) {
        this.jmsUsername = jmsUsername;
    }

    public String getHaotamAddress() {
        return haotamAddress;
    }

    public void setHaotamAddress(String haotamAddress) {
        this.haotamAddress = haotamAddress;
    }

    @Override
    public String toString() {
        return "url: " + url + "\n username: " + username
                + "\n password: " + password + "\n java_home: "
                + javaHome + "\n systemPath: " + systemPath + "\n jms username: " + jmsUsername
                + "\n address: " + haotamAddress;
    }
}
