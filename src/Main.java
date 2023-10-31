import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> diccionario = new HashMap<>();
        System.out.println("Bienvenido a tu diccionario");
        llenarDiccionario(diccionario);
        ArrayList<String> palabrasTraducidas = new ArrayList<>();
        ArrayList<String> palabrasEsp5 = palabrasAleatorias(diccionario);
        System.out.println("Las palabras a traducir son: " +palabrasEsp5);
        System.out.println("Por favor ingrese la traducción de las palabras en ese orden, en lineas diferentes. Buena suerte!!");
        for (int i =0 ; i<5; i++){
            String traducciones = sc.nextLine();
            palabrasTraducidas.add(traducciones);
        }
        validarResultado(diccionario,palabrasEsp5, palabrasTraducidas);

    }

    public static void validarResultado(HashMap<String, String> dic, ArrayList<String> palabrasEsp5, ArrayList<String> palabrasTradu){
        int contBuenas = 0;
        for(int i =0 ; i<5; i++){
             String espanol = palabrasEsp5.get(i);
             String ingles = palabrasTradu.get(i);
             if(dic.get(espanol).equalsIgnoreCase(ingles)){
                 contBuenas +=1;
             }
        }
        System.out.println("Usted tuvo "+contBuenas+" respuestas correctas y " +(5-contBuenas)+" respuestas incorrectas");
    }

    public static ArrayList<String> palabrasAleatorias(HashMap<String, String> diccionario){
        ArrayList<String> palabrasEsp5 = new ArrayList<String>();
        ArrayList<String> palabrasEsp = new ArrayList<String>();
        for(Map.Entry <String, String> palabra : diccionario.entrySet()){
            palabrasEsp.add(palabra.getKey());
        }
        Random random = new Random();
        Integer tamanio = palabrasEsp.size();
        for(int i = 0; i<5; i++){
            int indiceRandom = (int) (Math.random()*tamanio);
            palabrasEsp5.add(palabrasEsp.get(indiceRandom));
        }
        return palabrasEsp5;
    }

    public static HashMap<String, String> llenarDiccionario(HashMap<String, String> dic){
        dic.put("Aguacate", "Avocado");
        dic.put("Apio", "Celery");
        dic.put("Arroz", "Rice");
        dic.put("Azúcar", "Sugar");
        dic.put("Calamar", "Squid");
        dic.put("Cangrejo", "Crab");
        dic.put("Calabaza", "Pumpkin");
        dic.put("Cebolla", "Onion");
        dic.put("Cereza", "Cherry");
        dic.put("Ciruela", "Plum");
        dic.put("Ensalda", "Salad");
        dic.put("Frambuesa", "Raspberry");
        dic.put("Fresa", "Strawberry");
        dic.put("Galleta", "Cookie");
        dic.put("Harina", "Flour");
        dic.put("Huevos", "Eggs");
        dic.put("Leche", "Milk");
        dic.put("Lechuga", "Lettuce");
        dic.put("Mantequilla", "Butter");
        dic.put("Pan", "Bread");
        dic.put("Pavo", "Turkey");
        dic.put("Pimienta", "Pepper");
        dic.put("Piña", "Pineapple");
        dic.put("Pulpo", "Octopus");
        dic.put("Queso crema", "Cream cheese");
        dic.put("Queso de cabra", "Goat cheese");
        dic.put("Rábano", "Radish");
        dic.put("Champiñón","Mushroom");
        dic.put("Uva", "Grape");
        dic.put("Zanahoria", "Carrot");
        return dic;
    }
}