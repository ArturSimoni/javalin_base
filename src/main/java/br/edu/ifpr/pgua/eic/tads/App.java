package br.edu.ifpr.pgua.eic.tads;

import br.edu.ifpr.pgua.eic.tads.controllers.IndexController;
import br.edu.ifpr.pgua.eic.tads.controllers.cadastroController;
import br.edu.ifpr.pgua.eic.tads.utils.JavalinUtils;
import io.javalin.Javalin;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        var app = JavalinUtils.makeApp(7070);
        
        IndexController indexController = new IndexController();
        cadastroController cadastroController = new cadastroController();

        app.get("/", indexController.get);
        app.get("/ola", indexController.ola);
        app.get("/cadastro", cadastroController.get);
        app.post("/cadastro",cadastroController.post);
    }
}
