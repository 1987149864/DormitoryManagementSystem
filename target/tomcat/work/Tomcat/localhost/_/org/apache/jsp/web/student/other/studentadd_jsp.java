/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-10-12 13:58:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.web.student.other;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cn.itshaorui.dorm.javabean.student.Student;

public final class studentadd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>显示添加学生的数据</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");

response.setCharacterEncoding("UTF-8");
request.setCharacterEncoding("UTF-8");

      out.write('\n');
      cn.itshaorui.dorm.javabean.student.Student student = null;
      student = (cn.itshaorui.dorm.javabean.student.Student) _jspx_page_context.getAttribute("student", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (student == null){
        student = new cn.itshaorui.dorm.javabean.student.Student();
        _jspx_page_context.setAttribute("student", student, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("student"), request);
      out.write("\n");
      out.write("\n");
      out.write("<div align=\"center\">\n");
      out.write("\t\t\t\t\t \t\t<br/>\n");
      out.write("\t\t\t\t\t \t\t<br/>\n");
      out.write("\t\t\t\t\t \t\t<br/>\n");
      out.write("\t\t\t\t\t\t\t\t\t<table border=\"1\" >\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>学号:</td> <td>");
      out.print(student.getStuNo() );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t \t\t\t<td>姓名:</td> <td>");
      out.print(student.getStuName() );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t \t\t\t<td>班级:</td> <td>");
      out.print(student.getStuClass() );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write(" \n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t \t\t\t<td>电话号码:</td> <td>");
      out.print(student.getStuPhNo() );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t \t\t\t<td>学院号:</td> <td>");
      out.print(student.getStuDepNo() );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
