package br.com.fiap.Exercises;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class UseVoter2 {
    public static void main(String[] args) {
        int actualYear = LocalDate.now().getYear();
        Voter voter1 = new Voter();
        Voter voter2;

        try {
            JOptionPane.showMessageDialog(null, "Input informations about the voter");
            voter1.setName(JOptionPane.showInputDialog("Name: "));
            voter1.setYearBirth(Integer.parseInt(JOptionPane.showInputDialog("Year Birth: ")));
            voter1.setTitleNumber(Integer.parseInt(JOptionPane.showInputDialog("Title Number: ")));
            voter1.setZone(Integer.parseInt(JOptionPane.showInputDialog("Voter zone: ")));
            voter1.setSection(Integer.parseInt(JOptionPane.showInputDialog("Voter section: ")));

            JOptionPane.showMessageDialog(null, "Name: " + voter1.getName() + " ---- Age: " + voter1.ageCalculate(actualYear) + " ---- Title Number: " + voter1.getTitleNumber() +" ---- Zone: " + voter1.getZone() +" ---- Section: " + voter1.getSection());
        } catch (Exception e) {
            System.out.println("Something information was wrong !");
        }

        try {
            JOptionPane.showMessageDialog(null, "Input informations about the voter2");

            voter2 = new Voter(JOptionPane.showInputDialog("Name: "), Integer.parseInt(JOptionPane.showInputDialog("Year Birth: ")), Integer.parseInt(JOptionPane.showInputDialog("Title Number: ")), Integer.parseInt(JOptionPane.showInputDialog("Voter zone: ")), Integer.parseInt(JOptionPane.showInputDialog("Voter section: ")));

            JOptionPane.showMessageDialog(null, "");
            JOptionPane.showMessageDialog(null, "Name: " + voter2.getName() + " ---- Age: " + voter2.ageCalculate(actualYear) + " ---- Title Number: " + voter2.getTitleNumber() +" ---- Zone: " + voter2.getZone() +" ---- Section: " + voter2.getSection());
        } catch (Exception e) {
            System.out.println("Something information was wrong with voter2!");
        }
    }
}
