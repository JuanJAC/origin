import java.lang.*;

class Figura{
	
	String color="";
	Integer Lados=0;
	Boolean pintable=false;

	Figura(){
		//Constructor para inicializando sin parámetro.
	}

	Figura(Integer l, Boolean p, String c){
		this.lados=l;
		this.pinta=p;
		this.color=c;
	}	

	static String  getColor(){
			return color;
		}
	public void setColor(String c){
			this.color=c;
		}	
}

/*
Escribe un programa en JAVA, crea la clase *Figura* con propiedades de tipos wrapper para guardar el color,
la cantidad de lados y si es pintable(true | false), encapsula estas propiedades. Sobrecarga el constructor
de Figura para que permita crear figuras inicializando sus propiedades o sin pasar ningun parámetro.Sobreescribe
el métodos *equals* para que compare usando color y cantidda de lados pero no si es pintable. es decir que si dos
objetos tienen el mismo color y cantidda de lados serán iguales sin importar si son pintables o no. Sobreescribe
el metodo *toString*  para que regrese una cadena simalar a esta: "Figura de X lados y color CC", donde X  y CC
son lados y color respectivamente.

Escribe el código necesario para comprobar que tu código funciona.
*/
