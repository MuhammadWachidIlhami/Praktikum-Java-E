/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.uniska.helper;

import id.ac.uniska.model.MataKuliah;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author USER
 */

public class MyConnection {
    private static String JDBC_DRIVER   = "com.mysql.cj.jdbc.Driver";
    private static String URL           = "jdbc:mysql://localhost:3306/";
    private static String DB_NAME       = "db_java";
    private static String TIMEZONE      = "?serverTimezone=Asia/Makassar";
    private static String USER          = "root";
    private static String PASS          = "";

    public Connection getConnection(){
        Connection con = null;
        
        try{
            Class.forName(JDBC_DRIVER);
            System.out.println("Sedang Menghubungkan Ke Database...");
            con = DriverManager.getConnection(URL+DB_NAME+TIMEZONE, USER, PASS);
            System.out.println("Berhasil Terkoneksi");
            return con;
       }catch (ClassNotFoundException | SQLException e) {
          e.printStackTrace();
        return null;
        }

    }
         public static void main(String[] args){
             MyConnection myConnection = new MyConnection();
          // myConnection.getConnection();
          MataKuliah mataKuliah;
          ArrayList<MataKuliah> mataKuliahArrayList = new ArrayList<>();
          Connection con = myConnection.getConnection();
          
          String querySelect = "SELECT * FROM makul";
          Statement statement;
          ResultSet resultSet;
          
          try{
              statement = con.createStatement();
              resultSet = statement.executeQuery(querySelect);
              while (resultSet.next()){
                  mataKuliah = new MataKuliah(
                  resultSet.getInt("id_makul"),
                          resultSet.getString("nama_makul"),
                          resultSet.getString("singkatan_makul"),
                          resultSet.getString("nama_dosen"),
                          resultSet.getString("kontak_dosen"),
                          resultSet.getBoolean("aktif")
                  );
                  mataKuliahArrayList.add(mataKuliah);
              }
          }catch (SQLException e){
              e.printStackTrace();
             
          }
          for (MataKuliah value : mataKuliahArrayList){
              System.out.print(value.getIdMakul());
              System.out.print("\t");
              System.out.print(value.getNamaMakul());
              System.out.print("\t");
              System.out.print(value.getNamaDosen());
              System.out.print("\t");
              System.out.println();
          }
         }
}