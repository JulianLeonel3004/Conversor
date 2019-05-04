/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

/**
 *
 * @author veronica
 */
public class ConversorHoraMin extends Conversor
{

    @Override
    public double toB(double hora) 
    {
        return hora * 60;
    }

    @Override
    public double toA(double minutos) {
        return minutos / 60;
    }

    @Override
    public String nameA() 
    {
        return "Hora";
    }

    @Override
    public String nameB() 
    {
        return "Minutos";
    }
    
}
