/* 
 * Copyright 2019 Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;

/**
 *
 * @author Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>
 */
public final class Main {

    public static void main(String[] args) {

        // Variable
        double dinerorest;

        //Constantes
        final String nombre = "Marta";
        final String Articulo = "Pulsera hippy";
        final double Pabuela = 1;
        final double PP = 0.7;

        System.out.printf("Secuencia de Pulsera%n");
        System.out.printf("====================%n");
        System.out.printf("Nombre de la niña ..........: %s%n", nombre);

        System.out.printf(Locale.ENGLISH, "Dinero inicial .............: "
                + "%.2f €%n", Pabuela);

        System.out.printf("---%n");
        System.out.printf("Artículo a comprar .........: %s %n", Articulo);

        System.out.printf(Locale.ENGLISH, "Precio artículo ............: "
                + "%.2f €%n", PP);
        dinerorest = Pabuela - PP;

        System.out.printf("---%n");
        System.out.printf(Locale.ENGLISH, "Dinero restante ............: "
                + "%.2f €%n", dinerorest);

    }
}
