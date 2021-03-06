package com.example.beeradviser.web;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import com.example.beeradviser.model.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

@WebServlet(name = "beerServlet", value = "/selectbeer")
public class BeerSelect extends HttpServlet {

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws IOException, ServletException {

        String c = request.getParameter("color");
        BeerExpert be = new BeerExpert();
        List result = be.getBrands(c);

        request.setAttribute("styles", result);

        RequestDispatcher view =
                request.getRequestDispatcher("result.jsp");

        view.forward(request, response);
    }

}
