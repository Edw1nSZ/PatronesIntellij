package org.example.config;

public class AppConfig {
    private static AppConfig instance;
    private String serverUrl;
    private int port;
    private String databaseUrl;

    private AppConfig() {
        // TODO: Inicializa tu configuración aquí si es necesario
        serverUrl = "http://UrlpruebaAda.com";
        //ejemplo de un puerto cualquiera
        port = 1501;
        databaseUrl = "http://localhost:1501/users";
       // apiKey = "default-api-key";
    }

    public static synchronized AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public void setDatabaseUrl(String databaseUrl) {
        this.databaseUrl = databaseUrl;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
