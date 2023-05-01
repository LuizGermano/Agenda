/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agenda;

/**
 *
 * @author mgerm
 */
public class Contato {
    protected String nome;
    protected String email;
    
    
    public Contato(){
        
    }
    
    public Contato(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    public boolean adicionarContato(Contato contato){
            if(contato == null){
               return true;
            }
            if(buscarContato(contato.getNome()) != null){
                return true;
            }else{
                return false;
            }
    }
    
    public Contato buscarContato(String nome){
            if(nome == null){
                return null;
            }
        return null;
    }
    
    public boolean excluirContato(Contato contato){
        if(contato.getNome() != null){
            this.nome = null;
            this.email = null;
            return true;
        }else{
            return true;
        }
    }

    
}    
 


