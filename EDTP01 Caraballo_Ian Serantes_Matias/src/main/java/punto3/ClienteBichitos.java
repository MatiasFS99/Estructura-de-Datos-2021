package punto3;

public class ClienteBichitos {
    
    private static void imprimir(Mascota[] param) {
        for (int i = 0; i < param.length; i++) {
            System.out.println("");
            System.out.println(param[i]);
        }
    }
    
    private static Mascota[] filtrarGerontes(Mascota[] param) {
        int contador = 0;
        for (Mascota param1 : param) {
            if (2020 - param1.getAnioDeNacimiento() > 13) {
                contador += 1;
            }
        }
        
        Mascota[] salida = new Mascota[contador];
        int auxiliar = 0;
        for (Mascota param1 : param) {
            if (2020 - param1.getAnioDeNacimiento() > 13) {
                salida[auxiliar] = param1;
                auxiliar += 1;
            }
        }
        return salida;
    }
    
    private static Mascota[] filtrarPorEspecie(Mascota[] param, Especie especieParam) {
        int contador = 0;
        
        for (Mascota param1 : param) {
            if (param1.getRaza().getEspecie().equals(especieParam)) {
                contador += 1;
            }
        }
        
        Mascota[] salida = new Mascota[contador];
        int auxiliar = 0;
        for (Mascota paraml : param) {
            if (paraml.getRaza().getEspecie().equals(especieParam)) {
                salida[auxiliar] = paraml;
                auxiliar += 1;
            }
        }
        return salida;
        
    }
    
    public static Mascota[] cocatenarMascotas(Mascota[] param, Mascota[] param2) {
        Mascota[] salida = new Mascota[(param.length + param2.length)];
        for (int i = 0; i < param.length; i++) {
            salida[i] = param[i];
        }
        for (int i = 0; i < param2.length; i++) {
            salida[i + param.length] = param2[i];
        }
        return salida;
    }
    
    private static Mascota[] filtrarPorPersona(Mascota[] param, Persona duenio) {
        int contador = 0;
        for (Mascota param1 : param) {
            if (param1.getDuenio().equals(duenio)) {
                contador += 1;
            }
        }
        Mascota[] salida = new Mascota[contador];
        int auxiliar = 0;
        for (Mascota paraml : param) {
            if (paraml.getDuenio().equals(duenio)) {
                salida[auxiliar] = paraml;
                auxiliar += 1;
            }
        }
        return salida;
    }
    

    private static Persona maxMascotero(Mascota[] param) {
        Mascota[] arrayGruposMascotas = filtrarPorPersona(param, param[0].getDuenio());
        Mascota[] arrayGruposMascotas2;
        int conteo = 1;
        boolean esta = false;
        for (Mascota animal : param) {
            for (Mascota aux : arrayGruposMascotas) {
                if (animal.equals(aux)) {
                    esta = true;
                }
            }
            if (!esta) {
                arrayGruposMascotas2 = filtrarPorPersona(param, animal.getDuenio());
                arrayGruposMascotas = cocatenarMascotas(arrayGruposMascotas, arrayGruposMascotas2);
                conteo += 1;
            }
            esta = false;
        }
        MascotasPorPersona[] mascoteros = new MascotasPorPersona[conteo];
        for(int k=0;k<mascoteros.length;k++){
            mascoteros[k] = new MascotasPorPersona(new Persona("place","holder","-1"), -1);
        }
        for (Mascota animal : param) {
            for (MascotasPorPersona var : mascoteros) {
                if (animal.getDuenio().equals(var.getPersona())) {
                    esta = true;
                    var.setCantidad(var.getCantidad() + 1);
                }
            }
            if (!esta) {
                for (MascotasPorPersona var : mascoteros) {
                    if (var.getCantidad() == -1) {
                        var.setPersona(animal.getDuenio());
                        var.setCantidad(1);
                        break;
                    }
                }
            }
            esta = false;
        }
        MascotasPorPersona maximo = mascoteros[0];
        for (MascotasPorPersona duenio : mascoteros) {
            if (duenio.getCantidad() > maximo.getCantidad()) {
                maximo = duenio;
            }
        }
        return maximo.getPersona();
    }
    
    private static Mascota[] arrayMascota = new Mascota[5];
    private static Mascota[] gerontes;
    private static Mascota[] especies;
    
    public static void main(String[] args) {
        arrayMascota[0] = new Mascota(1, "Salchicha", new Raza("Terrier", new Especie("Canis lupus familiaris")), 2010, new Persona("Simpson", "Homero", "4123452"));
        arrayMascota[1] = new Mascota(2, "Mini Toy", new Raza("Caniche", new Especie("Canis lupus familiaris")), 2001, new Persona("Simpson", "Homero", "4123452"));
        arrayMascota[2] = new Mascota(3, "Toy", new Raza("Caniche", new Especie("Canis lupus familiaris")), 2010, new Persona("Simpson", "Homero", "4123452"));
        arrayMascota[3] = new Mascota(4, "Caniche", new Raza("Caniche", new Especie("Canis lupus familiaris")), 2003, new Persona("Skinner", "Seymour", "4123349"));
        arrayMascota[4] = new Mascota(5, "Snouser Gigante", new Raza("Snouser", new Especie("Canis lupus familiaris")), 2004, new Persona("Charlmer", "Archundia", "4123123"));
        System.out.println("---------------listado de mascotas----------------");
        imprimir(arrayMascota);
        
        gerontes = filtrarGerontes(arrayMascota);
        System.out.println("-------Las mascotas mayores a 13 años son :-------");
        for (Mascota geronte : gerontes) {
            System.out.println("");
            System.out.println(geronte);
        }
        System.out.println("---------------mascotas por especie---------------");
        especies = filtrarPorEspecie(arrayMascota, arrayMascota[0].getRaza().getEspecie());
        System.out.println("Las mascotas de la especie : " + arrayMascota[0].getRaza().getEspecie());
        for (Mascota especie : especies) {
            System.out.println("");
            System.out.println(especie);
        }
        System.out.println("-------------Persona con mas mascotas-------------");
        System.out.println("La persona con mas mascotas es : " + maxMascotero(arrayMascota));
        
    }
}
