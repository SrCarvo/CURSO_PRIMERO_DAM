

namespace _1__PruebasUnitarias
{ 
    public class Usuario
    {
        public bool CheckPassword(string password)
        {
         // El usuario crea una contraseña, entre 7 y 12 caracteres, al menos un número y una mayúscula

        bool _passwordCond = false;

            if (string.IsNullOrEmpty(password))
            {
                Console.WriteLine("El texto es nulo o está vacío");
                return _passwordCond;
            }
            else
            {
                int _longitud = password.Length;
                if (_longitud >= 7 && _longitud <= 12)
            {

        bool _contieneNumero = password.Any<char>(char.IsDigit);
            if (_contieneNumero)
            {
                bool _contieneMayus = password.Any<char>(char.IsUpper);
                    if (!_contieneMayus)
                    {
                        Console.WriteLine("La contraseña no contiene ninguna letra mayuscula : " + password);
                        return _passwordCond;
                    }
                    else
                    {
                        _passwordCond = true;
                        return _passwordCond;
                    }


            }
            else
            {
                Console.WriteLine("La contraseña no contiene ningún número : " + password);
                return _passwordCond;
            }


        }
        else
        {
            Console.WriteLine("La contraseña excede o no tiene la suficiente longitud : " + _longitud);
            return _passwordCond;
        }
    }

}
        public void CheckDNI(string _dniLeido)
        {
            try
            {

                if (_dniLeido.Length != 9) //EL DNI DEBE SER DE 9 CARACTERES
                {
                    Console.WriteLine("El DNI no tiene el tamaño adecuado");
                }
                else
                {
                    string _dniNumeros = _dniLeido.Substring(0, _dniLeido.Length - 1); //DIVIDIMOS EL DNI, CON LOS NÚMEROS
                    string _dniLetra = _dniLeido.Substring(_dniLeido.Length - 1, 1);//DIVIDIMOS EL DNI, CON LA LETRA
                    int _dni = int.Parse(_dniNumeros); //CONVERTIMOSMEL DNI A UN NÚMERO ENTERO
                    Console.WriteLine("Números de DNI : " + _dniNumeros);
                    Console.WriteLine("Letra del DNI : " + _dniLetra);
                }


            }
            catch (ArgumentNullException e)
            {
                Console.WriteLine("Valor nulo en el DNI: " + e.Message);
            }
            catch (FormatException e)
            {
                Console.WriteLine("El DNI no tiene el formato adecuado: " + e.Message);
            }
            catch (ArgumentOutOfRangeException e)
            {
                Console.WriteLine("Fuera de rango al calcular el dni: " + e.Message);
            }
        }
    }


}