<%-- 
    Document   : index
    Created on : 5 mars 2017, 09:02:50
    Author     : HKhoumal
--%>

<%@page import="dao.ProduitDAO"%>
<%@page import="modele.Produit"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
        ArrayList<Produit> allProduit = new ProduitDAO().findAllProduit();
        for(int i=0;i<allProduit.size();i++){
            out.println(allProduit.get(4));
        }
        
        Produit res = new ProduitDAO().findProduitById(4);
        out.println("res="+res);
        %>
    </body>
</html>
