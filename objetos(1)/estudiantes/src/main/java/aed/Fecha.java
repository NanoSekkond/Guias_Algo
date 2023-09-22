package aed;

public class Fecha {
    private int dia;
    private int mes;

    public Fecha(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
    }

    public Fecha(Fecha fecha) {
        this.dia = fecha.dia();
        this.mes = fecha.mes();
    }

    public Integer dia() {
        return dia;
    }

    public Integer mes() {
        return mes;
    }
    @Override
    public String toString() {
        return dia + "/" + mes;
    }

    @Override
    public boolean equals(Object otra) {
        if (otra == null || otra.getClass() != this.getClass()) {
            return false;
        }
        else {
            Fecha otraFecha = (Fecha) otra;
            return otraFecha.dia() == dia && otraFecha.mes() == mes;
        }
    }

    public void incrementarDia() {
        if (dia + 1 > diasEnMes(mes)) {
            dia = 1;
            if (mes == 12) {
                mes = 1;
            }
            else {
                mes += 1;
            }
        }
        else {
            dia += 1;
        }
    }

    private int diasEnMes(int mes) {
        int dias[] = {
                // ene, feb, mar, abr, may, jun
                31, 28, 31, 30, 31, 30,
                // jul, ago, sep, oct, nov, dic
                31, 31, 30, 31, 30, 31
        };
        return dias[mes - 1];
    }

}
