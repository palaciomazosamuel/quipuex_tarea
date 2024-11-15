public class paisesquipux {
    public static void main (String[] args){
        String[] p = {
            "Canadá", "Estados Unidos", "México", "Belice", "Costa Rica", "El Salvador", 
            "Guatemala", "Honduras", "Nicaragua", "Panamá", "Argentina", "Bolivia", 
            "Brasil", "Chile", "Colombia", "Ecuador", "Paraguay", "Perú", "Surinam", 
            "Trinidad y tobago", "Uruguay", "Venezuela", "Antiguas y Barbuda", "Bahamas", 
            "Barbados", "Cuba", "Dominica", "Granada", "Guyana", "Haití", "Jamaica", "República Dominicana",
            "San Cristóbal y Nieves", "San Vicente y las Granadinas y Santa Lucía"
        };
    int  contador = 0;

    for (String pais : p) {
        if (pais.length()== 4 ) {
            System.out.println("un pais con 4 letras es " + pais);
            contador++;
        }
    }

    System.out.println("el numero de paises con 4 letras es: "+ contador);
    }

}
