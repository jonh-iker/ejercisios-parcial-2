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
public class anioinvalido extends Exception {

    /**
     * Creates a new instance of <code>anioinvalido</code> without detail
     * message.
     */
    public anioinvalido() {
    }

    /**
     * Constructs an instance of <code>anioinvalido</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public anioinvalido(String msg) {
        super(msg);
    }
}
