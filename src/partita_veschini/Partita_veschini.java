/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package partita_veschini;

/**
 *
 * @author B045_08
 */
public class Giocatore extends Thread {
    private String nome;
    public Giocatore(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) { // Simuliamo 10 scambi
            System.out.println("ping - " + nome);
            // Cede il controllo all'altro thread
            Thread.yield();
        }
    }
}