package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <style>\n");
      out.write("        table tr :nth-child(odd){background-color:red}\n");
      out.write("        \n");
      out.write("        table tr :nth-child(even){background-color: blue}\n");
      out.write("    </style>\n");
      out.write("        <script src=\"script/angularjs.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            var myApp=angular.module(\"myModule\",[]);\n");
      out.write("            myApp.controller(\"myController\",function($scope){\n");
      out.write("                \n");
      out.write("                $scope.message=\"Hello by angular JS\";\n");
      out.write("            });\n");
      out.write("            myApp.controller(\"myController1\",function($scope){\n");
      out.write("                \n");
      out.write("                var result=[\n");
      out.write("                    {name:\"amar\",fees:1200},\n");
      out.write("                    {name:\"samar\",fees:3200},\n");
      out.write("                    {name:\"umar\",fees:2200}\n");
      out.write("                    \n");
      out.write("                ];\n");
      out.write("                $scope.data=result;\n");
      out.write("            });\n");
      out.write("            myApp.controller(\"myController2\",function($scope){\n");
      out.write("                $scope.today=new Date();\n");
      out.write("                \n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body ng-app=\"myModule\" ng-init=\"name\" ng-init=\"q=1\" ng-init=\"p=1\">\n");
      out.write("    <center>\n");
      out.write("        <h1>5+7={{5+7}}</h1>\n");
      out.write("        <div ng-controller=\"myController\">\n");
      out.write("            <h1>Message :{{message}}</h1>\n");
      out.write("        </div>\n");
      out.write("        Number :<input type=\"text\" ng-model=\"name\"/>\n");
      out.write("            <br>\n");
      out.write("            wrote: <div style=\"font-family: chiller\">{{name}}</div>\n");
      out.write("            Quantity:<input type=\"text\" ng-model=\"q\"/>\n");
      out.write("            <br>\n");
      out.write("            Price:<input type=\"text\" ng-model=\"p\"/>\n");
      out.write("            <br>\n");
      out.write("            Total Price={{p*q}}\n");
      out.write("            \n");
      out.write("            <table border=\"1\" ng-controller=\"myController1\">\n");
      out.write("                <tr><td>Sno</td><td>Name</td><td>Fees</td></tr>\n");
      out.write("                \n");
      out.write("                <tr ng-repeat=\"x in data|orderBy:'fees':'reverse' | limitTo : 2\" >{{x}}<td>{{$index+1}}</td><td>{{x.name| uppercase}}</td><td>{{x.fees| currency}}</td></tr>0\n");
      out.write("            </table>\n");
      out.write("            <br><br>\n");
      out.write("            Number:<input type=\"number\" ng-model=\"n1\"/>\n");
      out.write("            <div ng-if=\"n1%2==0\">\n");
      out.write("                no is even\n");
      out.write("            </div>\n");
      out.write("            <div ng-if=\"n1%2!==0\">\n");
      out.write("                no is odd\n");
      out.write("            </div>\n");
      out.write("            Enter character :<input type=\"text\" ng-model=\"c\"/>\n");
      out.write("            <div ng-switch=\"c\">\n");
      out.write("                <div ng-switch-when=\"a\">Vowel</div>\n");
      out.write("                <div ng-switch-when=\"e\">Vowel</div>\n");
      out.write("                <div ng-switch-when=\"i\">Vowel</div>\n");
      out.write("                <div ng-switch-when=\"o\">Vowel</div>\n");
      out.write("                <div ng-switch-when=\"u\">Vowel</div>\n");
      out.write("                <div ng-switch-default=\"a\">Consonant</div>\n");
      out.write("            </div>\n");
      out.write("            <h1 ng-controller=\"myController2\">date:{{today| date:'dd/MM/yy'}}</h1>\n");
      out.write("            <table>\n");
      out.write("                <tr><td>id</td><td>name</td><td>salary</td></tr>\n");
      out.write("            ");

                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("select * from emp");
                while(rs.next())
                {
                
            
      out.write("\n");
      out.write("            <tr><td>");
      out.print(rs.getInt(1));
      out.write("</td></tr>\n");
      out.write("            <tr><td>");
      out.print(rs.getString(2));
      out.write("</td></tr>\n");
      out.write("            <tr><td>");
      out.print(rs.getInt(3));
      out.write("</td></tr>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("            </table>\n");
      out.write("    </center>\n");
      out.write("    </body>\n");
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
