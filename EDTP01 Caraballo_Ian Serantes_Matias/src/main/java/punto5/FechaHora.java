package punto5;

public class FechaHora {

    private int dia;
    private int mes;
    private int anio;
    private int hora;
    private int minuto;
    private int segundo;

    public FechaHora() {
    }

    public FechaHora(int dia, int mes, int anio, int hora, int minuto, int segundo) {
        if (mes > 0 && mes <= 12) {
            this.mes = mes;
        }
        if (anio > 0) {
            this.anio = anio;
        }
        
        
        switch (this.mes) {
            case 1:
                if (dia >= 1 && dia <= 31) {
                    this.dia = dia;
                }
                break;
            case 2:
                if (mes == 2 && dia == 29 && anio % 400 == 0) {
                    if (dia >= 1 && dia <= 29) {
                        this.dia = dia;

                    } else if (dia >= 1 && dia <= 28) {
                        this.dia = dia;
                    }
                }
                break;
            case 3:
                if (dia >= 1 && dia <= 31) {
                    this.dia = dia;
                }
                break;
            case 4:
                if (dia >= 1 && dia <= 30) {
                    this.dia = dia;
                }
                break;
            case 5:
                if (dia >= 1 && dia <= 31) {
                    this.dia = dia;
                }
                break;
            case 6:
                if (dia >= 1 && dia <= 30) {
                    this.dia = dia;
                }
                break;
            case 7:
                if (dia >= 1 && dia <= 31) {
                    this.dia = dia;
                }
                break;
            case 8:
                if (dia >= 1 && dia <= 31) {
                    this.dia = dia;
                }
                break;
            case 9:
                if (dia >= 1 && dia <= 30) {
                    this.dia = dia;
                }
                break;
            case 10:
                if (dia >= 1 && dia <= 31) {
                    this.dia = dia;
                }
                break;
            case 11:
                if (dia >= 1 && dia <= 30) {
                    this.dia = dia;
                }
                break;
            case 12:
                if (dia >= 1 && dia <= 31) {
                    this.dia = dia;
                }
                break;
        }
        
        if (hora >= 1 && hora < 25) {
            this.hora = hora;
        }

        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        }
        if (segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
        }

    }

    @Override
    public String toString() {
        return "FechaHora{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + ", hora=" + hora + ", minuto=" + minuto + ", segundo=" + segundo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FechaHora other = (FechaHora) obj;
        if (this.dia != other.dia) {
            return false;
        }
        if (this.mes != other.mes) {
            return false;
        }
        if (this.anio != other.anio) {
            return false;
        }
        if (this.hora != other.hora) {
            return false;
        }
        if (this.minuto != other.minuto) {
            return false;
        }
        if (this.segundo != other.segundo) {
            return false;
        }
        return true;
    }

    public int getHora() {
        if (hora == 24) {
            return 00;
        } else {
            return hora;
        }
    }

    public void setHora(int hora) {
        if (hora >= 1 && hora < 25) {
            this.hora = hora;
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        switch (this.mes) {
            case 1:
                if (dia >= 1 && dia <= 31) {
                    this.dia = dia;
                }
                break;
            case 2:
                if (mes == 2 && dia == 29 && anio % 400 == 0) {
                    if (dia >= 1 && dia <= 29) {
                        this.dia = dia;

                    } else if (dia >= 1 && dia <= 28) {
                        this.dia = dia;
                    }
                }
                break;
            case 3:
                if (dia >= 1 && dia <= 31) {
                    this.dia = dia;
                }
                break;
            case 4:
                if (dia >= 1 && dia <= 30) {
                    this.dia = dia;
                }
                break;
            case 5:
                if (dia >= 1 && dia <= 31) {
                    this.dia = dia;
                }
                break;
            case 6:
                if (dia >= 1 && dia <= 30) {
                    this.dia = dia;
                }
                break;
            case 7:
                if (dia >= 1 && dia <= 31) {
                    this.dia = dia;
                }
                break;
            case 8:
                if (dia >= 1 && dia <= 31) {
                    this.dia = dia;
                }
                break;
            case 9:
                if (dia >= 1 && dia <= 30) {
                    this.dia = dia;
                }
                break;
            case 10:
                if (dia >= 1 && dia <= 31) {
                    this.dia = dia;
                }
                break;
            case 11:
                if (dia >= 1 && dia <= 30) {
                    this.dia = dia;
                }
                break;
            case 12:
                if (dia >= 1 && dia <= 31) {
                    this.dia = dia;
                }
                break;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes > 0 && mes <= 12) {
            this.mes = mes;
        }
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        if (anio > 0) {
            this.anio = anio;
        }
    }

}
