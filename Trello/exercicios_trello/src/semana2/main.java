package semana2;

import semana2.entidades.Nutricionista;
import semana2.entidades.Paciente;
import semana2.repositorio.ListaPacientes;

import java.util.Scanner;


public class main {

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int opcao = -1;
        while(opcao != 0){
        System.out.println("""
                    Escolha uma ação:
                     1 - Criar novo paciente
                     2 - Listar pacientes
                     3 - Alterar informações do  Paciente
                     4 - Mostrar informações do Paciente
                     5 - Registrar atividade física
                     6 - Remover Paciente
                     0 - Sair do programa"""
        );
            opcao = scan.nextInt();

            switch(opcao){
                case 1:
                    telaCadastroPaciente(scan);
                 break;
                case 2:
                    telaListarPaciente();
                    break;
                case 3:
                    telaAlterarInformacoes(scan);
                    break;
                case 4:
                    telaMostrarInformacoes(scan);
                    break;
                case 5:
                    telaRegistrarAtividadeFisica(scan);
                    break;
                case 6:
                    telaRemovePaciente(scan);
                    break;
                case 7:
                    //cadastroFuncionario
                case 8:
                    //cadastroNutrionicsta
                case 9:
                    //criarConsulta

            }


            }





    }

    public static void telaCadastroPaciente(Scanner scan){
        Paciente pessoa = new Paciente();
        System.out.println("Criação de paciente:\n");
        System.out.println("Insira o nome do paciente");
        pessoa.nome = scan.next();
        System.out.println("Insira a idade do paciente");
        pessoa.idade = scan.nextInt();
        System.out.println("Insira o peso do paciente");
        pessoa.peso = scan.nextDouble();
        System.out.println("Insira a altura do paciente");
        pessoa.altura = scan.nextDouble();
        System.out.println("Insira a PA do paciente");
        pessoa.pressaoArterial = scan.nextDouble();
        System.out.println("Insira a FC do paciente");
        pessoa.freqCardiaca = scan.nextDouble();
        System.out.println("Insira o tipo de dieta do paciente");
        pessoa.DietaAlimentar = scan.next();

        ListaPacientes.adicionaPaciente(pessoa);
    }
    public static void telaListarPaciente(){
        ListaPacientes.listarPacientes();
    }
    public static void telaAlterarInformacoes(Scanner scan){
        System.out.println("Digite o ID do paciente que deseja alterar as informações:");
        int id = Integer.parseInt(scan.next());
        ListaPacientes.alterarPorId(id);
        System.out.println("Insira o novo peso: ");
        ListaPacientes.alterarPorId(id).peso =scan.nextDouble();
        System.out.println("Insira o novo altura: ");
        ListaPacientes.alterarPorId(id).altura =scan.nextDouble();
        System.out.println("Insira a nova PA: ");
        ListaPacientes.alterarPorId(id).pressaoArterial =scan.nextDouble();
        System.out.println("Insira o novo FA: ");
        ListaPacientes.alterarPorId(id).freqCardiaca =scan.nextDouble();
        System.out.println("Insira a nova dieta: ");
        ListaPacientes.alterarPorId(id).DietaAlimentar =scan.next();


    }
    public static void telaMostrarInformacoes(Scanner scan){
        System.out.println("Digite o ID do paciente:");
        int id = Integer.parseInt(scan.next());
        ListaPacientes.buscarPorId(id).informacoes();


    }
    public static void telaRegistrarAtividadeFisica(Scanner scan){
        System.out.println("Digite o ID do paciente que deseja registrar a atividade:");
        int id = Integer.parseInt(scan.next());
        ListaPacientes.buscarPorId(id);

        System.out.println("Digite o nome da atividade física para adicionar:");
        ListaPacientes.buscarPorId(id).registroAtvFisica(scan.next());
    }
    public static void telaRemovePaciente(Scanner scan){

        System.out.println();
        System.out.println("Deletar pacientes");
        System.out.println();

        telaListarPaciente();

        System.out.println("Digite o Id do paciente: ");

        int id = Integer.parseInt(scan.next());
        ListaPacientes.removerPaciente(id);
    }

}

