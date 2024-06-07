package semana2.repositorio;



import semana2.Consulta;


import java.util.ArrayList;

public class ListaConsultas {

    public static ArrayList<Consulta> consultas;


    static {
        consultas = new ArrayList<>();
    }


    public static void adicionaConsulta(Consulta consulta) {
        consulta.nutricionista.setNumeroConsultas(consulta.nutricionista.getNumeroConsultas()+1);
        consultas.add(consulta);
//
    }
    public static void removerPaciente(int id) {
        consultas.remove(id);
    }

    public static Consulta buscarPorId(int id) {
        return consultas.get(id);
    }
    public static Consulta alterarPorId(int id) {
        Consulta consultaNova = buscarPorId(id);


        return consultaNova;
    }




    public static void listarConsultas() {
        if(consultas.isEmpty()){
            System.out.println("lista vazia");
        }
        else{
            System.out.println("Id  -  Consulta:");

            for (Consulta consulta : consultas) {
                System.out.println(

                                consulta.nutricionista.getNome() + " - " + consulta.paciente.nome + " - "
                        + consulta.horaEData
                );
            }

        }

    }





}

