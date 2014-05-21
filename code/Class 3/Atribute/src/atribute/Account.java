/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atribute;

/**
 *
 * @author Home
 */
public class Account {

    private double saldoinicial;
    private boolean hayError;

    public Account() {
        saldoinicial = 0;
        hayError = false;
    }

    /**
     * este metodo sirve para aumentar la cuenta de un usuario
     *
     * @param monto Parametro para recibir el nuevo monto
     */
    public void Deposito(double monto) {
        setSaldoinicial(getSaldoinicial() + monto);
    }

    /**
     * este metodo sirve para disminuir la cuenta de un usuario
     *
     * @param monto Parametro para recibir le nuevo monto
     */
    public void Retiro(double monto) {
        if (getSaldoinicial() >= monto) {
            setSaldoinicial(getSaldoinicial() - monto);
        } else {
            setHayError(true);
        }

    }

    /**
     * @return the saldoinicial
     */
    public double getSaldoinicial() {
        return saldoinicial;
    }

    /**
     * @param saldoinicial the saldoinicial to set
     */
    public void setSaldoinicial(double saldoinicial) {
        this.saldoinicial = saldoinicial;
    }

    /**
     * @return the hayError
     */
    public boolean isHayError() {
        return hayError;
    }

    /**
     * @param hayError the hayError to set
     */
    public void setHayError(boolean hayError) {
        this.hayError = hayError;
    }

}

