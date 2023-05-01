/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agenda;

import java.util.Scanner;

/**
 *
 * @author mgerm
 */
public class AgendaTeste {
    public static void main(String[] args) {
        Scanner pessoa = new Scanner(System.in);
        Contato contatos =  new Contato();
        Contato nomeBusca = new Contato();
        Contato nomeExcluir = new Contato();
        int opcao;
        do{
            System.out.println("1. Cadastrar novo contato");
            System.out.println("2. Encontrar contato");
            System.out.println("3. Excluir Contato");
            System.out.println("4. Sair");
            System.out.println("Selecione umas das opções: ");
            opcao = pessoa.nextInt();
            pessoa.nextLine();
            switch(opcao){
                case 1:
                    System.out.println("Nome: ");
                    contatos.setNome(pessoa.nextLine());
                    System.out.println("Email: ");
                    contatos.setEmail(pessoa.nextLine());
                    contatos.adicionarContato(contatos);
                    break;
                case 2:
                    System.out.println("Digite o nome de quem deseja encontrar: ");
                    nomeBusca.setNome(pessoa.nextLine());
                    Contato contatoBuscado = null;
                    if(contatos.getNome().equals(nomeBusca.getNome())){
                        contatoBuscado = contatos;
                    }
                    if(contatoBuscado != null){
                        System.out.println("Contato encontrado: " +contatoBuscado.getNome()+ " - " +contatoBuscado.getEmail());
                    }else{
                        System.out.println("Contato não encontrado.");
                    }break;
                case 3:
                    System.out.println("Digite o nome do contato que deseja excluir: ");
                    nomeExcluir.setNome(pessoa.nextLine());
                    boolean excluiuContato = contatos.excluirContato(nomeExcluir);
                    if(excluiuContato){
                        System.out.println("Contato excluído.");
                    }else{
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Você saiu.");
                    break;
                    default:
                    System.out.println("Você selecionou uma opção que não existe.");
            }      
               
        }while(opcao !=4);
        
    }
}
