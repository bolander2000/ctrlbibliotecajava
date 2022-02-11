package com.mycompany.Biblioteca.Principal;

import java.util.ArrayList;
import java.util.Collections;   

import com.mycompany.Biblioteca.Amigo.*;
import com.mycompany.Biblioteca.Emprestimo.*;
import com.mycompany.Biblioteca.Item.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Principal {
	
	private static Biblioteca bib = new Biblioteca("Biblioteca Pessoal");
	private static ListaEmprestimos emprestimos = new ListaEmprestimos();
	private static ListaAmigos amigos = new ListaAmigos();
        private static ArrayList<String> titulos = new ArrayList<String>();
        private static ArrayList<Integer> idEmprestimos = new ArrayList<Integer>();
	private static ArrayList<String> EmprestimosAtual = new ArrayList<String>();
        private static ArrayList<Integer> Contador = new ArrayList<Integer>();
        
	public static void main(String[] args) {
		// apenas alguns exemplos de manipula��o em rela��o a amigos
		// da mesma forma faz com biv e emprestimos
		// criando fun��es static na main para implementar as op��es do menu
		
                //CD(String interpreteCD, String estiloCD, int IdItem, String tituloItem)
                //DVD(String diretorDVD, String generoDVD, int IdItem, String tituloItem)
                //Livro(String autorLivro, int totPagLivro, int IdItem, String tituloItem)
                CD i1 = new CD("Led Zeppelin","Rock",1,"Led Zeppelin I",Disponibilidade.DISPONIVEL);
                CD i2 = new CD("Led Zeppelin","Rock",2,"Led Zeppelin II",Disponibilidade.DISPONIVEL);
                CD i3 = new CD("Led Zeppelin","Rock",3,"Led Zeppelin III",Disponibilidade.DISPONIVEL);
                CD i4 = new CD("Led Zeppelin","Rock",4,"Led Zeppelin IV",Disponibilidade.DISPONIVEL);
                CD i5 = new CD("Duran Duran","Pop",5,"Duran Duran (Wedding Album)",Disponibilidade.DISPONIVEL);
                CD i6 = new CD("Frank Zappa","Rock",6,"Sheik Yerbouti",Disponibilidade.DISPONIVEL);
                CD i7 = new CD("Mamonas Assassinas","Rock",7,"Mamonas Assassinas",Disponibilidade.DISPONIVEL);
                CD i8 = new CD("Kraftwerk","Eletrônico",8,"Tour de France",Disponibilidade.DISPONIVEL);
                CD i9 = new CD("Supla","PapitoRock",9,"Charada Brasileiro",Disponibilidade.DISPONIVEL);
                CD i10 = new CD("The Clash","Punk",10,"London Calling",Disponibilidade.DISPONIVEL);
                
                             
                Livro i11 = new Livro("Thoreau", 500, 11, "Walden",Disponibilidade.DISPONIVEL);
                Livro i12 = new Livro("Huxley", 300, 12, "Brave New World",Disponibilidade.DISPONIVEL);
                Livro i13 = new Livro("Arthur Conan Doyle", 200, 13, "A Scandal in Bohemia",Disponibilidade.DISPONIVEL);
                Livro i14 = new Livro("G.K. Chesterton", 150, 14, "Innocence of Father Brown",Disponibilidade.DISPONIVEL);
                Livro i15 = new Livro("Jorge Amado", 300, 15, "Capitães da Areia",Disponibilidade.DISPONIVEL);
                
                DVD i16 = new DVD("Coppola","Guerra",16,"Apocalypse Now",Disponibilidade.DISPONIVEL);
                DVD i17 = new DVD("Tom Shadyac","Comédia",17,"O Mentiroso",Disponibilidade.DISPONIVEL);
                DVD i18 = new DVD("Bertolucci","Histórico",18,"O Último Imperador",Disponibilidade.DISPONIVEL);
                DVD i19 = new DVD("Sergio Leone","Western",19,"Por um Punhado de Dólares",Disponibilidade.DISPONIVEL);
                DVD i20 = new DVD("Coppola","Drama",20,"Poderoso Chefão",Disponibilidade.DISPONIVEL);
                
                bib.addItem(i1);
                bib.addItem(i2);
                bib.addItem(i3);
                bib.addItem(i4);
                bib.addItem(i5);
                bib.addItem(i6);
                bib.addItem(i7);
                bib.addItem(i8);
                bib.addItem(i9);
                bib.addItem(i10);
                bib.addItem(i11);
                bib.addItem(i12);
                bib.addItem(i13);
                bib.addItem(i14);
                bib.addItem(i15);
                bib.addItem(i16);
                bib.addItem(i17);
                bib.addItem(i18);
                bib.addItem(i19);
                bib.addItem(i20);
                
		int idAmigo;
		idAmigo = amigos.addAmigo("Fulano");
		//System.out.println("Adicionado com codigo " + idAmigo);

		idAmigo = amigos.addAmigo("Ciclano");
		//System.out.println("Adicionado com codigo " + idAmigo);

		ArrayList<Amigo> alAmigos = amigos.getListaAmigos();
		//for (Amigo amigo : alAmigos) {
		//	System.out.println(amigo);
		//}
		Menu();
		
		/*  Menu do sistema Biblioteca Pessoal
	     *  0 - sair
	     *  1 - cadastrar item
	     *  2 - cadastrar amigo
	     *  3 - emprestar
	     *  4 - devolver
	     *  5 - listar emprestimos atuais
	     *  6 - listar hist�rico de empr�stimos
	     *  7 - listar biblioteca
	     */
            }
        private static void Menu(){
                
                int menu = 0;             
                System.out.println("MINHA BIBLIOTECA");
                System.out.println("1)CADASTRAR ITEM");
                System.out.println("2)CADASTRAR AMIGO");
                System.out.println("3)EMPRESTAR");
                System.out.println("4)DEVOLVER");
                System.out.println("5)LISTAR EMPRÉSTIMOS ATUAIS");
                System.out.println("6)LISTAR HISTÓRICO DE EMPRÉSTIMOS");
                System.out.println("7)LISTAR ITENS BIBLIOTECA");
                System.out.println("8)ALTERAR DISPONIBILIDADE");
                
                System.out.println("Escolha uma opçao:");
                Scanner scanner =  new Scanner(System.in);
                menu = scanner.nextInt();
                
                
                switch(menu){
                    case 1:
                        cadastroItem();
                        break;
                    case 2:
                        cadastroAmigo();
                        break;
                    case 3:
                        emprestimo();
                        break;
                    case 4:
                        devolucao();
                        break;
                    case 5:
                        listarEmprestimo();
                        break;
                    case 6:
                        historico();
                        break;
                    case 7:
                        inventario();
                        break;
                    case 8:
                        alterarEstado();
                        break;
                    default:
                        Menu();                        
                    }
        }
        
        private static void cadastroItem(){
            
            int menu = 0;
            Scanner scanner =  new Scanner(System.in);
            String titulo = "titulo";
            String autor = "autor";
            String estilo = "autor";
            String genero = "autor";
            int paginas = 0;
                        
            System.out.println("Qual tipo de item deseja cadastrar?");  
            System.out.println("1)LIVRO");
            System.out.println("2)CD");
            System.out.println("3)DVD");
            System.out.println("4)VOLTAR MENU PRINCIPAL");
            menu = scanner.nextInt();
            
            switch(menu){
                case 1:
                    cadastroLivro();
                    break;
                case 2:
                    cadastroCD();
                    break;
                case 3:
                    cadastroDVD();
                    break;
                case 4:
                    Menu();
                    break;
                default:
                    Menu();
                    break;
                    
            }
            
                    
            /*
            switch(menu){
                    case 1:
                        int novoid;
                        int menuconf=0;
                        cadastroLivro();
                        switch(menuconf){
                                case 1:
                                    
                                break;
                                case 2:
                                    cadastroLivro();
                                break;
                                case 3:
                                    cadastroItem();
                                break;
                                case 4:
                                    Menu();
                                break;
                                default:
                                    Menu();
                                break;                                       
                        }
                        break;
                    case 2:
                        int novoid2;
                        int menuconf2=0;
                        cadastroCD();
                        switch(menuconf2){
                                case 1:
                                    novoid2 = bib.getIdNewItem();
                                    CD cd = new CD(autor,estilo,novoid2,titulo);
                                    bib.addItem(cd);
                                    System.out.println("CD ADICIONADO COM SUCESSO");
                                break;
                                case 2:
                                    cadastroCD();
                                break;
                                case 3:
                                    cadastroItem();
                                break;
                                case 4:
                                    Menu();
                                break;
                                default:
                                    cadastroCD();
                                break;
                        }
                        break;
                    case 3:
                        int novoid3;
                        int menuconf3=0;
                        cadastroDVD();
                        switch(menuconf3){
                                case 1:
                                    novoid3 = bib.getIdNewItem();
                                    DVD dvd = new DVD(autor,genero,novoid3,titulo);
                                    bib.addItem(dvd);
                                    System.out.println("DVD ADICIONADO COM SUCESSO");
                                break;
                                case 2:
                                    cadastroDVD();
                                break;
                                case 3:
                                    cadastroItem();
                                break;
                                case 4:
                                    Menu();
                                break;
                                default:
                                    cadastroDVD();
                                break;
                        }
                        break;
                    case 4:
                        Menu();
                        break;
                    default:
                        
        } 
            */
}
        private static void cadastroLivro(){
                        Scanner scanner =  new Scanner(System.in);
                        String titulo = null;
                        String autor = null;
                        int paginas = 0;
                        int menuconf=2;
                        int novoid = 0;
                        int menuconf2 =1;
                        String estilo;
                        String genero;
                        
                        while (menuconf2 ==1){
                            while(menuconf == 2){
                                System.out.println("Digite o título do livro:");
                                titulo = scanner.nextLine();
                                System.out.println("Digite o autor do livro:");
                                autor = scanner.nextLine();
                                System.out.println("Digite o numero de paginas do livro:");
                                paginas = scanner.nextInt();
                                System.out.println("Deseja adicionar o livro de Título: " + titulo + " do Autor: " + autor + " de " + paginas +" páginas");
                                System.out.println("Escolha uma opção:");
                                System.out.println("1)SIM");
                                System.out.println("2)NÃO");
                                System.out.println("3)VOLTAR MENU CADASTRO");
                                System.out.println("4)VOLTAR MENU PRINCIPAL");
                                menuconf = scanner.nextInt();
                                scanner.nextLine();
                            }

                            if (menuconf == 1){

                                           
                                    novoid = bib.getIdNewItem();
                                    Livro livro = new Livro(autor,paginas,novoid,titulo,Disponibilidade.DISPONIVEL);
                                    bib.addItem(livro);
                                    System.out.println("LIVRO ADICIONADO COM SUCESSO");
                                    System.out.println("Deseja adicionar mais um livro?");
                                    System.out.println("1)SIM");
                                    System.out.println("2)VOLTAR MENU PRINCIPAL");
                                    menuconf2 = scanner.nextInt();
                                    if (menuconf2 == 1){
                                        menuconf = 2;
                                        scanner.nextLine();
                                    }
                                        
                                }
                            if (menuconf == 3) {
                                cadastroItem();
                            }
                            if (menuconf == 4){
                                Menu();
                            }
                        }
                        Menu();
                        }
                        
                            
                            
                            
                        
                        
                        
        
        
        
        private static void cadastroCD(){
                        Scanner scanner =  new Scanner(System.in);
                        String titulo = null;
                        String autor = null;
                        int paginas = 0;
                        int menuconf=2;
                        int novoid = 0;
                        int menuconf2 =1;
                        String estilo="asdas";
                        String genero;
                        
                        while (menuconf2 ==1){
                            while(menuconf == 2){
                                System.out.println("Digite o título do álbum do CD:");
                                titulo = scanner.nextLine();
                                System.out.println("Digite o intérprete do CD:");
                                autor = scanner.nextLine();
                                System.out.println("Digite o estilo musical do CD:");
                                estilo = scanner.nextLine();
                                System.out.println("Deseja adicionar o CD: \nTítulo: " + titulo + " - Intérprete: " + autor + " de estilo " + estilo);
                                System.out.println("Escolha uma opção:");
                                System.out.println("1)SIM");
                                System.out.println("2)NÃO");
                                System.out.println("3)VOLTAR MENU CADASTRO");
                                System.out.println("4)VOLTAR MENU PRINCIPAL");
                                menuconf = scanner.nextInt();
                                scanner.nextLine();
                            }

                            if (menuconf == 1){

                                    //CD(String interpreteCD, String estiloCD, int IdItem, String tituloItem)    
                                    novoid = bib.getIdNewItem();
                                    CD cd = new CD(autor,estilo,novoid,titulo,Disponibilidade.DISPONIVEL);
                                    bib.addItem(cd);
                                    System.out.println("CD ADICIONADO COM SUCESSO");
                                    System.out.println("Deseja adicionar mais um CD?");
                                    System.out.println("1)SIM");
                                    System.out.println("2)VOLTAR MENU PRINCIPAL");
                                    menuconf2 = scanner.nextInt();
                                    if (menuconf2 == 1){
                                        menuconf = 2;
                                        scanner.nextLine();
                                    }
                                        
                                }
                            if (menuconf == 3) {
                                cadastroItem();
                            }
                            if (menuconf == 4){
                                Menu();
                            }
                        }
                        Menu();
            
                        /*
                        Scanner scanner =  new Scanner(System.in);
                        String titulo;
                        String autor;
                        String estilo;
                        int menuconf2=0;
                        System.out.println("Digite o título do álbum do CD:");
                        titulo = scanner.nextLine();
                        System.out.println("Digite o intérprete do CD:");
                        autor = scanner.nextLine();
                        System.out.println("Digite o estilo musical do CD:");
                        estilo = scanner.nextLine();
                        System.out.println("Deseja adicionar o CD: \nTítulo: " + titulo + "\nIntérprete: " + autor + "\nde estilo " + estilo);
                        System.out.println("Escolha uma opção:");
                        System.out.println("1)SIM");
                        System.out.println("2)NÃO");
                        System.out.println("3)VOLTAR MENU CADASTRO");
                        System.out.println("4)VOLTAR MENU PRINCIPAL");
                        menuconf2 = scanner.nextInt();
                        */
            }
        private static void cadastroDVD(){
            Scanner scanner =  new Scanner(System.in);
                        String titulo = null;
                        String autor = null;
                        int paginas = 0;
                        int menuconf=2;
                        int novoid = 0;
                        int menuconf2 =1;
                        String estilo="asdas";
                        String genero="asdasas";
                        
                        while (menuconf2 ==1){
                            while(menuconf == 2){
                                System.out.println("Digite o título do DVD:");
                                titulo = scanner.nextLine();
                                System.out.println("Digite o diretor do DVD:");
                                autor = scanner.nextLine();
                                System.out.println("Digite o gênero do filme:");
                                genero = scanner.nextLine();
                                System.out.println("Deseja adicionar o DVD: \nTítulo: " + titulo + "\nDiretor: " + autor + "\nde genero " + genero);
                                System.out.println("Escolha uma opção:");
                                System.out.println("1)SIM");
                                System.out.println("2)NÃO");
                                System.out.println("3)VOLTAR MENU CADASTRO");
                                System.out.println("4)VOLTAR MENU PRINCIPAL");
                                menuconf = scanner.nextInt();
                                scanner.nextLine();
                            }

                            if (menuconf == 1){

                                    //DVD(String diretorDVD, String generoDVD, int IdItem, String tituloItem))    
                                    novoid = bib.getIdNewItem();
                                    DVD dvd = new DVD(autor,genero,novoid,titulo,Disponibilidade.DISPONIVEL);
                                    bib.addItem(dvd);
                                    System.out.println("DVD ADICIONADO COM SUCESSO");
                                    System.out.println("Deseja adicionar mais um DVD?");
                                    System.out.println("1)SIM");
                                    System.out.println("2)VOLTAR MENU PRINCIPAL");
                                    menuconf2 = scanner.nextInt();
                                    if (menuconf2 == 1){
                                        menuconf = 2;
                                        scanner.nextLine();
                                    }
                                        
                                }
                            if (menuconf == 3) {
                                cadastroItem();
                            }
                            if (menuconf == 4){
                                Menu();
                            }
                        }
                        Menu();
            
            
            
            
            /*
                        int menuconf3=0;
                        Scanner scanner =  new Scanner(System.in);
                        String titulo;
                        String autor;
                        String genero;
                        System.out.println("Digite o título do DVD:");
                        titulo = scanner.nextLine();
                        System.out.println("Digite o diretor do DVD:");
                        autor = scanner.nextLine();
                        System.out.println("Digite o gênero do filme:");
                        genero = scanner.nextLine();
                        System.out.println("Deseja adicionar o DVD: \nTítulo: " + titulo + "\nDiretor: " + autor + "\nde genero " + genero);
                        System.out.println("Escolha uma opção:");
                        System.out.println("1)SIM");
                        System.out.println("2)NÃO");
                        System.out.println("3)VOLTAR MENU CADASTRO");
                        System.out.println("4)VOLTAR MENU PRINCIPAL");
                        menuconf3 = scanner.nextInt();
            */
            }
        private static void inventario(){
            int menu = 1;
            Scanner scanner =  new Scanner(System.in);
            int i =0;
            
            while (menu == 1){
                while (i < bib.getAlItemSize()){
                titulos.add(bib.getAlItem().get(i).getTituloItem()+" - " + bib.getAlItem().get(i).getDispItem()+" - id: " +bib.getAlItem().get(i).getIdItem());
                //disp.add(bib.getAlItem().get(i).getDispItem());
                i++;
                }
                
                
                
                Collections.sort(titulos);
                int j = 0;
                int num = 1;
                while (j < titulos.size()){
                   System.out.println(titulos.get(j));
                   j++;
                   num ++;
                   
                }
                
                System.out.println("Deseja visualizar o inventário mais uma vez?");
                System.out.println("1)SIM");
                System.out.println("2)IR PARA EMPRESTIMO");
                System.out.println("3)IR PARA HISTORICO");
                System.out.println("4)VOLTAR MENU PRINCIPAL");
                menu = scanner.nextInt();
            }
                    
            titulos.clear();
            if (menu==2)
                emprestimo();
            if (menu==3)
                historico();
            if(menu==4)
                Menu();
            Menu();
            
        }
        private static void emprestimo(){
            int codigoItem =0;
            int i = 0;
            int num = 1;
            int idAmigo = 0;
            int menu = 2;
            int dia=0;
            int mes=0;
            int ano=0;
            int menu1;
            
            Scanner scanner =  new Scanner(System.in);
            System.out.println("Selecione uma opção:");
            System.out.println("1)Digitar o código do item a ser emprestado");
            System.out.println("2)Olhar o código no Inventário");
            System.out.println("3)VOLTAR MENU PRINCIPAL");
            menu1 = scanner.nextInt();
            
            if(menu1==2)
                inventario();
            if(menu1==3)
                Menu();
            
            while (menu==2){
                System.out.println("Digite o código do item a ser emprestado:");
                codigoItem = scanner.nextInt();
                System.out.println("Selecione o amigo que vai emprestar:");
                while(i < amigos.getAlAmigosSize()){

                    System.out.println("ID - "+ num +" | Nome - "+amigos.getListaAmigos().get(i).getNomeAmigo());
                    i++;
                    num++;
                }
                idAmigo = scanner.nextInt();
                
                
                
                System.out.println("Digite o dia do emprestimo:");
                dia = scanner.nextInt();
                System.out.println("Digite o mês do emprestimo:");
                mes = scanner.nextInt();
                System.out.println("Digite o ano do emprestimo:");
                ano = scanner.nextInt();
                
                
                System.out.println("O item a ser emprestado é "+ bib.getAlItem().get(codigoItem-1).getTituloItem() +
                        " por " + amigos.getListaAmigos().get(idAmigo-1).getNomeAmigo());
                System.out.println("Confirma?");
                System.out.println("1)SIM");
                System.out.println("2)NÃO");
                System.out.println("3)VOLTAR MENU PRINCIPAL");
                menu = scanner.nextInt();
            }
            if (menu==1){
                Item titulo;
                Amigo amigo;
                titulo = bib.getAlItem().get(codigoItem-1);
                amigo = amigos.getListaAmigos().get(idAmigo-1);
                LocalDate data = LocalDate.of(ano, mes, dia);
                Emprestimo emprestimo = new Emprestimo(idAmigo, codigoItem, data,titulo,amigo);
                emprestimos.addEmprestimo(emprestimo);
                bib.getAlItem().get(codigoItem-1).setDispItem(Disponibilidade.EMPRESTADO);
                
            }
            if (menu ==3){
                Menu();
            }
            Menu();
        }
        private static void cadastroAmigo(){
            int idAmigo;
            String nome;
            Scanner scanner =  new Scanner(System.in);
            System.out.println("Digite o nome do Amigo que deseja cadastrar:");
            nome = scanner.nextLine();
            idAmigo = amigos.addAmigo(nome);
            ArrayList<Amigo> alAmigos = amigos.getListaAmigos();
		for (Amigo amigo : alAmigos) {
			System.out.println(amigo);
		}
            Menu();
            
        }
        private static void devolucao(){
            int codigoItem = 0;
            int menu = 2;
            int i =0;
            Scanner scanner =  new Scanner(System.in);
            while(menu==2){
                System.out.println("Digite o código do item a ser devolvido:");
                codigoItem = scanner.nextInt();
                System.out.println("Deseja devolver: "+bib.getAlItem().get(codigoItem-1).getTituloItem()+"?");
                System.out.println("1)SIM");
                System.out.println("2)NÃO");
                System.out.println("3)VOLTAR MENU PRINCIPAL");
                menu = scanner.nextInt();
            }
            if(menu==1)
            {
                
                //Emprestimo(int idItem, LocalDate dataDevolucao, Item item, Amigo amigo)
                Emprestimo devolucao = new Emprestimo(codigoItem,LocalDate.now(),bib.getAlItem().get(codigoItem-1));
                bib.getAlItem().get(codigoItem-1).setDispItem(Disponibilidade.DISPONIVEL);
                emprestimos.addEmprestimo(devolucao);
            }
            if(menu==3)
                Menu();
            Menu();
        }
        private static void historico(){
            int codigoItem = 0;
            int menu =1;
            int i =0;
            int menu1 =0;
            Scanner scanner =  new Scanner(System.in);
            
            System.out.println("Selecione uma opção:");
            System.out.println("1)Digitar o código do item a ser procurado");
            System.out.println("2)Olhar o código no Inventário");
            System.out.println("3)Voltar Menu Principal");
            menu1 = scanner.nextInt();
            
            if(menu1==2)
                inventario();
            if(menu1==3)
                Menu();
                
            
                System.out.println("Digite o código do item a ser procurado:");
                codigoItem = scanner.nextInt();
                
                while(i<emprestimos.getAlEmprestimos().size()){
                    if (emprestimos.getAlEmprestimos().get(i).getItem().getIdItem()==codigoItem){
                    
                    System.out.println(emprestimos.getAlEmprestimos().get(i));
                    i++;
                }
                else
                    i++;
                }
                Menu();
                
            }
            
            
        
        private static void listarEmprestimo(){
                      
            int i=0;
            
            while(i<emprestimos.getAlEmprestimos().size()){
                if (emprestimos.getAlEmprestimos().get(i).getItem().getDispItem()==Disponibilidade.EMPRESTADO){
                    
                    System.out.println(emprestimos.getAlEmprestimos().get(i));
                    i++;
                }
                else
                    i++;
            }
            Menu();
                
            }
            /*
            System.out.println();
            
            
            /*
            int j =0;
            int k =0;
            
            while(k<idEmprestimos.size()){
                
            while(j<emprestimos.getAlEmprestimos().size()){
                if(emprestimos.getAlEmprestimos().get(j).getIdItem()==idEmprestimos.get(k)){
                    System.out.println(emprestimos.getAlEmprestimos().get(j));
                    j++;                    
                }
                j++;
                }
            k++;
            }
            */        
            
          private static void alterarEstado(){
              int codigoItem = 0;
            int menu =1;
            int menu2=0;
            int i =0;
            //DISPONIVEL, CONSULTALOCAL, EMPRESTADO, DANIFICADO, EXTRAVIADO;
            Scanner scanner =  new Scanner(System.in);
            while(menu==1){
                System.out.println("Digite o código do item que terá seu estado modificado:");
                codigoItem = scanner.nextInt();
                System.out.println("Deseja mudar o estado do item de título "+bib.getAlItem().get(codigoItem-1).getTituloItem() +" para:");
                System.out.println("1)CONSULTA LOCAL");
                System.out.println("2)DANIFICADO");
                System.out.println("3)EXTRAVIADO");
                System.out.println("4)VOLTAR MENU PRINCIPAL");
                menu2 = scanner.nextInt();
                switch(menu2){
                    case 1:
                        bib.getAlItem().get(codigoItem-1).setDispItem(Disponibilidade.CONSULTALOCAL);
                        break;
                    case 2:
                        bib.getAlItem().get(codigoItem-1).setDispItem(Disponibilidade.DANIFICADO);
                        break;
                    case 3:
                        bib.getAlItem().get(codigoItem-1).setDispItem(Disponibilidade.EXTRAVIADO); 
                        break;
                    default:
                        Menu();
                        break;
                }
                
                
                System.out.println("Deseja fazer outra mudança?");
                System.out.println("1)SIM");
                System.out.println("2)VOLTAR MENU PRINCIPAL");
                menu = scanner.nextInt();
            }
            Menu();
        }  
                
}
        

