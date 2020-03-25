/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author jonhy
 */
public class mesinvalido extends Exception {

    /**
     * Creates a new instance of <code>mesinvalido</code> without detail
     * message.
     */
    public mesinvalido() {
    }

    /**
     * Constructs an instance of <code>mesinvalido</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public mesinvalido(String msg) {
        super(msg);
    }
}
