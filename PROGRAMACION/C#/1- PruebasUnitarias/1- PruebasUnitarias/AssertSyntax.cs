using NUnit.Framework;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _1__PruebasUnitarias
{

    internal class AssertSyntax
    {
        [Test]
        public void IsNull()
        {
            Object obj = new Object();
            //comprobar si es nulo
            Assert.That(obj, Is.Null);
            //comprobar si no es nulo
            Assert.That(obj, Is.Not.Null);
        }
        // <sumary>
        // Not A Number
        // </sumary>
        [Test]
        public void ComprobarNaN()
        {
            double number = double.NaN;
            //comprobar si es NaN
            Assert.That(number, Is.NaN);

        }
        [Test]
        public void ComprobarValoresVacios()
        {
            string cadena = string.Empty;
            //comprobar si es vacio
            Assert.That(cadena, Is.Empty);
            //comprobar si no es vacio
            Assert.That(cadena, Is.Not.Empty);

            int[] arrayN = new int[] { 1, 2, 3 };
            //comprobar si es vacio
            Assert.That(arrayN, Is.Empty);
            //comprobar si no es vacio
            Assert.That(arrayN, Is.Not.Empty);

        }
        [Test]
        public void ComprobarTipos()
        {
            //Comprobar que el tipo es String
            Assert.That("Hello!!!", Is.TypeOf<string>());
            Assert.That("Hello!!!", Is.TypeOf(typeof(string)));
            //Comprobar que el tipo NO es String
            Assert.That("Hello!!!", Is.Not.TypeOf<string>());
            Assert.That("Hello!!!", Is.Not.TypeOf(typeof(string)));
        }
        [Test]
        public void PruebasConCadenas()
        {
            string frase = "Hola Mundo";
            string[] arrayFrase = { "abd", "bad", "dba" };

            //Contiene o no contiene la palabra en el array
            //distingue entre mayusculas y minusculas
            Assert.That(frase ,Does.Contain("frase"));
            Assert.That(frase, Does.Not.Contain("frase"));
            //Ignora mayusculas y minusculas
            Assert.That(frase, Does.Contain("frase").IgnoreCase);
            //Ignora espacios en blanco
            Assert.That(frase, Does.Not.Contain("boot").IgnoreWhiteSpace);

            //Comprobar que TODOS los elementos del array tienen la palabra
            Assert.That(arrayFrase, Is.All.Contain("b"));
        }
    }
}
