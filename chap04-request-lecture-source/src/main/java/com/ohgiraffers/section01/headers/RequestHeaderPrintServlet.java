package com.ohgiraffers.section01.headers;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.util.Enumeration;


@WebServlet("/")
public class RequestHeaderPrintServlet extends HttpServlet {

    /*
    * 헤더의 종류 4가지
    * 1. General header
    *       요청 및 응답 모두에 적용되지만 최종적으로는 body에 전송되는 것과 관련이 없는 헤더
    *       body : 클라이언트가 요청을 보낼 때 POST에 어떤 특정 값을 담는 공간
    * 2. Request header
    *       Fetch될 리소스나 클라이언트 자세에 대한 상세 정보를 포함하는 헤더
    * 3. Response header
    *       위치나 서버 자체와 같은 응답에 대한 부가적인 정보를 갖는 헤더
    * 4. Entity header
    *       컨텐츠의 길이나 MIME타입과 같은 엔티티 body에 대한 상세 정보를 포함하는 헤더
    *       (요청 응답 모두 사용되며, 메시지 바디의 컨텐츠를 나타내기에 GET요청은 해당하지 않는다.)
    * */

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Enumeration<String> headerNames = request.getHeaderNames();

        while (headerNames.hasMoreElements()) {
            System.out.println(headerNames.nextElement());
        }

        System.out.println("================== request header 값 출력하기 =================");
        /* accept : 요청을 보낼 때 서버에게 요청할 응답 타입을 명시
        * accept-encoding : 응답시 원하는 인코딩 방식
        * accept-language : 응답시 원하는 언어
        * connection : HTTP 통신이 완료된 후에 네트워크 접속을 유지할ㄹ지 결정 (기본값 keep-alive = 연결을 열린 상태로 유지)
        * host : 서버의 도메인 네임과 서버가 현재 Listening중인 TCP 포트 지정 (반드시 하나가 존재하고 두 개면 404Error)
        * referer : 이 페이지 이전에 대한 주소
        * sec-fetch-dest : 요청 대상
        * sec-fetch-mode : 요청 모드
        * sec-fetch-site : 출처(origin)와 요청된 resource 사이의 관계
        * sec-fetch-user : 사용자가 시작한 요청일 때만 보내짐 (항상 ?1 값을 가짐)
        * cache-control : 캐시 설정
        * upgrade-insecure-request : 클라이언트가 서버에게 http -> https로 업그레이드를 요청할 때 사용
        * user-agent : 현재 사용자가 어떤 클라이언트(OS, browser)를 이용해 보낸 요청인지 명시
        * */
        System.out.println("accept : " + request.getHeader("accept"));
        System.out.println("accept-encoding : " + request.getHeader("accept-encoding"));
        System.out.println("accept-language : " + request.getHeader("accept-language"));
        System.out.println("connection : " + request.getHeader("connection"));
        System.out.println("host : " + request.getHeader("host"));
        System.out.println("referer : " + request.getHeader("referer"));
        System.out.println("sec-fetch-dest : " + request.getHeader("sec-fetch-dest"));
        System.out.println("sec-fetch-mode : " + request.getHeader("sec-fetch-mode"));
        System.out.println("sec-fetch-site : " + request.getHeader("sec-fetch-site"));
        System.out.println("sec-fetch-user : " + request.getHeader("sec-fetch-user"));
        System.out.println("cache-control : " + request.getHeader("cache-control"));
        System.out.println("upgrade-insecure-requests : " + request.getHeader("upgrade-insecure-requests"));
        System.out.println("user-agent : " + request.getHeader("user-agent"));
    }

}