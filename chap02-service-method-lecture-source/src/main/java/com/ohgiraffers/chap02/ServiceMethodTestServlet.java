package com.ohgiraffers.chap02;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/request-service")
public class ServiceMethodTestServlet extends HttpServlet {
    // url 소문자로 쓰는 것이 암묵적으로 약속


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("GET 요청을 처리할 메소드 호출");


    /*
    * HttpServlet클래스의 servie method는 요청 방식에 따라 GET 요청에 대해서는 doGet() 메소드를 호출하고 request, response를 전달한다.
    * */

    // service로부터 전달받은 HttpServletRequest는 요청시 전달한 값을 getParameter() 메소드로 추출할 수 있다.

    String name = request.getParameter("name");
        System.out.println("이름 : " + name);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("POST 요청을 처리할 메소드 호출");
    }
}