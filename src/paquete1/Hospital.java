/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

public class Hospital {

    private String nombreHospital;
    private Ciudad ciudadHospital;
    private int numEspecialidad;
    private Medico[] conjuntoMedico;
    private Enfermero[] conjuntoEnfermero;
    private double sueldo;
    private String direccionHosp;

    public Hospital(Ciudad ciud, String nomb, String direc, int numEspec,
            Medico[] med, Enfermero[] enfe) {
        nombreHospital = nomb;
        direccionHosp = direc;
        numEspecialidad = numEspec;
        conjuntoMedico = med;
        conjuntoEnfermero = enfe;
        ciudadHospital = ciud;

    }

    public void establecerNombreHospital(String n) {
        nombreHospital = n;
    }

    public void establecerCiudadHospital(Ciudad n) {
        ciudadHospital = n;
    }

    public void establecerConjuntoMedico(Medico[] n) {
        conjuntoMedico = n;
    }

    public void establecerNumEspecialidade(Medico[] n) {
        numEspecialidad = n.length;
    }

    public void establecerConjuntoEnfermero(Enfermero[] n) {
        conjuntoEnfermero = n;
    }

    public void establecerSueldo() {
        double suma = 0;
        for (Medico obtenerConjuntoMedico : obtenerConjuntoMedico()) {
            suma = suma + obtenerConjuntoMedico.obtenerSueldoMensual();
        }
        for (Enfermero obtenerConjuntoEnfermero : obtenerConjuntoEnfermero()) {
            suma = suma + obtenerConjuntoEnfermero.obtenerSueldoMensual();
        }
        sueldo = suma;
    }

    public void direccionHosp(String n) {
        direccionHosp = n;
    }

    public String obtenerNombreHospital() {
        return nombreHospital;
    }

    public Ciudad obtenerCiudadHospital() {
        return ciudadHospital;
    }

    public int obtenerNumEspecialidad() {
        return numEspecialidad;
    }

    public Medico[] obtenerConjuntoMedico() {
        return conjuntoMedico;
    }

    public Enfermero[] obtenerConjuntoEnfermero() {
        return conjuntoEnfermero;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public String obtenerDireccionHosp() {
        return direccionHosp;
    }

    @Override
    public String toString() {
        String cadena = "";

        cadena = String.format("%sHOSPITAL %s\nDirecci??n: %s\nCiudad: %s\n"
                + "Provincia: %s\nN??mero de especialidades: %d\n"
                + "Listado de m??dicos\n",
                cadena,
                obtenerNombreHospital().toUpperCase(),
                obtenerDireccionHosp(),
                obtenerCiudadHospital().obtenerNombreCiudad(),
                obtenerCiudadHospital().obtenerProvincia(),
                obtenerNumEspecialidad());
        for (int i = 0; i < obtenerConjuntoMedico().length; i++) {
            cadena = String.format("%s- %s - sueldo: %.2f - %s\n", cadena,
                    obtenerConjuntoMedico()[i].obtenerNomDoctor(),
                    obtenerConjuntoMedico()[i].obtenerSueldoMensual(),
                    obtenerConjuntoMedico()[i].obtenerEspecialidad());
        }
        cadena = String.format("%s\nListado de enfermeros(as)\n", cadena);
        for (int i = 0; i < obtenerConjuntoEnfermero().length; i++) {
            cadena = String.format("%s- %s - sueldo: %.2f - %s\n", cadena,
                    obtenerConjuntoEnfermero()[i].obtenerNombre(),
                    obtenerConjuntoEnfermero()[i].obtenerSueldoMensual(),
                    obtenerConjuntoEnfermero()[i].obtenerTipo());
        }
        cadena = String.format("%s\nTotal de sueldos a pagar por mes: %.2f",
                cadena, sueldo);
        return cadena;
    }

}
