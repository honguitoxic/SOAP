/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckgTest;

import java.text.DecimalFormat;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import static pckgTest.InfixToPostfix.NumberValidator;

/**
 *
 * @author Famila
 */
@WebService(serviceName = "wsTest")
public class wsTest {

    @WebMethod(operationName = "add")
    public String add(@WebParam(name = "i") int i, @WebParam(name = "j") int j) {
        //TODO write your implementation code here:
        return null;
    }

    @WebMethod(operationName = "substract")
    public String substract(@WebParam(name = "i") int i, @WebParam(name = "j") int j) {
        int k = i - j;
        return Integer.toString(k);
    }
    
    @WebMethod(operationName = "evaluate")
    public String evaluate(@WebParam(name = "expr") String expr) throws Exception {
        expr = expr.replace("'", "");
        expr = expr.replace("[", "");
        expr = expr.replace("]", "");
        InfixToPostfix test = new InfixToPostfix();
        String[] infix = expr.split(", ");
        String[] postfix = new String[infix.length];
        if (NumberValidator(infix)) {
            test.convert(infix, postfix);
            DecimalFormat formatter = new DecimalFormat("#,###.00");

            return formatter.format(test.evaluate(postfix));
        }
        else
            throw new Exception("Invalid input");
    }
}
