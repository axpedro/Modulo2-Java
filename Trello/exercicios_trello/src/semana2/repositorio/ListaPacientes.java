package semana2.repositorio;

import semana2.entidades.Nutricionista;
import semana2.entidades.Paciente;

import java.util.ArrayList;
import java.util.Optional;

public class ListaPacientes {


    public static ArrayList<Paciente> pacientes;


    static {
        pacientes = new ArrayList<>();
    }

    public static void adicionaPaciente(Paciente paciente) {
        pacientes.add(paciente);
//
    }
    public static void removerPaciente(int id) {
        pacientes.remove(id);
    }

    public static Paciente buscarPorId(int id) {
        return pacientes.get(id);
    }
    public static Paciente alterarPorId(int id) {
       Paciente pessoaNova = buscarPorId(id);


        return pessoaNova;
         }

    public static Optional<Paciente> buscarPacientePorNome(ArrayList<Paciente> pacientes, String nome) {
        return pacientes.stream()
                .filter(paciente -> paciente.getNome().equalsIgnoreCase(nome))
                .findFirst();
    }


    public static void listarPacientes() {
        if(pacientes.isEmpty()){
            System.out.println("lista vazia");
        }
        else{
            System.out.println("Id  -  Nome");

            for (Paciente paciente : pacientes) {
                System.out.println(
                        pacientes.indexOf(paciente) + "  -  " +
                                paciente.nome
                );
        }

        }

    }
}
