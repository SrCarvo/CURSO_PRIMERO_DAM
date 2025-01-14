using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _1__PruebasUnitarias
{
    public class Calculadora
    {
        public int Sumar(int a, int b)
        {
            return a + b;
        }

        public int Restar(int a, int b)
        {
            return a - b;
        }

        public bool ComprobarContraseña(string contraseña)
        {
            // Verificar que el tamaño sea menor que 12
            if (contraseña.Length >= 12)
            {
                return false;
            }

            // Verificar que contenga al menos un número
            bool contieneNumero = contraseña.Any(char.IsDigit);

            // Verificar que contenga al menos una letra mayúscula
            bool contieneMayuscula = contraseña.Any(char.IsUpper);

            // Verificar que contenga al menos un acarcter especial
            bool contieneSimbol = contraseña.Any(char.IsSymbol) || contraseña.Any(char.IsPunctuation);


            // Retornar verdadero solo si cumple todas las condiciones
            return contieneNumero && contieneMayuscula && contieneSimbol;
        }
    }
}
