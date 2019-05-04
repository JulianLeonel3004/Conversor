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
public class ConversorCelsiusFahren extends Conversor
{

    @Override
    public double toB(double Celsius) 
    {
        return (Celsius * 9/5) + 32 ;
    }

    @Override
    public double toA(double Fahrenheit) {
        return (Fahrenheit - 32) * 5/9 ;
    }

    @Override
    public String nameA() 
    {
        return "Celsius";
    }

    @Override
    public String nameB() {
        return "Fahrenheit";
    }
    
}
