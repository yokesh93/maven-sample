<%@ page language="java" import="java.util.*" trimDirectiveWhitespaces="true"%>
<h1 align="center" > Version Info  </h1>
<%
 ResourceBundle buildInfo =ResourceBundle.getBundle("build");
 Set<String> keySet  = buildInfo.keySet();
 TreeSet<String> sortedSet=new TreeSet<String>(keySet);
 Iterator<String> iterator=sortedSet.iterator();
%>
<table align="center" >
	<%
       while(iterator.hasNext()){
    	  String key = iterator.next();
    	  String value = buildInfo.getString(key);
      %>
      <tr>
      		<td><%= key%></td>
      		<td><%= value%></td>
      </tr>
	<%
        }
     %>
</table>