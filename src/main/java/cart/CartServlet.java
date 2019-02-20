package cart;

import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

@WebServlet("")
public class CartServlet extends HttpServlet {

    public void init() throws ServletException {
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {
        doPost(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {

        //Load all items in the array list (item no, item name, item price)
        List<String> itemsArray = new ArrayList<String>();
        itemsArray.add("Chair");
        itemsArray.add("Lamp");
        itemsArray.add("Table");
        itemsArray.add("Comode");

        //send the items in arraylist to "cart.jsp"
        req.setAttribute("Items", itemsArray);
        String nextPage = "index.jsp";
        RequestDispatcher rd = req.getRequestDispatcher(nextPage);
        rd.forward(req, resp);
    }

    public void destroy() {
    }
}

