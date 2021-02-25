import java.util.*;

public class Registro{
    public static void main(String[] args){

        Estudiante est1 = new Estudiante("Jose Palacios","1201JP","Programacion",58.4,false);
        Estudiante est2 = new Estudiante("Maria Dominguez","1271MD","Matematicas",67.3,true);
        Estudiante est3 = new Estudiante("Pedro Saenz","1211PS","Programacion",87.5,true);
        Estudiante est4 = new Estudiante("Leonardo Palacios","1281LP","Programacion",96.0,true);
        Estudiante est5 = new Estudiante("Donna Sanchez","1256DS","Circuitos",44.1,false);
        Estudiante est6 = new Estudiante();
        Estudiante est7 = new Estudiante();
        Estudiante est8 = new Estudiante();
        Estudiante est9 = new Estudiante();
        Estudiante est10 = new Estudiante();
        String calif;

        System.out.println("\nCapturar los datos de cinco estudiantes.");
        System.out.println("\nPrimer Estudiante");
        est6.setNombre(CapturaEntrada.capturarCadena("Nombre"));
        est6.setID(CapturaEntrada.capturarCadena("ID"));
        est6.setMateria(CapturaEntrada.capturarCadena("Materia"));
        do{
            calif = CapturaEntrada.capturarCadena("Calificacion");
            if(!Validacion.validarNumero(calif))
                System.out.println("Ingrese una calificacion valida");
        }while(!Validacion.validarNumero(calif));
        est6.setCalificacion(Double.parseDouble(calif));
        est6.setEstado(est6.getCalificacion());

        System.out.println("\nSegundo Estudiante");
        est7.setNombre(CapturaEntrada.capturarCadena("Nombre"));
        est7.setID(CapturaEntrada.capturarCadena("ID"));
        est7.setMateria(CapturaEntrada.capturarCadena("Materia"));
        do{
            calif = CapturaEntrada.capturarCadena("Calificacion");
            if(!Validacion.validarNumero(calif))
                System.out.println("Ingrese una calificacion valida");
        }while(!Validacion.validarNumero(calif));
        est7.setCalificacion(Double.parseDouble(calif));
        est7.setEstado(est7.getCalificacion());

        System.out.println("\nTercer Estudiante");
        est8.setNombre(CapturaEntrada.capturarCadena("Nombre"));
        est8.setID(CapturaEntrada.capturarCadena("ID"));
        est8.setMateria(CapturaEntrada.capturarCadena("Materia"));
        do{
            calif = CapturaEntrada.capturarCadena("Calificacion");
            if(!Validacion.validarNumero(calif))
                System.out.println("Ingrese una calificacion valida");
        }while(!Validacion.validarNumero(calif));
        est8.setCalificacion(Double.parseDouble(calif));
        est8.setEstado(est8.getCalificacion());

        System.out.println("\nCuarto Estudiante");
        est9.setNombre(CapturaEntrada.capturarCadena("Nombre"));
        est9.setID(CapturaEntrada.capturarCadena("ID"));
        est9.setMateria(CapturaEntrada.capturarCadena("Materia"));
        do{
            calif = CapturaEntrada.capturarCadena("Calificacion");
            if(!Validacion.validarNumero(calif))
                System.out.println("Ingrese una calificacion valida");
        }while(!Validacion.validarNumero(calif));
        est9.setCalificacion(Double.parseDouble(calif));
        est9.setEstado(est9.getCalificacion());

        System.out.println("\nQuinto Estudiante");
        est10.setNombre(CapturaEntrada.capturarCadena("Nombre"));
        est10.setID(CapturaEntrada.capturarCadena("ID"));
        est10.setMateria(CapturaEntrada.capturarCadena("Materia"));
        do{
            calif = CapturaEntrada.capturarCadena("Calificacion");
            if(!Validacion.validarNumero(calif))
                System.out.println("Ingrese una calificacion valida");
        }while(!Validacion.validarNumero(calif));
        est10.setCalificacion(Double.parseDouble(calif));
        est10.setEstado(est10.getCalificacion());

        System.out.println("\nEstudiantes en el sistema:");
        est1.imprimirDatos();
        est2.imprimirDatos();
        est3.imprimirDatos();
        est4.imprimirDatos();
        est5.imprimirDatos();
        System.out.println("\nEstudiantes capturados:");
        est6.imprimirDatos();
        est7.imprimirDatos();
        est8.imprimirDatos();
        est9.imprimirDatos();
        est10.imprimirDatos();
    }
}
