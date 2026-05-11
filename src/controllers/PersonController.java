package controllers;

import models.Person;

public class PersonController {



    //Metodo que ordena un arreglo de persona
    //por su edad (age), con metodo insercion
    public void sortPersonByAge(Person[] personas) {
        for (int i = 1; i < personas.length; i++) {
            Person aux = personas[i];
            int j = i - 1;

            while (j >= 0 && personas[j].getEdad() > aux.getEdad()) {
                personas[j + 1] = personas[j];
                j--;
            }

            personas[j + 1] = aux;
        }
    }

    public void sortPersonByName(Person[] personas) {
        for (int i = 1; i < personas.length; i++) {
            Person aux = personas[i];
            int j = i - 1;

            while (j >= 0 && personas[j].getName().compareTo(aux.getName()) > 0) {
                personas[j + 1] = personas[j];
                j--;
            }

            personas[j + 1] = aux;
        }
    }

    // Metodo ordena las personas segun el promedio de sus notas con seleccion
    public void sortPersonByAvrNotas(Person[] personas) {
        for (int i = 0; i < personas.length; i++) {
            int auxMenor = i;

            for (int j = i + 1; j < personas.length; j++) {
                // Comparacion para actualizar el indice (auxMenor)
                if (personas[j].getPromedio() < personas[auxMenor].getPromedio())
                    auxMenor = j;

            }
            // Pregunto si el auxMneor es diferente de i entocnes cambio de posiciones
            if (auxMenor != i) {
                Person aux = personas[i];
                personas[i] = personas[auxMenor];
                personas[auxMenor] = aux;
            }
        }
    }

    //Ordenar el arreglo de personas por un valor de su nombre
    // el valor del nombre sera la cantidad de letras
    // donde las vocales valen 5
    // y consonantes valen el valor de la edad
    //Ej: Juan 20 
    // 20 + 5 + 5 + 20 = 50
    public void sortPersonByNameValue(Person[] personas) {
        for (int i = 0; i < personas.length; i++) {
            int auxMenor = i;

            for (int j = i + 1; j < personas.length; j++) {
                // Comparacion para actualizar el indice (auxMenor)
                if (personas[j].valueName() < personas[auxMenor].valueName())
                    auxMenor = j;

            }
            // Pregunto si el auxMneor es diferente de i entocnes cambio de posiciones
            if (auxMenor != i) {
                Person aux = personas[i];
                personas[i] = personas[auxMenor];
                personas[auxMenor] = aux;
            }
        }
    }
}


