package rest;

import baza.UnitOfWork;
import repo.IRepositoryCatalog;
import repo.impl.ReposytoryCatalog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class CatalogInstance {
    private static IRepositoryCatalog catalog;

    static
    {
        String url = "jdbc:hsqldb:hsql://localhost/workdb";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url);
            catalog =  new ReposytoryCatalog(new UnitOfWork(connection), connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static IRepositoryCatalog getCatalog() {
        return catalog;
    }
}
