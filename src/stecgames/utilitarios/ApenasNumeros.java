/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stecgames.utilitarios;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Gustavo
 */
public class ApenasNumeros extends PlainDocument{

    @Override
    public void insertString(int i, String string, AttributeSet as) throws BadLocationException {
        
        super.insertString(i, string.replaceAll("[^0-9]", ""), as);
    }
    
    
}
