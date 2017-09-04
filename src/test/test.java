/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.RowIdLifetime;
import java.sql.SQLException;

/**
 *
 * @author nguyenducthao
 */
public class test {

    static final String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static final String DB_URL = "jdbc:sqlserver://localhost;";

    //  Ten database, nguoi dung va mat khau cua co so du lieu
    static final String DATABASENAME = "databasename=softech1;";
    static final String USER = "user=sa;";
    static final String PASS = "password=123";

    static void abc() throws SQLException, ClassNotFoundException {
        Connection conn = null;
        Class.forName(JDBC_DRIVER);
        System.out.println("Dang ket noi toi co so du lieu ...");
        conn = DriverManager.getConnection(DB_URL + DATABASENAME + USER + PASS);
        DatabaseMetaData dbMetaData = conn.getMetaData();
        RowIdLifetime lifetime = dbMetaData.getRowIdLifetime();
        switch (lifetime) {
            case ROWID_UNSUPPORTED:
                System.out.println("ROWID type not supported");
                break;

            case ROWID_VALID_FOREVER:
                System.out.println("ROWID has unlimited lifetime");
                break;

            case ROWID_VALID_OTHER:
                System.out.println("ROWID has indeterminate lifetime");
                break;

            case ROWID_VALID_SESSION:
                System.out.println(
                        "ROWID type has lifetime that "
                        + "is valid for at least the "
                        + "containing session");
                break;

            case ROWID_VALID_TRANSACTION:
                System.out.println(
                        "ROWID type has lifetime that "
                        + "is valid for at least the "
                        + "containing transaction");
                break;
        }
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        abc();

    }
}
