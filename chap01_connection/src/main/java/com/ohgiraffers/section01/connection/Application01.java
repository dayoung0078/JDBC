package com.ohgiraffers.section01.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Application01 {

    public static void main(String[] args) {
        Connection con = null; // Connection ->인터페이스 : 추상메서드들의 모음 / 선언부분만 있고 몸체부분만 있음.

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // 오류가 안나면 드라이버가 있는것이다
            con = DriverManager.getConnection("jdbc:mysql://localhost/employee","GANGNAM","GANGNAM"); //con에다가 대입시켜주는것임
            System.out.println("con : " + con);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            if(con != null){
                try {
                    con.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

