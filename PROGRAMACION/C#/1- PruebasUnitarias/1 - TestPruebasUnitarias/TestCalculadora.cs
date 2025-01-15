
using _1__PruebasUnitarias;
using NUnit.Framework;

namespace _1___TestPruebasUnitarias
{
    [TestFixture]
    public class TestCalculadora
    {
        private Calculadora Calculadora;

        [SetUp]
        public void SetUp()
        {
            Calculadora = new Calculadora();
        }

        [Test]
        public void Sumar_DosNumeros_ReturnCorrect()
        {
            // Arrange - declarar las variables
            int n1 = 2;
            int n2 = 3;

            // Act - metodo a probar - sumar y el resultado
            // lo guardamos en la variable result
            int result = Calculadora.Sumar(n1, n2);

            // Assert (ver metodo equals de ASSERT, explica como usar THAT)
            //2- ver clase IS
            Assert.That<int>(result, Is.EqualTo(5));
        }

        [TestCase(1, 2)]
        [TestCase(1, -2)]
        [TestCase(1, 3)]
        public void Sumar_DosNumeros_ReturnCorrectP2(int n1, int n2)
        {

            // Act - metodo a probar - sumar y el resultado
            // lo guardamos en la variable result
            int result = Calculadora.Sumar(n1, n2);

            // Assert (ver metodo equals de ASSERT, explica como usar THAT)
            //2- ver clase IS
            Assert.That<int>(result, Is.EqualTo(n1 + n2));
        }

        [Test]
        public void Restar_DosNumeros_ReturnCorrect()
        {
            // Arrange - declarar las variables
            int n1 = 5;
            int n2 = 3;

            // Act - metodo a probar 
            int result = Calculadora.Restar(n1, n2);

            // Assert (ver metodo equals de ASSERT, explica como usar THAT)
            //2- ver clase IS
            Assert.That<int>(result, Is.EqualTo(2));
        }

        [TestCase("Pass123!", true)]
        [TestCase("123456", false)]
        [TestCase("password", false)]
        [TestCase("PASSWORD123", false)]
        [TestCase("Password123!", false)] // Contraseña que excede el límite de 12 caracteres
        [TestCase("Pass1234!", true)]
        public void ComprobarContraseña_ValidarContraseña_ReturnCorrect(string contraseña, bool expectedResult)
        {
            // Act - metodo a probar
            bool result = Calculadora.ComprobarContraseña(contraseña);

            // Assert
            Assert.That(result, Is.EqualTo(expectedResult));
        }
        public void ComprobarDividirEsExcepcion(int dividendo, int divisor)
        {
            int result = Calculadora.Dividir(dividendo, divisor);
            Assert.That<int>(result, Is.EqualTo(dividendo / divisor));
        }
    }
}



//[Test]
//public void Restar_CuandoRestaDosNumeros_ReturnCorrect(int n1, int n2)
//{
//    //// Arrange
//    //int numero1 = 10;
//    //int numero2 = 4;

//    // Act
//    int result = _calculadoraTest.Restar(n1, n2);

//    // Assert
//    Assert.That(result, Is.True, $@"El resultado debe ser la resta de {n1} y {n2}");
//}

