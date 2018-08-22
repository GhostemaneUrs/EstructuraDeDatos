/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cuc.tails;

/**
 *
 * @author ajaramil
 */
public class ExecuteTails {
    public static void main(String[] args) {
        Tails<String> tails = new Tails<>();
        
        tails.enqueue("E20");
        tails.enqueue("E22");
        tails.enqueue("F10");
        tails.enqueue("F20");
        tails.enqueue("E25");
        tails.enqueue("A30");
        tails.enqueue("A35");
        
        tails.display();
        NodeTails<String> nodo = tails.dequeue();
        System.out.println("Se atendio el nodo " + nodo.getValor());
    }
} 

