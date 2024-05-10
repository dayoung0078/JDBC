package com.ohgiraffers.section01.section02.template;


import java.sql.Connection;



public class Application01 {
    public static void main(String[] args) {
        Connection con = JDBCTemplate.getConnection();
        System.out.println("con : " + con);

        JDBCTemplate.close(con);
        System.out.println("con : " + con);
    }
}

/* 리팩터링(refactoring) '결과의 변경 없이 코드의 구조를 재조정함'을 뜻한다. 주로 가독성을 높이고 유지보수를 편하게 한다.*/