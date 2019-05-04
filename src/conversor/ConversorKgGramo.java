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
public class ConversorKgGramo extends Conversor
{

    @Override
    public double toB(double Kilogramo) 
    {
        return Kilogramo * 1000 ;
    }

    @Override
    public double toA(double Gramo) 
    {
        return Gramo / 1000;
    }

    @Override
    public String nameA() 
    {
        return "Kilogramo";
    }

    @Override
    public String nameB() 
    {
        return "Gramo";
    }
    
}
