/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade1.modelo;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.atividade1.modelo.PacoteViagens;

/**
 *
 * @author felip
 */
public class Cliente {
    private String nome, documento;
    List<PacoteViagens> pacotes = new ArrayList<>();
    private List<Opcionais> Opcionaiss = new ArrayList<>();
    boolean existe = false;
    
    public Cliente(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
        
    }
    
    public void setOpcionais(Opcionais opcional) {
        Opcionaiss.add(opcional);
    }

    public void setPacote(PacoteViagens pacote) {
        
        pacotes.add(pacote);
        
    }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }

    public String listarPacotes() {
        
    if (pacotes.isEmpty()) {
        return "Nenhum pacote cadastrado.";
    }

    StringBuilder sb = new StringBuilder();
    for (PacoteViagens pacote : pacotes) {
        sb.append("\nDestino: ").append(pacote.getDestino())
          .append(", Preço: R$").append(pacote.getPrecoBase())
          .append(", Duração: ").append(pacote.getDuracaoViagem()).append(" dias\n");
        
        sb.append("Atividades Inclusas:\n");
    for (AtividadesInclusas atividade : pacote.getAtividades()) {
        sb.append("- ").append(atividade.getAtividade()).append("\n");
    }
    }
    return sb.toString();
}
    
    public String listarOpcionais() {
        
    if (Opcionaiss.isEmpty()) {
        return "Nenhum opcional cadastrado.";
    }

    StringBuilder sb = new StringBuilder();
    for (Opcionais opciona : Opcionaiss) {
        sb.append("Opcional: ").append(opciona.getNomeOpcional())
          .append(", Preço: R$").append(opciona.getPrecoOpcional())
                .append("\n")
          ;
    }
    return sb.toString();
}
    
    public String calcularPacotes() {
        double valor = 0.00;
        for (PacoteViagens pacote : pacotes){
            valor += pacote.getPrecoBase();
        }
        return String.format("%.2f", valor);
    }
    
    public String calcularTotal() {
        double valor = 0.00;
        for (PacoteViagens pacote : pacotes){
            valor += pacote.getPrecoBase();
        }
        for (Opcionais opcionai : Opcionaiss){
            valor += opcionai.getPrecoOpcional();
        }
        return String.format("%.2f", valor);
    }
}
    
    
    

