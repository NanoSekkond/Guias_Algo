package aed;

import java.util.Vector;

public class Agenda {
    private Fecha fecha;
    private Recordatorio[] recordatorios;

    public Agenda(Fecha fechaActual) {
        this.fecha = new Fecha(fechaActual.dia(), fechaActual.mes());
        this.recordatorios = new Recordatorio[0];
    }

    public void agregarRecordatorio(Recordatorio recordatorio) {
        Recordatorio[] newRecordatorios = new Recordatorio[recordatorios.length + 1];
        for (int j = 0; j < recordatorios.length; j++) {
            newRecordatorios[j] = recordatorios[j];
        }
        newRecordatorios[recordatorios.length] = new Recordatorio(recordatorio.mensaje(), recordatorio.fecha(), recordatorio.horario());
        recordatorios = newRecordatorios.clone();
    }

    @Override
    public String toString() {
        String texto = fecha + "\n=====\n";
        for (int i = 0; i < recordatorios.length; i++) {
            if (fecha.equals(recordatorios[i].fecha())) {
                texto += recordatorios[i] + "\n";
            }
        }
        return texto;
    }

    public void incrementarDia() {
        fecha.incrementarDia();
    }

    public Fecha fechaActual() {
        return fecha;
    }

}
