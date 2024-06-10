package semana2.repositorio;

import semana2.entidades.Funcionario;


import java.util.ArrayList;

public class ListaFuncionarios {


    public static ArrayList<Funcionario> funcionarios;
    static {
        funcionarios = new ArrayList<>();
    }


    public static void adicionafuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
//
    }
    public static void removerfuncionario(int id) {
        funcionarios.remove(id);
    }

    public static Funcionario buscarPorId(int id) {
        return funcionarios.get(id);
    }
    public static Funcionario alterarPorId(int id) {
        Funcionario funcionarioNovo = buscarPorId(id);


        return funcionarioNovo;
    }




    public static void listarfuncionarios() {
        if(funcionarios.isEmpty()){
            System.out.println("lista vazia");
        }
        else{
            System.out.println("Id  -  Nome");

            for (Funcionario funcionario : funcionarios) {
                System.out.println(
                        funcionarios.indexOf(funcionario) + "  -  " +
                                funcionario.getNome()
                );
            }

        }

    }


}
