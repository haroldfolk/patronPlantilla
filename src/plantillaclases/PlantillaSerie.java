package plantillaclases;



/**
 * @author Harold Salces
 * @version 1.0
 * @created 12-jun.-2017 08:04:12
 */
public abstract class PlantillaSerie {

	public PlantillaSerie(){

	}

	

	public String imprimirSerie(int i){
			String serie="Sumatoria:";
          int cant=5;
          int total=0;
          total=i;
          serie=serie+""+i+"+";
            while(cant>0){
              
              i= obtenerSuma(i);
              total=total+i;
              serie=serie+""+i+"+";
              cant--;
          }
            return serie+"="+total;
           
	}

	public abstract int obtenerSuma(int i);
	

}