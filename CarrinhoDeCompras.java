/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufu.poo.lab8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fabiola
 */
public class CarrinhoDeCompras {
    
    List<Item> items = new ArrayList<>();
    
    public void adicionaItem(Item item){
        items.add(item);
        
    }
    public void removeItem(Item item){
        items.remove(item);
    }
    
    public int calculaTotal(){
        int sum = 0;
	for(Item item : items){
            sum += item.getPreco();
        }
	return sum;
    }

    public void realizaPagamento(PagamentoStrategy strategy){
        int total = this.calculaTotal();
        strategy.pagar(total);
        
    }


    
}
