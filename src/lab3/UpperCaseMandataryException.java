/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Sanuth
 */
public class UpperCaseMandataryException extends IllegalArgumentException{
    private static final String MSG ="Input must be upper case";
    
    public UpperCaseMandataryException() {
        super(MSG);
    }

    public UpperCaseMandataryException(String s) {
        super(MSG);
    }

    public UpperCaseMandataryException(String message, Throwable cause) {
        super(MSG, cause);
    }

    public UpperCaseMandataryException(Throwable cause) {
        super(cause);
    }
    
}
