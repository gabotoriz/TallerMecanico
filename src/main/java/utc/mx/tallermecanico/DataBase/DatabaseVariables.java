package utc.mx.tallermecanico.DataBase;

public class DatabaseVariables {
    private String DataBase = "Taller";
    private String User = "root";
    private String Password = "";
    private String Ip = "127.0.0.1";
    private String Puerto = "3306";
    private String Driver = "jdbc:mysql://" + Ip + ":" + Puerto + "/" + DataBase;

    public String getDataBase() {
        return DataBase;
    }

    public void setDataBase(String dataBase) {
        DataBase = dataBase;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getIp() {
        return Ip;
    }

    public void setIp(String ip) {
        Ip = ip;
    }

    public String getPuerto() {
        return Puerto;
    }

    public void setPuerto(String puerto) {
        Puerto = puerto;
    }

    public String getDriver() {
        return Driver;
    }

    public void setDriver(String driver) {
        Driver = driver;
    }
}
