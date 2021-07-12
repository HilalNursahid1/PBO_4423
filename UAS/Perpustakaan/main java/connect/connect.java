/*
Nama: Hilal Alba N.
Nim: A11.2019.12306
Kelas: A11.4423
 */
package connect;

import com.mysql.cj.jdbc.MysqlDataSource;/*Untuk memanggil package mysql cj jdbc MysqlDataSource pada java */
import java.sql.Connection;/*Untuk memanggil package sql Connection pada java */
import java.sql.SQLException;/*/*Untuk memanggil package sql SQLException pada java */

public class Koneksi {
    static Connection con;
    static String db_name = "sewabuku";
    static String db_user = "root";
    static String db_pass = "";

    public static Connection GetConnection() {
        if (con == null) {
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName(db_name);
            data.setUser(db_user);
            data.setPassword(db_pass);

            try {
                con = data.getConnection();
                System.out.println("Database connect");
            } catch (SQLException e) {
                System.out.println("Database tidak connect");
            }
        }
        return con;
    }
}