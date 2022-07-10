package logeoproyect;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class hiloHora {
    int hora;
    int minuto;
    
    //constructor
    public hiloHora(int hora, int minuto ) {

        this.hora = hora;
        this.minuto = minuto;
    }
    public void run() {
        boolean estado = true;
         while (estado) {

            // estoy capturando la hora del sistema
            Calendar fechaSis = new GregorianCalendar();

            int horaSis = fechaSis.get(Calendar.HOUR_OF_DAY);
            int minutoSis = fechaSis.get(Calendar.MINUTE);
        
             if (hora == horaSis && minuto == minutoSis) {
                    //mostramos un mensaje a la hora que suene la alarma

                    JOptionPane.showMessageDialog(null, "Hora de tomar su medicamento\n");
                    estado= false;

            }

        }
    } public void start() {
        new Thread((Runnable) this).start();
    }
}

