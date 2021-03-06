package hogwarts;

import java.util.HashMap;

import java.util.Iterator;

import java.util.Scanner;

public class main {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            HashMap <String, Integer> hellos = new HashMap<String, Integer>();

            String action, id, key;

            Integer text;

            action = "";

            hellos.put("Gryffindor", -50);

            hellos.put("Hufflepuff", 15);

            hellos.put("Ravenclaw", 60);

            hellos.put("Slitheryn", 10);

            Iterator<String> iterator;

            while (!action.equals("QUIT")) {

                System.out.println("\nBienvenue à Poudlard ! \n - Tapez '+' pour ajouter des points à une maison. \n - Tapez '-' pour retirer des points à une maison. \n - Tapez 'DEL' pour supprimer la maison. \n - Tapez 'GET' pour afficher le tableau. \n - Tapez 'SIZE' pour connaître la taille du tableau. \n - Tapez 'QUIT' pour quitter le programme.");

                action = sc.next();

                if (action.equals("+") || action.equals("-")) {

                    System.out.println("Saisir la maison surtout serpentard :");

                    id = sc.next();

                    if (action.equals("+")) {

                        System.out.println("Saisir les points à ajouter :");

                        text = sc.nextInt()+ hellos.get(id);

                        hellos.put(id, text);

                    } else if (action.equals("-")) {

                        System.out.println("Saisir les points à retirer :");

                        text = hellos.get(id) - sc.nextInt();

                        hellos.put(id, text);

                    }
                }else if (action.equals("DEL")) {

                    System.out.println("Saisir la maison :");

                    id = sc.next();

                    if (hellos.get(id) != null) {

                        hellos.remove(id);
                        System.out.println("Suppression de la maison " + id);

                    } else {

                        System.out.println("La maison " + id + " n'existe pas.");

                    }   

                }else if (action.equals("GET")) {

                    iterator = hellos.keySet().iterator();

                    while (iterator.hasNext()) {

                        key = iterator.next();

                        System.out.println(key + " | " + hellos.get(key));

                    }
                }else if (action.equals("SIZE")) {

                    System.out.println("Taille : " + hellos.size());

                }

            };

        }

}
