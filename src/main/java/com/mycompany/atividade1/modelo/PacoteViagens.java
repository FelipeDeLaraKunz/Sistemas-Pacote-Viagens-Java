/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade1.modelo;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author felip
 */
public class PacoteViagens {
    private String destino;
    private int duracaoViagem;
    private double precoBase;
    private List<AtividadesInclusas> Atividades = new ArrayList<>();
    
    boolean existe = false;

    public PacoteViagens(String destino, int duracaoViagem, double precoBase) {
        this.destino = destino;
        this.duracaoViagem = duracaoViagem;
        this.precoBase = precoBase;
    }
    
    public void setAtividades(AtividadesInclusas atividade){
        for(AtividadesInclusas atividadesLista : Atividades){
            if(atividade.getAtividade().equals(atividadesLista.getAtividade())) {
                existe = true;
                break;
            }   
        }
        if(!existe){
            this.Atividades.add(atividade);
        }
    }

    public String getDestino() {
        return destino;
    }

    public int getDuracaoViagem() {
        return duracaoViagem;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public List<AtividadesInclusas> getAtividades() {
        return Atividades;
    }
    
    public String listarAtividades() {
        
    if (Atividades.isEmpty()) {
        return "Esse Pacote n possui nenhuma atividade inclusa.";
    }

    StringBuilder sb = new StringBuilder();
    for (AtividadesInclusas atividade : Atividades) {
        sb.append(atividade.getAtividade());
    }
    return sb.toString();
}
   @Override
    public String toString() {
        StringBuilder atividadesTexto = new StringBuilder();
for (AtividadesInclusas a : Atividades) {
    atividadesTexto.append("- ").append(a.getAtividade()).append("\n");
}
        return destino + " - " + duracaoViagem + " dias - R$" + precoBase + "-\nAtividades inclusas:\n" + atividadesTexto + "\n";
        
    }
    
    
  
}
   
    
