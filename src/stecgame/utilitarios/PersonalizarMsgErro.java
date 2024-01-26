/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stecgame.utilitarios;

/**
 *
 * @author sala304b
 */
public class PersonalizarMsgErro {
    public static String getMensagem(String erro){
        if(erro.contains("Duplicate entry")){
            return "Já existe um registro cadastrado.";
        }
        
        return erro;
    } 
}
