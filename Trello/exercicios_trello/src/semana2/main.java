package semana2;

import semana2.entidades.Endereco;
import semana2.entidades.Funcionario;
import semana2.entidades.Nutricionista;
import semana2.entidades.Paciente;
import semana2.repositorio.ListaConsultas;
import semana2.repositorio.ListaFuncionarios;
import semana2.repositorio.ListaNutricionistas;
import semana2.repositorio.ListaPacientes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

import static semana2.entidades.Nutricionista.VerificaAntesDoCadastro;
import static semana2.repositorio.ListaNutricionistas.*;
import static semana2.repositorio.ListaPacientes.buscarPacientePorNome;


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
                     7 - Cadastrar Funcionario
                     8 - Cadastrar Nutricionista
                     9 - Criar Consulta
                     10 - Listar Funcionários
                     11- Listas Consultas
                     12 - Realizar Consulta
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
                    telaCadastroFuncionario(scan);
                    break;
                case 8:
                    telaCadastroNutricionista(scan);
                    break;
                case 9:
                    criarConsulta(scan);
                    break;
                case 10:
                    telaListarFuncionarios();
                    break;
                case 11:
                    telaListarConsultas();
                case 12:
                    telaConfirmarConsulta(scan);

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
        ListaNutricionistas.listarnutricionistas();
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

    //NOvas funcoes
    public static void telaCadastroFuncionario(Scanner scan){
        Funcionario funcionario = new Funcionario();
        System.out.println("Criação de funcionario:\n");
        System.out.println("Insira o nome do funcionario");
        funcionario.setNome(scan.next());
        System.out.println("Insira a idade do funcionario");
        funcionario.setIdade(scan.nextInt());
        System.out.println("Insira o salario do funcionario");
        funcionario.setSalario(scan.nextDouble());

        System.out.println("Insira o Endereço do funcionario");
        Endereco endereco = new Endereco();
        System.out.println("Insira o Logradouro");
        endereco.setLogradouro(scan.next());
        System.out.println("Insira o Estado");
        endereco.setEstado(scan.next());
        System.out.println("Insira a cidade");
        endereco.setCidade(scan.next());
        System.out.println("Insira o Numero da casa");
        endereco.setNúmero(scan.nextInt());
        System.out.println("Insira o CEP");
        endereco.setCEP(scan.next());
        funcionario.setEndereco(endereco);
        ListaFuncionarios.adicionafuncionario(funcionario);
    }


    public static void telaCadastroNutricionista(Scanner scan){
        Nutricionista nutri = new Nutricionista();
        System.out.println(nutri.getListaCertificados().size());
        System.out.println("Criação de Nutricionista:\n");

        String nomeNutricionista;
        do {
            System.out.println("Insira o nome do nutricionista:");
            nomeNutricionista = scan.next();
        } while (VerificaAntesDoCadastro(ListaNutricionistas.nutricionistas, nomeNutricionista));

        nutri.setNome(nomeNutricionista);


        System.out.println("Insira a idade do Nutricionista");
        nutri.setIdade(scan.nextInt());
        System.out.println("Insira o salario do Nutricionista");
        nutri.setSalario(scan.nextDouble());
        System.out.println("Insira o certificado do Nutricionista");
        nutri.adicionaCertificacao(scan.next());
        nutri.setNumeroConsultas(0);
        System.out.println("Insira o tempo de experiencia do Nutricionista");
        nutri.setTempoXp(scan.nextInt());

        ListaNutricionistas.adicionanutricionista(nutri);

    }

    public static void criarConsulta(Scanner scan){
        //pegar data e hr e transformar pra localdatetime
        Consulta consulta = new Consulta();
        DateTimeFormatter formatterComHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println("Insira a data no seguinte formato: dd/MM/yyyy");
        String data = scan.next();
        System.out.println(data);
        System.out.println("Insira a hora no seguinte formato: HH:mm:ss");
        String hr = scan.next();
        System.out.println(hr);
        String DataHora = data+" "+hr;
        System.out.println(DataHora);
        LocalDateTime localHoraComParse = LocalDateTime.parse(DataHora , formatterComHora);
        consulta.setHoraEData(localHoraComParse);
        System.out.println(consulta.getHoraEData());

        System.out.println("Insira nome do nutricionista:");
        String nome = scan.next();
        Optional<Nutricionista> encontrado = buscarNutricionistaPorNome(ListaNutricionistas.nutricionistas, nome);

        if (encontrado.isPresent()) {
            consulta.setNutricionista(encontrado.get());
            System.out.println("Nutricionista encontrado: " + encontrado.get().getNome());

        } else {
            System.out.println("Nutricionista não encontrado.");
        }
        System.out.println("Insira nome do Paciente:");
        String nomePaciente = scan.next();
        Optional<Paciente> naLista = buscarPacientePorNome(ListaPacientes.pacientes, nomePaciente);
        if (encontrado.isPresent()) {
            consulta.setPaciente(naLista.get());
            System.out.println("Paciente encontrado: " + naLista.get().getNome());

        } else {
            System.out.println("Paciente não encontrado.");
        }

        ListaConsultas.consultas.add(consulta);
    }

    public static void telaListarFuncionarios(){
        ListaFuncionarios.listarfuncionarios();
        ListaNutricionistas.listarnutricionistas();

    }

    public static void telaListarConsultas(){
        ListaConsultas.listarConsultas();




    }
    public static void telaConfirmarConsulta(Scanner scan){
        ListaConsultas.listarConsultas();
        System.out.println("Digite o Id da consulta que deseja confirmar: ");
        int idRecebido = scan.nextInt();
        ListaConsultas.buscarPorId(idRecebido).setConsultaRealida(true);
    }

}

