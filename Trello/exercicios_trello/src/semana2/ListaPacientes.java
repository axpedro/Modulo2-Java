package semana2;

import java.util.ArrayList;

public class ListaPacientes {


    private static ArrayList<Paciente> pacientes;


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
    public static void alterarPorId(int id) {


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
