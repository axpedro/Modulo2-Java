package semana2.repositorio;

import semana2.entidades.Nutricionista;

import java.util.ArrayList;

public class ListaNutricionistas {
    
        public static ArrayList<Nutricionista> nutricionistas;
        static {
            nutricionistas = new ArrayList<>();
        }


        public static void adicionanutricionista(Nutricionista nutricionista) {
            nutricionistas.add(nutricionista);
//
        }
        public static void removernutricionista(int id) {
            nutricionistas.remove(id);
        }

        public static Nutricionista buscarPorId(int id) {
            return nutricionistas.get(id);
        }
        public static Nutricionista alterarPorId(int id) {
            Nutricionista nutricionistaNovo = buscarPorId(id);


            return nutricionistaNovo;
        }




        public static void listarnutricionistas() {
            if(nutricionistas.isEmpty()){
                System.out.println("lista vazia");
            }
            else{
                System.out.println("Id  -  Nome");

                for (Nutricionista nutricionista : nutricionistas) {
                    System.out.println(
                            nutricionistas.indexOf(nutricionista) + "  -  " +
                                    nutricionista.getNome()
                    );
                }

            }

        }


    }


