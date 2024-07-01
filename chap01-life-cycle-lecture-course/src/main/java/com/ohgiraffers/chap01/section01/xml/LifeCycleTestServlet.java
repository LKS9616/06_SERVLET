package com.ohgiraffers.chap01.section01.xml;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LifeCycleTestServlet extends HttpServlet {

    // 각 메소드마다 호출 횟수를 카운트할 목적의 필드
    private int initCount = 1;
    private int serviceCount = 1;
    private int destroyCount = 1;

    public LifeCycleTestServlet() {

    }
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("xml 매핑 init 메소드 탈출 " + initCount++);
    }

    @Override
    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
        /*
        * 서블릭 컨테이너에 의해 호출되며 최초 요청 시에는 init() 이후에 동작하고, 두 번째 요청부터는 init() 호출
        * 없이 바로 service()를 호출한다.
        * */
        System.out.println("xml 매핑 service 메소드 탈출 " + serviceCount++);
    }

    // 서블릿 컨테이너가 종료될 때 호출되는 메소드, 주로 자원을 반납하는 용도로 사용된다.
    @Override
    public void destroy() {
        System.out.println("xml 매핑 destroy() 메소드 호출 " + destroyCount++);
    }
}
