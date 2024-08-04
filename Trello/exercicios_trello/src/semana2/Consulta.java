package semana2;

import semana2.entidades.Nutricionista;
import semana2.entidades.Paciente;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Consulta {

    public Nutricionista nutricionista;
    public Paciente paciente;
    public LocalDateTime horaEData;
    public boolean consultaRealida = false;

    public Nutricionista getNutricionista() {
        return nutricionista;
    }

    public void setNutricionista(Nutricionista nutricionista) {
        this.nutricionista = nutricionista;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public LocalDateTime getHoraEData() {
        return horaEData;
    }

    public void setHoraEData(LocalDateTime horaEData) {
        this.horaEData = horaEData;
    }

    public boolean isConsultaRealida() {
        return consultaRealida;
    }

    public void setConsultaRealida(boolean consultaRealida) {
        this.consultaRealida = consultaRealida;
    }
    //Definindo o padrao
//    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//    DateTimeFormatter formatterComHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
//    LocalDate localDate = LocalDate.parse("10/11/2024", formatter );
//    LocalDateTime localDateTime = LocalDateTime.parse("10/11/2024 10:25:10" , formatterComHora);


}


