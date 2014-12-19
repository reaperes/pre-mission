import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.Writer;

public class Main {
    public static void main(String[] args) throws LifecycleException {
        Tomcat tomcat = new Tomcat();

        Context ctx = tomcat.addContext("/", new File(".").getAbsolutePath());

        Tomcat.addServlet(ctx, "hello", new HttpServlet() {
           protected void service(HttpServletRequest req, HttpServletResponse res)
                   throws ServletException, IOException {
               Writer w = res.getWriter();
               w.write("Hello, World!");
               w.flush();
           }
        });
        ctx.addServletMapping("/*", "hello");

        tomcat.setPort(8000);
        tomcat.start();
        tomcat.getServer().await();
    }
}
