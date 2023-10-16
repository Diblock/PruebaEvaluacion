package PersonajesDB2;

public class Goku {
	
	//atributos de la clase Goku
	/*en la refactorizacion de este codigo se agregara el modificador de acceso PRIVATE alos siguientes atributos*/
/*PRIVATE*/	 String nombre;
/*PRIVATE*/	 int edad;
/*PRIVATE*/	 double poder;
/*PRIVATE*/	 String estado;
	
	//contructor para inicializar los atributos
	public Goku(String nombre, int edad, double poder, String estado) {
		this.nombre = nombre;
		this.edad = edad;
		this.poder = poder;
		this.estado = estado;
	}
	
	//METODOS para simular el entrenamiento
/*AQUI IGUALCAMBIAREMOS PUBLIC POR PRIVATE*/
/*PRIVATE*/    public void entrenar() {
		System.out.println(nombre + "Actualmente en entrenamiento para subir LV.");
		poder += 10;
		/*Aqui tube un problema al ejecutar la sentencia en la clase de bajo de transformar*/
		if (poder >= 10100.0) {
			transformar(estado);
		}
	}
	//METODO para simular la transformacion y sumarle en la int poder + 50
/**EN ESTE METODO USAREMOS EL RENAME EN REFACTORIZACION PARA CAMBIAR EL NOMBRE DE LA CLASE*/
        public void transformar(String nuevaForma) {
		System.out.println(nombre + "se ha transformado en" + nuevaForma);
		estado = "Super Saiyan";
		poder += 50;
		
		}
	
	
	//METODOS para mostrar los datos de Goku
	public void mostrarDatos() {
		System.out.println("Nombre:" + nombre);
		System.out.println("Edad:" + edad);
		System.out.println("Poder:" + poder);
		System.out.println("Estado" + estado);
	}
	//METODO principal para probar la clase Goku
	public static void main(String[] args) {
		Goku goku = new Goku("Goku", 30, 10000.0, "Normal");
		//MOSTRAR los datos iniciales de Goku
		goku.mostrarDatos();
		//SIMULA el entrenamiento y transformacion de Goku
		while (goku.poder < 10100.0) {
			goku.entrenar();
		}
		
		//MUESTRA los datos actualizados DESPUES del "entrenamiento"
		goku.mostrarDatos();
		
	}
}
