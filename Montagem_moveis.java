
package montagem_moveis;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Montagem_moveis {

   
    public static void main(String[] args) {
        // 
        
    Scanner teclado = new Scanner (System.in);
        Scanner lerNumero = new Scanner(System.in);
        
        String entrega = "";
        String statusEntrega = "AGENDADA";
        String compra = "";
        String agenda = "";
        String mont = "";
        // salvar a variave dos nome, telefone, endereco
        String nome = "";
        String telefone = "";
        String endereco = "";
        String nomeMovel = "";
        double precoM = 0;
        DateTimeFormatter datah = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       
        System.out.print(" ====================================================== ");
        System.out.print(" ========== AGENDAMENTO E REGISTRO DE MOVEL =========== ");
        System.out.print(" ====================================================== ");
        
        int opcao;
        int id;
        int idd;
        int proximoId = 1;
        int proximoIdd =1 ;
            
        do{
            System.out.println("\n1 - Cadastro de cliente ");
            System.out.println("2 - Cadastro de moveis");
            System.out.println("3 - Registrar o dia da compra");
            System.out.println("4 - Registrar o agendamento"); 
            System.out.println("5 - Atualizar o Status da Entrega");
            System.out.println("6 - Registrar o dia da entrega");
            System.out.println("7 - Registrar a data da montagem ja realizada");
            System.out.println("8 - Espelho dos Dados");
            System.out.println("0 - Encerrar ");
            System.out.println("Escolha uma opcao");
            opcao = lerNumero.nextInt(); 
            teclado.nextLine();
           

            switch (opcao){
                
                case 1:
                            // cadastro do cliente
                 id = proximoId++;
                 System.out.print("Insira seu nome completo: ");
                 nome = teclado.nextLine();
                 System.out.print("Insira o telefone: ");
                 telefone = teclado.nextLine();
                 System.out.print("Insira seu endereco para entrega: ");
                 endereco = teclado.nextLine();
                            
                System.out.println(" =========== CADASTRO CLIENTE ========== ");
                System.out.println("ID: "+id);
                System.out.println("Nome completo: "+nome);
                System.out.println("Telefone para contato: "+telefone);
                System.out.println("Endereco:" +endereco);
                System.out.println(" ====================================== ");
                break;
        
                case 2:
                 // cadastro do moveis
                 idd = proximoIdd++;
                 System.out.print("Nome: ");
                 nomeMovel = teclado.nextLine();
                 System.out.print("Preco: R$");
                 precoM = teclado.nextDouble();
                 teclado.nextLine();         
                System.out.println(" =========== CADASTRO DE MOVEIS ========== ");
                System.out.println("ID: "+idd);
                System.out.println("Nome: "+nomeMovel+ "R$ "+precoM);
                System.out.println(" ====================================== ");
                break;
                  
                case 3:
                    compra = LocalDate.now().format(datah);
                    System.out.println("Compra registrada em: "+compra);
                    break;      
                  
                case 4:
                         if (!compra.isEmpty()){
                        LocalDate dataOriginal = LocalDate.parse(compra,datah);
                        LocalDate agend = dataOriginal.plusDays(15);
                        agenda= agend.format(datah);
                    
                    System.out.println("Agendamento realizado para: "+ agenda);
                    } else {
                        System.out.println("Registre a compra primeiro!");
                    }
                    break;
                
                case 5: 
                System.out.println("===== STATUS DA ENTREGA =====");
                System.out.println("1 - Agendada");
                System.out.println("2 - Em rota");
                System.out.println("3 - Entregue");
                System.out.println("4 - Cancelada");

                  int status = lerNumero.nextInt();

                 switch(status){

                case 1:
            statusEntrega ="AGENDADA";
            System.out.println("Status da entrega: " + statusEntrega);
            break;

               case 2:
             statusEntrega ="EM ROTA";
            System.out.println("Status da entrega: " + statusEntrega);
            break;

                case 3:
             statusEntrega ="ENTREGUE";
            System.out.println("Status da entrega: " + statusEntrega);
            break;

                 case 4:
             statusEntrega ="CANCELADA";
            System.out.println("Status da entrega: " + statusEntrega);
            break;

                default:
            System.out.println("Status inválido.");
    }

                break;
                    
                case 6:
                    entrega = LocalDate.now().format(datah);
                    System.out.println("Entrega dos moveis realizada em: "+entrega);
                    break; 
                    
                case 7:
                    System.out.println("Insira a data da montagem em (dd/MM/yyyy");
                    mont = teclado.nextLine();
                    System.out.println("A montagem foi realizada em: "+mont);
                    break;
                      
                case 8:
                                     
                System.out.println(" ========================================= ");
                System.out.println(" =========== RELATORIO GERAL ============= ");
                System.out.println("Nome do cliente: "+nome);
                System.out.println("ID Cliente: " + (proximoId - 1));
                System.out.println("Telefone: "+telefone);
                System.out.println("Endereco: "+endereco);
                System.out.println("--------------------------------");
                System.out.println("ID Movel: " + (proximoIdd - 1));
                System.out.println("Movel: "+nomeMovel);
                System.out.println("Preco: R$ " + precoM);
                System.out.println("--------------------------------");
                System.out.println("Data da compra: " +compra);
                System.out.println("Agendamento realizado para: "+agenda);
                System.out.println("Status da entrega: "+statusEntrega);
                System.out.println("Entrega realizada em: "+entrega);
                System.out.println("A montagem foi realizada em:" +mont);
                System.out.println("===========================================");
                break;            
                case 0:
                    System.out.println("Sistema Encerrado!!!");
                    break;
            default:
                    System.out.println("Opção inválida! Escolha um número de 0 a 8.");
                    break;
            }
            
            }  while (opcao!=0);
      
        teclado.close();
        lerNumero.close();
    }
    
}
    

