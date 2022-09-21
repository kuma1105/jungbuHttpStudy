package http_study.com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 자바 문서를 톰캣 서버가 실행될 때 동적 리소스로 주소를 생성합니다.
// HttpServlet : 톰캣 서버를 등록할 때 같이 참조된 라이브러리에서 제공함, 콤탯이 생성할 동적 리소스의 타입이다.
// 1. 사용자(클라이언트)가 브라우저에서 url로 서버주소(IP+포트번호)/L01servlet.do를 호출합니다.
// 2. 요청을 받은 톰캣 서버가 L01Servlet를 객체로 생성하고 브라우저에 html로 변환해서 응답을 합니다.
@WebServlet("/L01servlet.do")
public class L01Servlet extends HttpServlet{
	
	// doGet 메소드
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// HttpServletRequest req 요청 객체
		// HttpServletResponse resp 응답 객체
		resp.setContentType("text/html; charset=UTF-8"); // 한글 깨짐 해결
		resp.getWriter().append("<h1>Hello Servlet! L01servlet 한글" + (1000/3) + "</h1>");
	}
}
