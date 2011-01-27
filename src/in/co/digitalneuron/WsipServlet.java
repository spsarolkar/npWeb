package in.co.digitalneuron;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class WsipServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
		System.out.println("TEST");
		System.out.println("TEMP");
	}
}
