package edu.escuelaing.arem.designprimer.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase que se encarga de almacenar cualquier tipo de objetos, también es la unidad que conforma una lInked List
 * @param <E> Denota que esta clase es genérica, es decir, puede almacenar cualquier tipo de objeto o tipo primitivo
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Node<E>{
    private Node<E> next;
    private Node<E> prior;
    private E data;
}