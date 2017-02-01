/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package items;

/**
 *
 * @author SENA
 */
public interface IVisulizable {
    public void marcarVisto(String tvisualizado);
    public boolean esVisto();
    public String tiempoVisto();
}
