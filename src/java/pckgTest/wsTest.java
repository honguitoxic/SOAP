/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckgTest;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

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
}
