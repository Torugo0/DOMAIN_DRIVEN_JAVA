package br.com.fiap;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class DateManipulation {
    public static void main(String[] args) {
        LocalDate actualDate = LocalDate.now();
        LocalDate endOfTimes = LocalDate.parse("2012-12-21");

        // Obtendo periodo de tempo entre as duas datas
        Period periodo = Period.between(endOfTimes, actualDate);
        String bonusTime = "Desde os fins do tempo, passaram:\n" + periodo.getYears() + " anos\n" + periodo.getMonths() + " meses\n" + periodo.getDays() + " dias";

        JOptionPane.showMessageDialog(null, bonusTime);
        // formatando a data no padrão dia-mes-ano
        DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataFormatada = endOfTimes.format(dft);
        JOptionPane.showMessageDialog(null, dataFormatada);
    }
}
