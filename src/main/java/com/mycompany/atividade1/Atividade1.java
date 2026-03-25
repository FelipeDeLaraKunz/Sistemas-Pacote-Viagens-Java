package com.mycompany.atividade1;

import com.mycompany.atividade1.modelo.PacoteViagens;
import com.mycompany.atividade1.modelo.AtividadesInclusas;
import com.mycompany.atividade1.modelo.Opcionais;
import com.mycompany.atividade1.modelo.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author felip
 */
public class Atividade1 {

    public static void main(String[] args) {
        AtividadesInclusas atividade1 = new AtividadesInclusas("Passeio de barco");
        AtividadesInclusas atividade2 = new AtividadesInclusas("Mergulho com snorkel");
        AtividadesInclusas atividade3 = new AtividadesInclusas("Tour gastronômico");
        AtividadesInclusas atividade4 = new AtividadesInclusas("Visita a museus");
        AtividadesInclusas atividade5 = new AtividadesInclusas("Caminhada ecológica");
        AtividadesInclusas atividade6 = new AtividadesInclusas("Festa na praia");

        Opcionais opcional1 = new Opcionais("Almoço Incluso", 150.0);
        Opcionais opcional2 = new Opcionais("Tour pela cidade", 99.90);
        Opcionais opcional3 = new Opcionais("Show local", 499.90);

        PacoteViagens pacote1 = new PacoteViagens("Bahamas", 10, 5000.0);
        PacoteViagens pacote2 = new PacoteViagens("Paris", 7, 7200.0);
        PacoteViagens pacote3 = new PacoteViagens("Tóquio", 12, 9800.0);
        PacoteViagens pacote4 = new PacoteViagens("Fernando de Noronha", 5, 3500.0);
        PacoteViagens pacote5 = new PacoteViagens("Gramado", 4, 1800.0);
        PacoteViagens[] opcoes = { pacote1, pacote2, pacote3, pacote4, pacote5 };

        pacote1.setAtividades(atividade1);
        pacote2.setAtividades(atividade6);
        pacote3.setAtividades(atividade3);
        pacote4.setAtividades(atividade5);
        pacote5.setAtividades(atividade4);
        pacote1.setAtividades(atividade2);

        /*
         * pacote1.veraso();
         */
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        String documento = JOptionPane.showInputDialog("Digite seu CPF");
        Cliente cliente1 = new Cliente(nome, documento);

        int resposta;

        do {

            PacoteViagens escolha = (PacoteViagens) JOptionPane.showInputDialog(
                    null,
                    "Escolha um pacote de viagem:",
                    "Pacotes Disponíveis",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]);

            if (escolha != null) {
                cliente1.setPacote(escolha);
            } else {
                break;
            }

            resposta = JOptionPane.showConfirmDialog(
                    null,
                    "Deseja escolher outro pacote?",
                    "Continuar?",
                    JOptionPane.YES_NO_OPTION);
        } while (resposta == JOptionPane.YES_OPTION);

        int repostaOpcional = JOptionPane.showConfirmDialog(
                null,
                "Deseja adicionar esse opcional?\n" + opcional1.toString(),
                "Opcional",
                JOptionPane.YES_NO_OPTION);
        if (repostaOpcional == JOptionPane.YES_OPTION) {
            cliente1.setOpcionais(opcional1);
        }

        int repostaOpcional2 = JOptionPane.showConfirmDialog(
                null,
                "Deseja adicionar esse opcional?\n" + opcional2.toString(),
                "Opcional",
                JOptionPane.YES_NO_OPTION);
        if (repostaOpcional2 == JOptionPane.YES_OPTION) {
            cliente1.setOpcionais(opcional2);
        }

        int repostaOpcional3 = JOptionPane.showConfirmDialog(
                null,
                "Deseja adicionar esse opcional?\n" + opcional3.toString(),
                "Opcional",
                JOptionPane.YES_NO_OPTION);
        if (repostaOpcional3 == JOptionPane.YES_OPTION) {
            cliente1.setOpcionais(opcional3);
        }

        String mensagem = "Olá " + cliente1.getNome() + "\n\n"
                + "=== Pacotes ===\n" + cliente1.listarPacotes()
                + "\n Valor pacotes: R$" + cliente1.calcularPacotes()
                + "\n\n=== Opcionais ===\n" + cliente1.listarOpcionais()
                + "\n\n VALOR TOTAL: " + cliente1.calcularTotal();
        JOptionPane.showMessageDialog(null, mensagem);

        /*
         * JOptionPane.showMessageDialog(null, cliente1.listarPacotes());
         * JOptionPane.showMessageDialog(null, cliente1.listarOpcionais());
         */

        // JOptionPane.showMessageDialog(null, cliente1.getNome()+ "\n"
        // +cliente1.getDocumento());

        /*
         * String pacoteEscolhido = (String) JOptionPane.showInputDialog(
         * null,
         * "Escolha um pacote:",
         * "Pacotes Disponíveis",
         * JOptionPane.QUESTION_MESSAGE,
         * null,
         * pacote1.()
         * );
         */

    }
}
