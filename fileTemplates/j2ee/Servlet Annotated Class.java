#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")

/**
 * @author mofan
 * @date ${DATE} ${TIME}
 */
@javax.servlet.annotation.WebServlet(name = "${Entity_Name}",urlPatterns="${Class_Name}")
public class ${Class_Name} extends javax.servlet.http.HttpServlet {

        @Override
    protected void doPost(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException, java.io.IOException {
     
    }
        @Override
    protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException, java.io.IOException {
        this.doPost(req, resp);
    }
}
