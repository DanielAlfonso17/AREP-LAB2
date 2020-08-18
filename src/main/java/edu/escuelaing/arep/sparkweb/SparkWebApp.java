package edu.escuelaing.arep.sparkweb;

/**
 * Hello world!
 *
 */
import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import static spark.Spark.*;
import spark.template.thymeleaf.ThymeleafTemplateEngine;
import edu.escuelaing.arep.sparkweb.LinkedList;
import edu.escuelaing.arep.sparkweb.Nodo;
import edu.escuelaing.arep.sparkweb.Mean;
import java.util.ArrayList;
import java.util.List;

public class SparkWebApp {
    /**
     * @param args 
     * Metodo encargado de realizar las solicitudes web al servidor de Spark
     */
    public static void main(String[] args) {
        LinkedList lista = new LinkedList(); 
        Operations mean = new Mean();             
        
        port(getPort());
        
        get("/hello", (req, res) -> "<input/><button>Push num</button>");   
        get("/juego", (req, res) -> {                  
            Map<String, Object> model = new HashMap<>();                   
            return render(model, "/juego");
        });
        
        post("/juego", (req, res) ->{           
           Map<String, Object> model = new HashMap<String, Object>();           
           String valor = req.body().substring(7);
           String[] list = valor.split("%2C");
           Nodo nodo = new Nodo(0);
           lista.add(nodo);
           for(int i = 0; i< list.length; i++){
               Nodo newNodo = new Nodo(Double.parseDouble(list[i]));
               lista.add(newNodo);
           }                    
           list = null;                
           res.redirect("/operations");         
           return new ModelAndView(model, "/operations");           
        },new ThymeleafTemplateEngine());
        
        get("/operations", (req, res) -> {            
            Map<String, Object> model = new HashMap<>();            
            double media = mean.calculate(lista);
            Operations desviacion = new StandardDeviation(media);
            double deviation = desviacion.calculate(lista);
            model.put("desviacion", deviation);
            model.put("media",media);
            return render(model, "/operations");
        });
        
        post("/operations", (req,res) -> {
            Map<String, Object> model = new HashMap<>();                                    
            res.redirect("/juego");            
            return new ModelAndView(model, "/juego");     
        });
        
        
        
       
        
        
        
    }

    // declare this in a util-class
    public static String render(Map<String, Object> model, String templatePath) {
        return new ThymeleafTemplateEngine().render(new ModelAndView(model, templatePath));
    }
    
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

}