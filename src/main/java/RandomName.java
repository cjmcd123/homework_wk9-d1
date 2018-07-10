import spark.ModelAndView;

import java.beans.beancontext.BeanContextMembershipEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class RandomName {

    private ArrayList<String> classNames;

    public RandomName(){
        this.classNames = new ArrayList<String>();
        populateLarge();
    }

    public void populateLarge(){
        this.classNames.add("Angelina");
        this.classNames.add("Steven");
        this.classNames.add("Matthew");
        this.classNames.add("Stephen");
        this.classNames.add("Roddy");
        this.classNames.add("Derek");
        this.classNames.add("Craig");
        this.classNames.add("Tara");
        this.classNames.add("Campbell");
        this.classNames.add("Farheen");
        this.classNames.add("Jack");
        this.classNames.add("Richard");
        this.classNames.add("Joeseph");
        this.classNames.add("Greg");
        this.classNames.add("Harjit");
        this.classNames.add("Debi");
        this.classNames.add("Cleyra");
        this.classNames.add("Peter");
    }

    public void populateTest(){
        this.classNames.clear();
        this.classNames.add("Angelina");
        this.classNames.add("Steven");
        this.classNames.add("Matthew");
    }


    public ArrayList<String> getClassNames() {
        return classNames;
    }

    public ArrayList<String> oneName() {
        Collections.shuffle(this.classNames);
        ArrayList<String> result = new ArrayList<String>();
        result.add(this.classNames.get(0));
        return result;
    }

    public ArrayList<String> twoNames() {
        Collections.shuffle(this.classNames);
        if (this.classNames.size() <= 2){
            return this.classNames;
        } else {
            ArrayList<String> results = new ArrayList<String>();
            results.add(this.classNames.get(0));
            results.add(this.classNames.get(1));
            return results;
        }
    }

    public ArrayList<String> threeNames() {
        Collections.shuffle(this.classNames);
        if (this.classNames.size() <= 3){
            return this.classNames;
        } else {
            ArrayList<String> results = new ArrayList<String>();
            results.add(this.classNames.get(0));
            results.add(this.classNames.get(1));
            results.add(this.classNames.get(2));
            return results;
        }
    }

    public ArrayList<String> fourNames() {
        Collections.shuffle(this.classNames);
        if (this.classNames.size() <= 4){
            return this.classNames;
        } else {
            ArrayList<String> results = new ArrayList<String>();
            results.add(this.classNames.get(0));
            results.add(this.classNames.get(1));
            results.add(this.classNames.get(2));
            results.add(this.classNames.get(3));
            return results;
        }
    }

//    public ModelAndView one(ArrayList<String> names){
//        HashMap<String, Object> model = new HashMap<>();
//        model.put("names", names);
//        model.put("template", "one.vtl");
//        return new ModelAndView(model, "layout.vtl");
//    }
//
//    public ModelAndView two(ArrayList<String> names){
//        HashMap<String, Object> model = new HashMap<>();
//        model.put("names", names);
//        model.put("template", "two.vtl");
//        return new ModelAndView(model, "layout.vtl");
//    }
//
//    public ModelAndView three(ArrayList<String> names){
//        HashMap<String, Object> model = new HashMap<>();
//        model.put("names", names);
//        model.put("template", "three.vtl");
//        return new ModelAndView(model, "layout.vtl");
//    }
//
//    public ModelAndView four(ArrayList<String> names){
//        HashMap<String, Object> model = new HashMap<>();
//        model.put("names", names);
//        model.put("template", "four.vtl");
//        return new ModelAndView(model, "layout.vtl");
//    }
}
