package Q8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.HashSet;

public class EntityLoader {

    public static volatile HashSet<String> CACHE = new HashSet<>(); //название пременной должно быть cashe

    public Object syncronizer; //Лучше сделать private
    public String path;

    public EntityLoader(String path) {
        syncronizer = new Object(); //из конструктора это лучше убрать и добавить в инициализацию объекта
        this.path = path;
    }

    public void loadEntities() throws Exception {
        if (CACHE.contains(path)) throw new Exception("Path already processed");
        CACHE.add(path);

        File file = new File(path);
        File[] files = file.listFiles();
        process(files); //files может быть null, должна быть проверка
    }

    private void process(File[] files) {
        synchronized (syncronizer) { //не будет работать, так как для каждого потока synchronizer будет свой
            for (File file : files) {
                processFile(file);
            }
        }

    }

    private void processFile(File file) { //в названии должен быть глагол
        int maxReadLines = 150; //объявить final
        BufferedReader br = null;
        String line = null;
        //br и line  лучше запихнуть в try catch
        int readed = 0; //br и readed - непонятные название

        try {
            br = new BufferedReader(new FileReader(file));
            while ((line = br.readLine()) != null && readed < maxReadLines) {
                store(line);
                readed++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void store(String line) { //лучше не void, а какое-то другое. Название непонятное.
        //не line, a sql
        try {
            Connection conn = DriverManager.getConnection("...");
            Statement st = conn.createStatement(); //понятные названия
            st.executeUpdate(createStatementString(line));
            st.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String createStatementString(String line) {
        //Method create real INSERT statement.
        //Skipped for readability
        return "...";
    }
}


