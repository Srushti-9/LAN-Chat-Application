package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adduser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>Java Chat-Admin Console-Add User</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<table width=700>\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td width=300><!--%@ include file=\"menu.jsp\"%--></td>\n");
      out.write("\t\t<td>\n");
      out.write("\t\t<div align=center>\n");
      out.write("\t\t<table>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td align=center height=30 width=200 bgcolor=red><a\n");
      out.write("\t\t\t\t\thref=adduser.jsp>Add Users</a></td>\n");
      out.write("\t\t\t\t<td align=center height=30 width=200 bgcolor=CCCCFF><a\n");
      out.write("\t\t\t\t\thref=viewuser.jsp>View Users</a></td>\n");
      out.write("\t\t\t\t<td align=center height=30 width=200 bgcolor=CCFFFF><a\n");
      out.write("\t\t\t\t\thref=AdminChatServlet>Configure Rooms</a></td>\n");
      out.write("\t\t\t\t<td align=center height=30 width=200 bgcolor=9966FF><a\n");
      out.write("\t\t\t\t\thref=logout.jsp>Logout</a></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</table>\n");
      out.write("\t\t<br>\n");
      out.write("\t\t<br>\n");
      out.write("\t\t<font size=5 color=000033>Enter New User Information</font></div>\n");
      out.write("\t</tr>\n");
      out.write("\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td></td>\n");
      out.write("\t\t<td>\n");
      out.write("\t\t<form action=adduserhandler.jsp method=post>\n");
      out.write("\t\t<table align=center cellpadding=5>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>Name</td>\n");
      out.write("\t\t\t\t<td><input type=text name=name></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>Email</td>\n");
      out.write("\t\t\t\t<td><input type=text name=email></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>Loginid</td>\n");
      out.write("\t\t\t\t<td><input type=text name=loginid></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>Password</td>\n");
      out.write("\t\t\t\t<td><input type=password name=password></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>Type</td>\n");
      out.write("\t\t\t\t<td><select name=type>\n");
      out.write("\t\t\t\t\t<option value=admin>admin</option>\n");
      out.write("\t\t\t\t\t<option value=user>user</option>\n");
      out.write("\t\t\t\t</select></td>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t<td align=center><input type=submit value=Submit></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</table>\n");
      out.write("\t\t</form>\n");
      out.write("\t\t</td>\n");
      out.write("\t</tr>\n");
      out.write("</table>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
