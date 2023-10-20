/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufu.poo.lab8;

/**
 *
 * @author fabiola
 */
public class CartaoPagamento implements PagamentoStrategy {

    @Override
    public void pagar(int total) {
        System.out.println("logica para pagar com cartao");
    }
    
}
