/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stecgames.controle;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Sosciopata
 */
public class ControleLimiteDigitos extends PlainDocument{
private int quantidadeMax;
public ControleLimiteDigitos(int maxLen){
   super();
   if(maxLen<=0)
       throw  new IllegalArgumentException("Especifique o limite de caracter");
   quantidadeMax = maxLen;
}
 public void insertString(int offset, String str, AttributeSet attr)
 throws BadLocationException{
    if(str==null||getLength()==quantidadeMax)
        return;
    int totalquantia =(getLength()+str.length());
    if(totalquantia<=quantidadeMax){
        super.insertString(offset, str.replaceAll("[^a-z|^A-Z|^ ]", ""), attr);
        return;
    }
    String nova = str.substring(0, getLength() - quantidadeMax);
    super.insertString(offset, nova, attr);
 }        
}
