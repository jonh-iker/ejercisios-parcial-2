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
public class diainvalido extends Exception {

    /**
     * Creates a new instance of <code>diainvalido</code> without detail
     * message.
     */
    public diainvalido() {
    }

    /**
     * Constructs an instance of <code>diainvalido</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public diainvalido(String msg) {
        super(msg);
    }
}
