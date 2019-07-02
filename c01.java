//Write a program that outputs all possibilities to put + or - or nothing between the numbers 1,2,…,9 (in this order) 
//such that the result is 100. For example 1 + 2 + 3 - 4 + 5 + 6 + 78 + 9 = 100.

public class MyClass {
    public static void main(String args[]) {
        ScriptEngine engine = new ScriptEngineManager().getEngineByExtension("js");
        //generate strings then evaluate with some JS
        String expression = " 1 2 3 4 5 6 7 8 9"
        
        for (int first = 1; first < 16; first ++) {
            expression = expresssion.substring(0,2*first)+ "+"+ expression.substring((2*first)+1)
            equals100(expression);
        }
        
        //call some JS to evaluate 

        }
        
        
    }
    
    void equals100(String expression) {
        expression = expression.replaceAll("\\s+",""); //remove whitespaces
        Object result = engine.eval(expression);
        if (result == 100) { 
            System.out.println(expression);
        }
    }
}
