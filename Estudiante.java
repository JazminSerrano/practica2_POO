public class Estudiante {
    String nombre, id, materia;
    double calif;
    boolean estado;

    public void setNombre(String nombre){
        this.nombre = nombre;
	}

	public void setID(String id){
        this.id = id;
	}

	public void setMateria(String materia){
        this.materia = materia;
	}

	public void setEstado(double calif){
        if(calif>=60)
            estado = true;
        else
            estado = false;
	}

	public void setCalificacion(double calif){
        this.calif = calif;
	}

	public String getNombre(){
        return nombre;
	}

	public String getID(){
        return id;
	}

	public String getMateria(){
        return materia;
	}

	public boolean getEstado(){
        return estado;
	}

	public double getCalificacion(){
        return calif;
	}

	public Estudiante(){
        nombre="";
        id="";
        materia="";
        calif=0;
        estado=false;
    }

    public Estudiante(String nombre,String id,String materia,double calif,boolean estado){
        this.nombre = nombre;
        this.id = id;
        this.materia = materia;
        this.calif = calif;
        this.estado = estado;
    }

	public void imprimirDatos(){
	    if(estado)
            System.out.println("\nEstudiante "+nombre+" ("+id+")\n"+materia+"\t"+calif+"\tAPROBADO");
        else
            System.out.println("\nEstudiante "+nombre+" ("+id+")\n"+materia+"\t"+calif+"\tREPROBADO");
	}
}
