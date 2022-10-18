package ejerciciossemana06;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author User
 */
public class ejercicio07 {
    public static void main(String[] args)
{
    int base=2;
    int exp=0;
    System.out.println(base+" elevado a "+exp+" = "+poten(base, exp));
}
//método que devuelve base elevado a exp
//ejemplo: base = 2 y exp = 4 -> 4
static int poten(int base, int exp)
{
        return switch (exp) {
            case 0 -> 1;
            case 1 -> base;
            default -> base * poten(base,exp-1);
        }; // cualquier número elevado a cero es 1
}
}
