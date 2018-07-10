import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;

import static spark.Spark.get;
import static spark.SparkBase.staticFileLocation;

public class Controller {

    public static void main(String[] args) {
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
        final RandomName randomName = new RandomName();

        get("/randomName/one", (req, res) -> {
            ArrayList<String> names = randomName.oneName();
            HashMap<String, Object> model = new HashMap<>();
            model.put("names", names);
            model.put("template", "one.vtl");
            model.put("size", 1);
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

        get("/randomName/two", (req, res) -> {
            ArrayList<String> names = randomName.twoNames();
            if (names.size() <2) {
                HashMap<String, Object> model = new HashMap<>();
                model.put("names", names);
                model.put("template", "one.vtl");
                model.put("size", 1);
                return new ModelAndView(model, "layout.vtl");
            } else {
                HashMap<String, Object> model = new HashMap<>();
                model.put("names", names);
                model.put("template", "two.vtl");
                model.put("size", 2);
                return new ModelAndView(model, "layout.vtl");
            }
        }, velocityTemplateEngine);

        get("/randomName/three", (req, res) -> {
            ArrayList<String> names = randomName.threeNames();
            if (names.size() < 3) {
                if (names.size() <2) {
                    HashMap<String, Object> model = new HashMap<>();
                    model.put("names", names);
                    model.put("template", "one.vtl");
                    model.put("size", 1);
                    return new ModelAndView(model, "layout.vtl");
                } else {
                    HashMap<String, Object> model = new HashMap<>();
                    model.put("names", names);
                    model.put("template", "two.vtl");
                    model.put("size", 2);
                    return new ModelAndView(model, "layout.vtl");
                }
            } else {
                HashMap<String, Object> model = new HashMap<>();
                model.put("names", names);
                model.put("template", "three.vtl");
                model.put("size", 3);
                return new ModelAndView(model, "layout.vtl");
            }
        }, velocityTemplateEngine);

        get("/randomName/four", (req, res) -> {
            ArrayList<String> names = randomName.fourNames();
            if (names.size() < 4) {
                if (names.size() < 3) {
                    if (names.size() <2) {
                        HashMap<String, Object> model = new HashMap<>();
                        model.put("names", names);
                        model.put("template", "one.vtl");
                        model.put("size", 1);
                        return new ModelAndView(model, "layout.vtl");
                    } else {
                        HashMap<String, Object> model = new HashMap<>();
                        model.put("names", names);
                        model.put("template", "two.vtl");
                        model.put("size", 2);
                        return new ModelAndView(model, "layout.vtl");
                    }
                } else {
                    HashMap<String, Object> model = new HashMap<>();
                    model.put("names", names);
                    model.put("template", "three.vtl");
                    model.put("size", 3);
                    return new ModelAndView(model, "layout.vtl");
                }
            } else {
                HashMap<String, Object> model = new HashMap<>();
                model.put("names", names);
                model.put("template", "four.vtl");
                model.put("size", 4);
                return new ModelAndView(model, "layout.vtl");
            }
        }, velocityTemplateEngine);

        get("/randomName/test", (req, res) -> {
            randomName.populateTest();
            ArrayList<String> names = randomName.fourNames();
            if (names.size() < 4) {
                if (names.size() < 3) {
                    if (names.size() <2) {
                        HashMap<String, Object> model = new HashMap<>();
                        model.put("names", names);
                        model.put("template", "one.vtl");
                        model.put("size", 1);
                        return new ModelAndView(model, "layout.vtl");
                    } else {
                        HashMap<String, Object> model = new HashMap<>();
                        model.put("names", names);
                        model.put("template", "two.vtl");
                        model.put("size", 2);
                        return new ModelAndView(model, "layout.vtl");
                    }
                } else {
                    HashMap<String, Object> model = new HashMap<>();
                    model.put("names", names);
                    model.put("template", "three.vtl");
                    model.put("size", 3);
                    return new ModelAndView(model, "layout.vtl");
                }
            } else {
                HashMap<String, Object> model = new HashMap<>();
                model.put("names", names);
                model.put("template", "four.vtl");
                model.put("size", 4);
                return new ModelAndView(model, "layout.vtl");
            }
        }, velocityTemplateEngine);

    }

}
