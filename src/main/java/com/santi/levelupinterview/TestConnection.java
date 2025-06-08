package com.santi.levelupinterview;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import javax.sql.DataSource;

@Component
public class TestConnection implements CommandLineRunner {

    private final DataSource dataSource;

    public TestConnection(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("DataSource: " + dataSource.getConnection().getMetaData().getURL());
        System.out.println("Connected successfully to Oracle DB!");
    }
}